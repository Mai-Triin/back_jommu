package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercise.ExerciseDisableDto;
import ee.valiit.back_jommu.domain.exercise.ExerciseDto;
import ee.valiit.back_jommu.domain.exercise.ExerciseRequest;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExerciseTemplateTableDto;
import ee.valiit.back_jommu.domain.musclegroup.MuscleGroupDto;
import ee.valiit.back_jommu.domain.workoutplan.WorkoutPlanRequest;
import ee.valiit.back_jommu.domain.workoutplan.WorkoutPlanResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class WorkoutController {

    @Resource
    private WorkoutService workoutService;


    @GetMapping("/exercise/info")
    @Operation(summary = "Leiab kõik harjutused andmebaasist")
    public List<ExerciseTemplateDto> getAllExerciseInfo() {
        List<ExerciseTemplateDto> allExerciseInfo = workoutService.getAllExerciseInfo();
        return allExerciseInfo;
    }

    @GetMapping("/extempmusclegroup")
    @Operation(summary = "Leiab kõik harjutused ja lihasgrupid")
    public List<ExerciseTemplateTableDto> getAllExerciseTempTableInfo() {
        List<ExerciseTemplateTableDto> tempTableInfo = workoutService.getAllExerciseTempTableInfo();
        return tempTableInfo;
    }

    @PostMapping("/workoutplan/info")
    @Operation(summary = "Lisab workoutPlan tabelisse workoutPlan info ")
    public WorkoutPlanResponse addWorkoutPlanInfo(@RequestBody WorkoutPlanRequest request) {
        return workoutService.addWorkoutPlanInfo(request);
    }

    @GetMapping("/allworkoutplan/info")
    @Operation(summary = "Leiab workoutPlan tabelisse lisatud treeningkavad dropdown-i jaoks")
    //siia lisa find by user id
    public List<WorkoutPlanResponse> getAllWorkoutPlanInfo(@RequestParam Integer userId) {
        List<WorkoutPlanResponse> allWorkoutPlanInfo = workoutService.getAllWorkoutPlanInfo(userId);
        return allWorkoutPlanInfo;
    }

    @PostMapping("/exercise/additional/info")
    @Operation(summary = "Lisab exercise tabelisse harjutuste info")
    public void addExerciseInfo(@RequestBody ExerciseRequest request) {
        workoutService.addExerciseInfo(request);
    }

    @GetMapping("/exercise/table/info")
    @Operation(summary = "Leiab exercise tabelist harjutuste täiendatud info")
    public List<ExerciseDto> getAllExerciseTableInfo(@RequestParam Integer workoutPlanId) {
        return workoutService.getAllExerciseTableInfo(workoutPlanId);
    }

    @PatchMapping("/disable/exercise/info")
    @Operation(summary = "Muudab exercise tabelis välja 'status' ära disable-iks ehk 'D'")
    public void disableExerciseinfo(@RequestBody ExerciseDisableDto request) {
        workoutService.disableExerciseInfo(request);
    }

    @GetMapping("/all/musclegroups")
    @Operation(summary = "Leiab kõik lihasgrupid (nupud")
    public List<MuscleGroupDto> getAllMuscleGroups() {
        List<MuscleGroupDto> allMuscleGroups = workoutService.getAllMuscleGroups();
        return allMuscleGroups;
    }

    @GetMapping("/extemp/bymusclegroupid")
    @Operation(summary = "Leiab harjutused vastava lihasgrupi id-le")
    public List<ExTempMuscleGroupDto> getExTempByMuscleGroupId(@RequestParam Integer muscleGroupId) {
        List<ExTempMuscleGroupDto> exTempByMuscleGroupId = workoutService.getExTempByMuscleGroupId(muscleGroupId);
        return exTempByMuscleGroupId;
    }

}
