package org.mahesh.jeeranker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mahesh.jeeranker.dto.CutoffRankDto;
import org.mahesh.jeeranker.model.CutoffRank;

@Mapper
public interface CutoffRankMapper {

    CutoffRankMapper INSTANCE = Mappers.getMapper(CutoffRankMapper.class);

    CutoffRankDto toDto(CutoffRank cutoffRank);
}
