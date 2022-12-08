package ee.valiit.back_jommu.domain.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link Exercise} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutPlanExerciseDto implements Serializable {

    private Integer workoutPlanId;
    @Size(max = 255)
    @NotNull
    private String workoutPlanName;
    private List<ExerciseDto> exercises;

//    private Integer exerciseId;
//    private Integer workoutPlanId;
//    @Size(max = 255)
//    @NotNull
//    private String workoutPlanName;
//    @Size(max = 1)
//    @NotNull
//    private String workoutPlanStatus;
//    private Integer exerciseTemplateId;
//    @Size(max = 255)
//    @NotNull
//    private String exerciseTemplateName;
//    @NotNull
//    private Integer reps;
//    @NotNull
//    private Integer sets;
//    @NotNull
//    private Integer weight;
//    @Size(max = 1)
//    @NotNull
//    private String exerciseStatus;
}