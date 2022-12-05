package ee.valiit.back_jommu.domain.exercise;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplate;
import ee.valiit.back_jommu.domain.workoutplan.WorkoutPlan;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "workout_plan_id", nullable = false)
    private WorkoutPlan workoutPlan;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "exercise_template_id", nullable = false)
    private ExerciseTemplate exerciseTemplate;

    @NotNull
    @Column(name = "reps", nullable = false)
    private Integer reps;

    @NotNull
    @Column(name = "sets", nullable = false)
    private Integer sets;

    @NotNull
    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Size(max = 1)
    @NotNull
    @Column(name = "status", nullable = false, length = 1)
    private String status;

}