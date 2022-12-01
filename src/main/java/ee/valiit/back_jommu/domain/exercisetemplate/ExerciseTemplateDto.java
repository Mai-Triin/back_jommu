package ee.valiit.back_jommu.domain.exercisetemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link ExerciseTemplate} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseTemplateDto implements Serializable {
    private Integer exerciseTempId;
    @Size(max = 255)
    @NotNull
    private String exerciseTempName;
    @NotNull
    private String description;
    @NotNull
    private byte[] imgData;
}