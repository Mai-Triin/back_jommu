package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercise.Exercise;
import ee.valiit.back_jommu.domain.exercise.ExerciseMapper;
import ee.valiit.back_jommu.domain.exercise.ExerciseRequest;
import ee.valiit.back_jommu.domain.exercise.ExerciseService;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplate;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateMapper;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateService;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupService;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExerciseTemplateTableDto;
import ee.valiit.back_jommu.domain.userrole.user.User;
import ee.valiit.back_jommu.domain.userrole.user.UserService;
import ee.valiit.back_jommu.domain.workoutplan.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkoutService {
   @Resource
   private ExerciseTemplateService exerciseTemplateService;

   @Resource
   private WorkoutPlanService workoutPlanService;

    @Resource
    private WorkoutPlanMapper workoutPlanMapper;

    @Resource
    private UserService userService;

    @Resource
    private ExerciseMapper exerciseMapper;

    @Resource
    private ExerciseTemplateMapper exerciseTemplateMapper;

    @Resource
    private ExTempMuscleGroupService exTempMuscleGroupService;

    @Resource
    private ExerciseService exerciseService;

    public List<ExerciseTemplateDto> getAllExerciseInfo() {
        List<ExerciseTemplateDto> allExerciseInfo = exerciseTemplateService.getAllExerciseInfo();
        return allExerciseInfo;
    }

    public List<ExerciseTemplateTableDto> getAllExerciseTempTableInfo() {
        List<ExerciseTemplateTableDto> tempTableInfo = exTempMuscleGroupService.getAllExerciseTempTableInfo();
        return tempTableInfo;
    }

    public WorkoutPlanResponse addWorkoutPlanInfo(WorkoutPlanRequest request) {
        WorkoutPlan workoutPlan = workoutPlanMapper.toWorkoutPlan(request);
        User user = userService.findById(request.getUserId());
        workoutPlan.setUser(user);
        workoutPlanService.addWorkoutPlanInfo(workoutPlan);

        WorkoutPlan workoutPlanEntity = workoutPlanService.findById(workoutPlan.getId());
        WorkoutPlanResponse workoutPlanResponse = workoutPlanMapper.toWorkoutPlanDto(workoutPlanEntity);
        return workoutPlanResponse;
    }

    public List<WorkoutPlanResponse> getAllWorkoutPlanInfo() {
        List<WorkoutPlanResponse> allWorkoutPlanInfo = workoutPlanService.getAllWorkoutPlanInfo();
        return allWorkoutPlanInfo;
    }

    public void addExerciseInfo(ExerciseRequest request) {
        ExerciseTemplate exerciseTemplate = exerciseTemplateMapper.toExerciseTemplate(request);
        Exercise exercise = exerciseMapper.toExercise(request);
        WorkoutPlan workoutPlanEntity = workoutPlanService.findById(request.getWorkoutPlanId());
        exercise.setWorkoutPlan(workoutPlanEntity);
        exercise.setExerciseTemplate(exerciseTemplate);
        exerciseService.addExercise(exercise);


    }
}
