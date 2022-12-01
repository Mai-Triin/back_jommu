package ee.valiit.back_jommu.business.workout;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseService;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkoutService {
   @Resource
   private ExerciseService exerciseService;

    public List<ExerciseTemplateDto> getAllExerciseInfo() {
        List<ExerciseTemplateDto> allExerciseInfo = exerciseService.getAllExerciseInfo();
        return allExerciseInfo;
    }
}
