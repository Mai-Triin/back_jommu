package ee.valiit.back_jommu.domain.extempmusclegroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link ExTempMuscleGroup} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExTempMuscleGroupDto implements Serializable {
    private Integer exTempMuscleGroupId;
    private Integer exerciseTemplateId;
    @Size(max = 255)
    @NotNull
    private String exerciseTemplateName;
    @NotNull
    private String exerciseTemplateDescription;
    @NotNull
    private byte[] exerciseTemplateImgData;
    private Integer muscleGroupId;
    @Size(max = 255)
    @NotNull
    private String muscleGroupName;
}