package com.techbase.domain;

import com.techbase.domain.PositionRepository;
import com.techbase.domain.PositionRequest;
import com.techbase.domain.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;

@Service
public class PositionService extends BaseService {

    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public List<PositionEntity> getListPosition() {
            return positionRepository.getListPosition();


    }
}
