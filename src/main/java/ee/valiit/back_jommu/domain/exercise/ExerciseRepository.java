package ee.valiit.back_jommu.domain.exercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}