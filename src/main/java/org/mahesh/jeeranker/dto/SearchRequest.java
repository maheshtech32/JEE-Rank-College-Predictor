package org.mahesh.jeeranker.dto;

import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SearchRequest {
  private List<SearchFilter> filters;

  public List<SearchFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SearchFilter> filters) {
    this.filters = filters;
  }

  @Override
  public String toString() {
    return "SearchRequest{" +
            "filters=" + filters +
            '}';
  }
}
