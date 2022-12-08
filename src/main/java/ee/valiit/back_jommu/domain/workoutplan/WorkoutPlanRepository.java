package ee.valiit.back_jommu.domain.workoutplan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Integer> {
    @Query("select w from WorkoutPlan w where w.user.id = ?1")
    List<WorkoutPlan> findWorkoutBy(Integer userId);

}