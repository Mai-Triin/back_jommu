package ee.valiit.back_jommu.domain.exercise;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExerciseMapper {

    @Mapping(source = "workoutPlanId", target = "workoutPlan.id")
    @Mapping(source = "exerciseTemplateId", target = "exerciseTemplate.id")
    @Mapping(constant = "A", target = "status")
    Exercise toExercise(ExerciseRequest exerciseRequest);

    @Mapping(source = "id", target = "exerciseId")
    @Mapping(source = "workoutPlan.id", target = "workoutPlanId")
    @Mapping(source = "workoutPlan.name", target = "workoutPlanName")
    @Mapping(source = "exerciseTemplate.id", target = "exerciseTemplateId")
    @Mapping(source = "exerciseTemplate.name", target = "exerciseTemplateName")
    ExerciseDto toExerciseDto(Exercise exercise);

    List<ExerciseDto> toExerciseDtos(List<Exercise> exercises);

    @Mapping(source = "exerciseId", target = "id")
    @Mapping(source = "exerciseStatus", target = "status")
    Exercise toExercise(ExerciseDisableDto exerciseDisableDto);


}
