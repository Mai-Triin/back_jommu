package ee.valiit.back_jommu.domain.workoutplan;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkoutPlanService {

    @Resource
    private WorkoutPlanRepository workoutPlanRepository;

    @Resource
    private WorkoutPlanMapper workoutPlanMapper;



    public void addWorkoutPlanInfo(WorkoutPlan workoutPlan) {
        workoutPlanRepository.save(workoutPlan);
    }

    public List<WorkoutPlanResponse> getAllWorkoutPlanInfo(Integer userId) {
        List<WorkoutPlan> workoutPlansById = workoutPlanRepository.findWorkoutBy(userId);
        List<WorkoutPlanResponse> workoutPlanResponses = workoutPlanMapper.toWorkoutPlanDtos(workoutPlansById);
        return workoutPlanResponses;
    }

    public WorkoutPlan findById(Integer workoutPlan) {
        WorkoutPlan workoutPlanEntity = workoutPlanRepository.findById(workoutPlan).get();
        return workoutPlanEntity;
    }
}
