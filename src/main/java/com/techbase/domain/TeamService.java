package com.techbase.domain;

import com.techbase.domain.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.RollbackException;
import java.util.Arrays;
import java.util.List;

@Service
public class TeamService extends BaseService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    public List<TeamEntity> getListTeam() {
        return teamRepository.getListTeam();
    }

    @Transactional(rollbackFor = RollbackException.class, noRollbackFor = RollbackException.class)
    public List<String> insertNewTeam(TeamRequest request) {
        return teamRepository.insertTBTeam(request.Team_Code, request.Team_Name, request.Team_ProjectName);

    }

}
