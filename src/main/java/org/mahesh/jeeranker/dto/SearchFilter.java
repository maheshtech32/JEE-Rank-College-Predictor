package org.mahesh.jeeranker.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SearchFilter {

    private String searchKey;
    private Object value;
    private SearchOperator operator;

    public String getSearchKey() {
        return searchKey;
    }
    public Object getValue() {
        return value;
    }
    public SearchOperator getOperator() {
        return operator;
    }


}
