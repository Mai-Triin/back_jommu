package ee.valiit.back_jommu.domain.extempmusclegroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseTemplateTableDto {

    private Integer exerciseTemplateId;
    @Size(max = 255)
    @NotNull
    private String exerciseTemplateName;
    @Size(max = 255)
    @NotNull
    private String muscleGroupName;
}

