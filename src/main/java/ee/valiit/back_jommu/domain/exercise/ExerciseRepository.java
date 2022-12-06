package ee.valiit.back_jommu.domain.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
    List<Exercise> findByWorkoutPlanId(Integer workoutPlanId);

    @Query("select e from Exercise e where e.workoutPlan.id = ?1 and e.status = ?2")
    List<Exercise> findExercisesBy(Integer workoutPlanId, String status);
//    Optional<Exercise> findByWorkoutPlanId(Integer id);


}