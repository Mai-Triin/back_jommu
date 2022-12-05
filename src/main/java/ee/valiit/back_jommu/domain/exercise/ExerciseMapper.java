package ee.valiit.back_jommu.domain.exercise;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExerciseMapper {

    @Mapping(source = "workoutPlanId", target = "workoutPlan.id")
    @Mapping(source = "exerciseTemplateId", target = "exerciseTemplate.id")
    @Mapping(constant = "A", target = "status")
    Exercise toExercise(ExerciseRequest exerciseRequest);


}
