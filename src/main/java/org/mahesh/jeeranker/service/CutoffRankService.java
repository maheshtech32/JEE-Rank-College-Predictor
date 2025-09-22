package org.mahesh.jeeranker.service;

import org.springframework.stereotype.Service;
import org.mahesh.jeeranker.dto.CutoffRankDto;
import org.mahesh.jeeranker.dto.SearchFilter;

import java.util.List;

public interface CutoffRankService {
  List<CutoffRankDto> getCutoffRanks();
  List<CutoffRankDto> searchRankList(List<SearchFilter> filters);
}
