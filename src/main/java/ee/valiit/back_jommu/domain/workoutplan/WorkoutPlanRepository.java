package ee.valiit.back_jommu.domain.workoutplan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Integer> {
}