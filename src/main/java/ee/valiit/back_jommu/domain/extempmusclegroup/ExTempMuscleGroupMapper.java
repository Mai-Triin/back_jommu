package ee.valiit.back_jommu.domain.extempmusclegroup;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExTempMuscleGroupMapper {
    @Mapping(source = "id", target = "exTempMuscleGroupId")
    @Mapping(source = "exerciseTemplate.id", target = "exerciseTemplateId")
    @Mapping(source = "exerciseTemplate.name", target = "exerciseTemplateName")
    @Mapping(source = "exerciseTemplate.description", target = "exerciseTemplateDescription")
    @Mapping(source = "exerciseTemplate.imgData", target = "exerciseTemplateImgData")
    @Mapping(source = "muscleGroup.id", target = "muscleGroupId")
    @Mapping(source = "muscleGroup.name", target = "muscleGroupName")
    ExTempMuscleGroupDto toExTempMuscleGroupDto(ExTempMuscleGroup exTempMuscleGroup);

    List<ExTempMuscleGroupDto> toExTempMuscleGroupDtos(List<ExTempMuscleGroup> exTempMuscleGroups);

}
