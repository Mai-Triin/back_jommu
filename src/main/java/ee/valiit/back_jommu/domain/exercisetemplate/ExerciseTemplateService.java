package ee.valiit.back_jommu.domain.exercisetemplate;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExerciseTemplateService {
    @Resource
    private ExerciseTemplateMapper exerciseTemplateMapper;

    @Resource
    private ExerciseTemplateRepository exerciseTemplateRepository;


    public List<ExerciseTemplateDto> getAllExerciseInfo() {
        List<ExerciseTemplate> templates = exerciseTemplateRepository.findAll();
        List<ExerciseTemplateDto> tempDtos = exerciseTemplateMapper.toTempDtos(templates);
            return tempDtos;
    }
}
