package ee.valiit.back_jommu.domain.exercisetemplate;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

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


    public ExerciseTemplate getExTempById(Integer exerciseTempId) {
        Optional<ExerciseTemplate> exTemp = exerciseTemplateRepository.findById(exerciseTempId);
        ExerciseTemplate exerciseTemplate = exTemp.get();
        return exerciseTemplate;
    }

    public void addPicture(ExerciseTemplate exerciseTemplate, String imgData) {
        byte[] pictureAsByteArray = imgData.getBytes(StandardCharsets.UTF_8);
        exerciseTemplate.setImgData(pictureAsByteArray);
        exerciseTemplateRepository.save(exerciseTemplate);
    }

    public ExerciseTemplateDto getDescriptionInfo(Integer exerciseTempId) {
        Optional<ExerciseTemplate> exerciseTemplate = exerciseTemplateRepository.findById(exerciseTempId);
        ExerciseTemplate exerciseTemplateEntity = exerciseTemplate.get();
        ExerciseTemplateDto exerciseTemplateDto = exerciseTemplateMapper.toTempDto(exerciseTemplateEntity);
        return exerciseTemplateDto;
    }
}
