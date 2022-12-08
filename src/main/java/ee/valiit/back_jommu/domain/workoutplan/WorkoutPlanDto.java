package ee.valiit.back_jommu.domain.workoutplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link WorkoutPlan} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutPlanDto implements Serializable {
    private Integer workoutPlanId;

}