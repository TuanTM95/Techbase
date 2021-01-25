package com.techbase.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface TeamRepository extends JpaRepository<TeamEntity,Long> {

    @Query(value = "select * from Team;",
            nativeQuery = true)
    List<TeamEntity> getListTeam();

    @Query(value = "INSERT INTO Team(Team_Code, Team_Name, Team_ProjectName)\n" +
            " VALUES (:#{#Team_Code},:#{#Team_Name}),:#{#Team_ProjectName});", nativeQuery = true)
    List<String> insertTBTeam(@Param("Team_Code") Integer Team_Code,
                         @Param("Team_Name") String Team_Name,
                         @Param("Team_ProjectName") String Team_ProjectName);
}
