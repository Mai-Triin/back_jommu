package ee.valiit.back_jommu.domain.musclegroup;

import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MuscleGroupMapper {

    @Mapping(source = "id", target = "muscleId")
    @Mapping(source = "name", target = "muscleName")
    MuscleGroupDto toMuscleGroupDto(MuscleGroup muscleGroup);

    List<MuscleGroupDto> toMuscleGroupDtos(List<MuscleGroup> muscleGroups);
//
//    @Mapping(source = "id", target = "muscleGroupId")
//    @Mapping(source = "name", target = "muscleGroupName")
//    ExTempMuscleGroupDto toExTempMuscleGroupDto(MuscleGroup muscleGroup);
//
//    List<ExTempMuscleGroupDto> toExTempMuscleGroupDtos(List<MuscleGroup> muscleGroups);


}
