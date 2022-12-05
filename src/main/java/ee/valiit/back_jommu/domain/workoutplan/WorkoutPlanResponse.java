package ee.valiit.back_jommu.domain.workoutplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link WorkoutPlan} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutPlanResponse implements Serializable {
    private Integer workoutPlanId;
    @Size(max = 255)
    @NotNull
    private String workoutPlanName;
    @Size(max = 1)
    @NotNull
    private String status;
}