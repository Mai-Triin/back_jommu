package ee.valiit.back_jommu.business.picture;

import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplate;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateMapper;
import ee.valiit.back_jommu.domain.exercisetemplate.ExerciseTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PictureService {

    @Resource
    private ExerciseTemplateService exerciseTemplateService;

    @Resource
    private ExerciseTemplateMapper exerciseTemplateMapper;

    public void addPicture(PictureDto request) {
        ExerciseTemplate exerciseTemplate = exerciseTemplateService.getExTempById(request.getExerciseTempId());
        exerciseTemplateService.addPicture(exerciseTemplate, request.getImgData());

    }

    public PictureDto getPicture(Integer exTempId) {
        ExerciseTemplate exerciseTemplate = exerciseTemplateService.getExTempById(exTempId);
        PictureDto pictureDto = new PictureDto();
        pictureDto.setExerciseTempId(exTempId);
        pictureDto.setImgData(new String(exerciseTemplate.getImgData()));
        return pictureDto;
    }
}
