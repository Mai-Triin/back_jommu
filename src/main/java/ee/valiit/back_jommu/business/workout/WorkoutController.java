package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExerciseTemplateTableDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
