package ee.valiit.back_jommu.domain.exercise;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ExerciseService {

    @Resource
    private ExerciseRepository exerciseRepository;


    public void addExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
    }
}
