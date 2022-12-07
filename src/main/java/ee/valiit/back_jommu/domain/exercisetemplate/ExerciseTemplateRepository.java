package ee.valiit.back_jommu.domain.exercisetemplate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExerciseTemplateRepository extends JpaRepository<ExerciseTemplate, Integer> {

}