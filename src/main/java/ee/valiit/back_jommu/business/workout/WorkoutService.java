package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateService;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupDto;
import ee.valiit.back_jommu.domain.extempmusclegroup.ExTempMuscleGroupService;
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

    public List<ExTempMuscleGroupDto> getAllExTempMuscleInfo() {
        List<ExTempMuscleGroupDto> allExTempMuscleInfo = exTempMuscleGroupService.getAllExTempMuscleInfo();
        return allExTempMuscleInfo;
    }
}
