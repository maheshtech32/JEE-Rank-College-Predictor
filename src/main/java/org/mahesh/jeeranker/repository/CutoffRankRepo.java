package org.mahesh.jeeranker.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.mahesh.jeeranker.model.CutoffRank;

@Repository
public interface CutoffRankRepo
    extends JpaRepository<CutoffRank, Integer>, JpaSpecificationExecutor<CutoffRank> {

  List<CutoffRank> findCutoffRankByAcademicYearAndQuota(Integer academicYear, String quota);
}
