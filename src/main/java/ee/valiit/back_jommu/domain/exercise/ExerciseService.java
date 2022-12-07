package ee.valiit.back_jommu.domain.exercise;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Resource
    private ExerciseRepository exerciseRepository;

    @Resource
    private ExerciseMapper exerciseMapper;


    public void addExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
    }

    public List<ExerciseDto> getAllExerciseTableInfo(Integer workoutPlanId) {
        List<Exercise> byWorkoutPlanId = exerciseRepository.findExercisesBy(workoutPlanId, "A");
        List<ExerciseDto> exerciseDtos = exerciseMapper.toExerciseDtos(byWorkoutPlanId);
        return exerciseDtos;
    }


    public Exercise getExerciseById(Integer exerciseId) {
        Optional<Exercise> optionalExercise = exerciseRepository.findById(exerciseId);
        Exercise exercise = optionalExercise.get();
        return exercise;
    }

    public void disableExerciseStatus(Exercise exercise) {
        exercise.setStatus("D");
        exerciseRepository.save(exercise);
    }
}
