package ee.valiit.back_jommu.domain.musclegroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link MuscleGroup} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MuscleGroupDto implements Serializable {
    private Integer muscleId;
    @Size(max = 255)
    @NotNull
    private String muscleName;
}