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
public class WorkoutPlanRequest implements Serializable {
    @Size(max = 255)
    @NotNull
    private String workoutPlanName;
    private Integer userId;
}