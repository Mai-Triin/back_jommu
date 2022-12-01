package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WorkoutController {

    @Resource
    private WorkoutService workoutService;



    @GetMapping("/exercise/info")
    @Operation(summary = "Leiab kõik harjutused andmebaasist")
    public List<ExerciseTemplateDto> getAllExerciseInfo(){
        List<ExerciseTemplateDto> allExerciseInfo = workoutService.getAllExerciseInfo();
        return allExerciseInfo;
    }

}
