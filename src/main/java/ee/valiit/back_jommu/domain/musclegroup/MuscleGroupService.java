package ee.valiit.back_jommu.domain.musclegroup;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MuscleGroupService {

    @Resource
    private MuscleGroupMapper muscleGroupMapper;

    @Resource
    private MuscleGroupRepository muscleGroupRepository;


    public List<MuscleGroupDto> getAllMuscleGroups() {
        List<MuscleGroup> muscleGroups = muscleGroupRepository.findAll();
        List<MuscleGroupDto> muscleGroupDtos = muscleGroupMapper.toMuscleGroupDtos(muscleGroups);
        return muscleGroupDtos;

    }



//    public List<MuscleGroupDto> getAllMuscleInfo() {
//        List<MuscleGroup> muscleGroups = muscleGroupRepository.findAll();
//        List<MuscleGroupDto> muscleGroupDtos = muscleGroupMapper.toMuscleGroupDtos(muscleGroups);
//        return muscleGroupDtos;
//    }
}
