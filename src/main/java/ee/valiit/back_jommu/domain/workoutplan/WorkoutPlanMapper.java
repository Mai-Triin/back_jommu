package ee.valiit.back_jommu.domain.workoutplan;

import ee.valiit.back_jommu.domain.exercise.Exercise;
import ee.valiit.back_jommu.domain.exercise.WorkoutPlanExerciseDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WorkoutPlanMapper {

    @Mapping(constant = "A",target = "status")
    @Mapping(source = "workoutPlanName",target = "name")
    WorkoutPlan toWorkoutPlan(WorkoutPlanRequest workoutPlanRequest);


    @Mapping(source = "name", target = "workoutPlanName")
    @Mapping(source = "id", target = "workoutPlanId")
    WorkoutPlanResponse toWorkoutPlanDto(WorkoutPlan workoutPlan);

    List<WorkoutPlanResponse> toWorkoutPlanDtos(List<WorkoutPlan> workoutPlans);

    @Mapping(source = "id", target = "workoutPlanId")
    @Mapping(source = "name", target = "workoutPlanName")
    WorkoutPlanExerciseDto toWorkoutPlanExerciseDto(WorkoutPlan exercise);

    List<WorkoutPlanExerciseDto> toWorkoutPlanExerciseDtos(List<WorkoutPlan> exercises);

    @Mapping(source = "name", target = "workoutPlanName")
    WorkoutPlanNameDto toWorkoutPlanNameDto(WorkoutPlan workoutPlan);

    List<WorkoutPlanNameDto> toWorkoutPlanNameDtos(List<WorkoutPlan> workoutPlans);





}
