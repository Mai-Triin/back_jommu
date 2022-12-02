package ee.valiit.back_jommu.domain.exercisetemplate;

import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupDto;
import ee.valiit.back_jommu.domain.musclegroup.MuscleGroup;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExerciseTemplateMapper {

    @Mapping(source = "id", target = "exerciseTempId")
    @Mapping(source = "name", target = "exerciseTempName")
    ExerciseTemplateDto toTempDto(ExerciseTemplate exerciseTemplate);

    List<ExerciseTemplateDto> toTempDtos(List<ExerciseTemplate> templates);
//
//    @Mapping(source = "id", target = "exerciseTemplateId")
//    @Mapping(source = "name", target = "exerciseTemplateName")
//    ExTempMuscleGroupDto toExTempMuscleGroupDto(ExerciseTemplate exerciseTemplate);
//
//    List<ExTempMuscleGroupDto> toExTempMuscleGroupDtos(List<ExerciseTemplate> exerciseTemplates);






}
