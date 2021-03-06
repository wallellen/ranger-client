package com.jj.ranger.client.v1.domain;

import java.util.List;

public class RepositorySearchResults {
    private int startIndex;
    private int pageSize;
    private long totalCount;
    private int resultSize;
    private String sortType;
    private String sortBy;
    private long queryTimeMS;
    private List<Repository> vXRepositories;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getResultSize() {
        return resultSize;
    }

    public void setResultSize(int resultSize) {
        this.resultSize = resultSize;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public long getQueryTimeMS() {
        return queryTimeMS;
    }

    public void setQueryTimeMS(long queryTimeMS) {
        this.queryTimeMS = queryTimeMS;
    }

    public List<Repository> getvXRepositories() {
        return vXRepositories;
    }

    public void setvXRepositories(List<Repository> vXRepositories) {
        this.vXRepositories = vXRepositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepositorySearchResults that = (RepositorySearchResults) o;

        if (startIndex != that.startIndex) return false;
        if (pageSize != that.pageSize) return false;
        if (totalCount != that.totalCount) return false;
        if (resultSize != that.resultSize) return false;
        if (queryTimeMS != that.queryTimeMS) return false;
        if (sortType != null ? !sortType.equals(that.sortType) : that.sortType != null) return false;
        if (sortBy != null ? !sortBy.equals(that.sortBy) : that.sortBy != null) return false;
        return vXRepositories != null ? vXRepositories.equals(that.vXRepositories) : that.vXRepositories == null;

    }

    @Override
    public int hashCode() {
        int result = startIndex;
        result = 31 * result + pageSize;
        result = 31 * result + (int) (totalCount ^ (totalCount >>> 32));
        result = 31 * result + resultSize;
        result = 31 * result + (sortType != null ? sortType.hashCode() : 0);
        result = 31 * result + (sortBy != null ? sortBy.hashCode() : 0);
        result = 31 * result + (int) (queryTimeMS ^ (queryTimeMS >>> 32));
        result = 31 * result + (vXRepositories != null ? vXRepositories.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RepositorySearchResults{" +
                "startIndex=" + startIndex +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", resultSize=" + resultSize +
                ", sortType='" + sortType + '\'' +
                ", sortBy='" + sortBy + '\'' +
                ", queryTimeMS=" + queryTimeMS +
                ", vXRepositories=" + vXRepositories +
                '}';
    }
}
