package ee.valiit.back_jommu.domain.exercisetemplate;

import ee.valiit.back_jommu.business.picture.PictureDto;
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

    @Mapping(source = "id", target = "exerciseTempId")
    @Mapping(source = "imgData", target = "imgData", qualifiedByName = "byteArrayToString")
    PictureDto toPicDto(ExerciseTemplate exerciseTemplate);

    @Named("byteArrayToString")
    static String byteArrayToString(byte[] imgDataAsByteArray) {
        if (imgDataAsByteArray == null) {
            return null;
        }

        String imgDataAsString = new String(imgDataAsByteArray);
        return imgDataAsString;
    }
}
