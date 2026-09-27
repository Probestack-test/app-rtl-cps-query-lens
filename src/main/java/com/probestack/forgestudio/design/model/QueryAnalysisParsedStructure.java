package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryAnalysisParsedStructure
 */
@JsonTypeName("QueryAnalysis_parsedStructure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class QueryAnalysisParsedStructure {

  @Valid
  private List<String> tables;

  @Valid
  private List<String> joins;

  @Valid
  private List<String> filters;

  @Valid
  private List<String> orderBy;

  private Integer limit;

  private Boolean usesSelectStar;

  /**
   * Gets or Sets estimatedComplexity
   */
  public enum EstimatedComplexityEnum {
    TRIVIAL("TRIVIAL"),
    
    SIMPLE("SIMPLE"),
    
    MODERATE("MODERATE"),
    
    COMPLEX("COMPLEX"),
    
    VERY_COMPLEX("VERY_COMPLEX");

    private String value;

    EstimatedComplexityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EstimatedComplexityEnum fromValue(String value) {
      for (EstimatedComplexityEnum b : EstimatedComplexityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EstimatedComplexityEnum estimatedComplexity;

  public QueryAnalysisParsedStructure tables(List<String> tables) {
    this.tables = tables;
    return this;
  }

  public QueryAnalysisParsedStructure addTablesItem(String tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * Get tables
   * @return tables
  */
    @Schema(name = "tables", example = "[\"orders\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tables")
  public List<String> getTables() {
    return tables;
  }

  public void setTables(List<String> tables) {
    this.tables = tables;
  }

  public QueryAnalysisParsedStructure joins(List<String> joins) {
    this.joins = joins;
    return this;
  }

  public QueryAnalysisParsedStructure addJoinsItem(String joinsItem) {
    if (this.joins == null) {
      this.joins = new ArrayList<>();
    }
    this.joins.add(joinsItem);
    return this;
  }

  /**
   * Get joins
   * @return joins
  */
    @Schema(name = "joins", example = "[]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("joins")
  public List<String> getJoins() {
    return joins;
  }

  public void setJoins(List<String> joins) {
    this.joins = joins;
  }

  public QueryAnalysisParsedStructure filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public QueryAnalysisParsedStructure addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
  */
    @Schema(name = "filters", example = "[\"customer_id = ?\",\"status = ?\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public QueryAnalysisParsedStructure orderBy(List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public QueryAnalysisParsedStructure addOrderByItem(String orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
  */
    @Schema(name = "orderBy", example = "[\"created_at DESC\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderBy")
  public List<String> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }

  public QueryAnalysisParsedStructure limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
    @Schema(name = "limit", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public QueryAnalysisParsedStructure usesSelectStar(Boolean usesSelectStar) {
    this.usesSelectStar = usesSelectStar;
    return this;
  }

  /**
   * Get usesSelectStar
   * @return usesSelectStar
  */
    @Schema(name = "usesSelectStar", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usesSelectStar")
  public Boolean getUsesSelectStar() {
    return usesSelectStar;
  }

  public void setUsesSelectStar(Boolean usesSelectStar) {
    this.usesSelectStar = usesSelectStar;
  }

  public QueryAnalysisParsedStructure estimatedComplexity(EstimatedComplexityEnum estimatedComplexity) {
    this.estimatedComplexity = estimatedComplexity;
    return this;
  }

  /**
   * Get estimatedComplexity
   * @return estimatedComplexity
  */
    @Schema(name = "estimatedComplexity", example = "SIMPLE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedComplexity")
  public EstimatedComplexityEnum getEstimatedComplexity() {
    return estimatedComplexity;
  }

  public void setEstimatedComplexity(EstimatedComplexityEnum estimatedComplexity) {
    this.estimatedComplexity = estimatedComplexity;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAnalysisParsedStructure queryAnalysisParsedStructure = (QueryAnalysisParsedStructure) o;
    return Objects.equals(this.tables, queryAnalysisParsedStructure.tables) &&
        Objects.equals(this.joins, queryAnalysisParsedStructure.joins) &&
        Objects.equals(this.filters, queryAnalysisParsedStructure.filters) &&
        Objects.equals(this.orderBy, queryAnalysisParsedStructure.orderBy) &&
        Objects.equals(this.limit, queryAnalysisParsedStructure.limit) &&
        Objects.equals(this.usesSelectStar, queryAnalysisParsedStructure.usesSelectStar) &&
        Objects.equals(this.estimatedComplexity, queryAnalysisParsedStructure.estimatedComplexity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tables, joins, filters, orderBy, limit, usesSelectStar, estimatedComplexity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAnalysisParsedStructure {\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
    sb.append("    joins: ").append(toIndentedString(joins)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    usesSelectStar: ").append(toIndentedString(usesSelectStar)).append("\n");
    sb.append("    estimatedComplexity: ").append(toIndentedString(estimatedComplexity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

