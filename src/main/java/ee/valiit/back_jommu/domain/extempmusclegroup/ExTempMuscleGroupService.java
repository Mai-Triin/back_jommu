package ee.valiit.back_jommu.domain.extempmusclegroup;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExTempMuscleGroupService {

    @Resource
    private ExTempMuscleGroupMapper exTempMuscleGroupMapper;

    @Resource
    private ExTempMuscleGroupRepository exTempMuscleGroupRepository;

    public List<ExerciseTemplateTableDto> getAllExerciseTempTableInfo() {
        List<ExTempMuscleGroup> exTempMuscleGroups = exTempMuscleGroupRepository.findAll();
        List<ExerciseTemplateTableDto> templateTableDtos = exTempMuscleGroupMapper.toExTempTableDtos(exTempMuscleGroups);
        return templateTableDtos;
    }

    public List<ExTempMuscleGroupDto> findExTempsBy(Integer muscleGroupId) {
        List<ExTempMuscleGroup> byMuscleGroupId = exTempMuscleGroupRepository.findByMuscleGroupId(muscleGroupId);
        List<ExTempMuscleGroupDto> exTempMuscleGroupDtos = exTempMuscleGroupMapper.toExTempMuscleGroupDtos(byMuscleGroupId);
        return exTempMuscleGroupDtos;
    }
}
