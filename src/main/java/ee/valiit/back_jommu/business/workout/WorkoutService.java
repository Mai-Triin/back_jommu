package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateService;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupService;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExerciseTemplateTableDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkoutService {
   @Resource
   private ExerciseTemplateService exerciseTemplateService;



    @Resource
    private ExTempMuscleGroupService exTempMuscleGroupService;

    public List<ExerciseTemplateDto> getAllExerciseInfo() {
        List<ExerciseTemplateDto> allExerciseInfo = exerciseTemplateService.getAllExerciseInfo();
        return allExerciseInfo;
    }

    public List<ExerciseTemplateTableDto> getAllExerciseTempTableInfo() {
        List<ExerciseTemplateTableDto> tempTableInfo = exTempMuscleGroupService.getAllExerciseTempTableInfo();
        return tempTableInfo;
    }
}
