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

    public List<ExTempMuscleGroupDto> getAllExTempMuscleInfo() {
        List<ExTempMuscleGroup> exTempMuscleGroups = exTempMuscleGroupRepository.findAll();
        List<ExTempMuscleGroupDto> exTempMuscleGroupDtos = exTempMuscleGroupMapper.toExTempMuscleGroupDtos(exTempMuscleGroups);
        return exTempMuscleGroupDtos;
    }

}
