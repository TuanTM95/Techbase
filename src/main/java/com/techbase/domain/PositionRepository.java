package com.techbase.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity,Long> {

    @Query(value = "select * from Position;",
            nativeQuery = true)
    List<PositionEntity> getListPosition();

}
