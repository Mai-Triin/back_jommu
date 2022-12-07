package ee.valiit.back_jommu.domain.extempmusclegroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExTempMuscleGroupRepository extends JpaRepository<ExTempMuscleGroup, Integer> {
    @Query("select e from ExTempMuscleGroup e where e.muscleGroup.id = ?1")
    List<ExTempMuscleGroup> findByMuscleGroupId(Integer id);



}