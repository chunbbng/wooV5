package team.woo.algorithm;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightRepository extends JpaRepository<Weight, Long> {
    // 특정 TaskType의 Weight를 가져오는 메서드
    Weight findByTaskTypeName(String taskTypeName);
}