package ee.valiit.back_jommu.domain.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Exercise} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseRequest implements Serializable {
    private Integer workoutPlanId;
    private Integer exerciseTemplateId;
    @NotNull
    private Integer reps;
    @NotNull
    private Integer sets;
    @NotNull
    private Integer weight;
}