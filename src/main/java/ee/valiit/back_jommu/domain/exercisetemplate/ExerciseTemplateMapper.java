package ee.valiit.back_jommu.domain.exercisetemplate;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExerciseTemplateMapper {

    @Mapping(source = "id", target = "exerciseTempId")
    @Mapping(source = "name", target = "exerciseTempName")
    ExerciseTemplateDto toTempDto(ExerciseTemplate exerciseTemplate);

    List<ExerciseTemplateDto> toTempDtos(List<ExerciseTemplate> templates);

}
