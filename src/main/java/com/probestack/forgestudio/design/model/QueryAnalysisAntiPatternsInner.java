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
 * QueryAnalysisAntiPatternsInner
 */
@JsonTypeName("QueryAnalysis_antiPatterns_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class QueryAnalysisAntiPatternsInner {

  /**
   * Gets or Sets patternType
   */
  public enum PatternTypeEnum {
    SELECT_STAR("SELECT_STAR"),
    
    MISSING_INDEX("MISSING_INDEX"),
    
    FULL_TABLE_SCAN("FULL_TABLE_SCAN"),
    
    N_PLUS_ONE("N_PLUS_ONE"),
    
    IMPLICIT_CAST("IMPLICIT_CAST"),
    
    FUNCTION_ON_INDEXED_COLUMN("FUNCTION_ON_INDEXED_COLUMN"),
    
    LEADING_WILDCARD_LIKE("LEADING_WILDCARD_LIKE"),
    
    OR_IN_WHERE("OR_IN_WHERE"),
    
    NOT_IN_SUBQUERY("NOT_IN_SUBQUERY"),
    
    CROSS_JOIN("CROSS_JOIN"),
    
    MISSING_LIMIT("MISSING_LIMIT"),
    
    REDUNDANT_DISTINCT("REDUNDANT_DISTINCT"),
    
    SUBQUERY_IN_SELECT("SUBQUERY_IN_SELECT");

    private String value;

    PatternTypeEnum(String value) {
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
    public static PatternTypeEnum fromValue(String value) {
      for (PatternTypeEnum b : PatternTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private PatternTypeEnum patternType;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    INFO("INFO"),
    
    WARNING("WARNING"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  private String detail;

  @Valid
  private List<String> affectedColumns;

  private Integer projectedImprovementMs;

  public QueryAnalysisAntiPatternsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QueryAnalysisAntiPatternsInner(PatternTypeEnum patternType, SeverityEnum severity, String detail) {
    this.patternType = patternType;
    this.severity = severity;
    this.detail = detail;
  }

  public QueryAnalysisAntiPatternsInner patternType(PatternTypeEnum patternType) {
    this.patternType = patternType;
    return this;
  }

  /**
   * Get patternType
   * @return patternType
  */
  @NotNull   @Schema(name = "patternType", example = "MISSING_INDEX", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("patternType")
  public PatternTypeEnum getPatternType() {
    return patternType;
  }

  public void setPatternType(PatternTypeEnum patternType) {
    this.patternType = patternType;
  }

  public QueryAnalysisAntiPatternsInner severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  @NotNull   @Schema(name = "severity", example = "CRITICAL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public QueryAnalysisAntiPatternsInner detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @NotNull   @Schema(name = "detail", example = "No index on (customer_id, status) — full table scan on 12M rows.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public QueryAnalysisAntiPatternsInner affectedColumns(List<String> affectedColumns) {
    this.affectedColumns = affectedColumns;
    return this;
  }

  public QueryAnalysisAntiPatternsInner addAffectedColumnsItem(String affectedColumnsItem) {
    if (this.affectedColumns == null) {
      this.affectedColumns = new ArrayList<>();
    }
    this.affectedColumns.add(affectedColumnsItem);
    return this;
  }

  /**
   * Get affectedColumns
   * @return affectedColumns
  */
    @Schema(name = "affectedColumns", example = "[\"customer_id\",\"status\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affectedColumns")
  public List<String> getAffectedColumns() {
    return affectedColumns;
  }

  public void setAffectedColumns(List<String> affectedColumns) {
    this.affectedColumns = affectedColumns;
  }

  public QueryAnalysisAntiPatternsInner projectedImprovementMs(Integer projectedImprovementMs) {
    this.projectedImprovementMs = projectedImprovementMs;
    return this;
  }

  /**
   * Get projectedImprovementMs
   * @return projectedImprovementMs
  */
    @Schema(name = "projectedImprovementMs", example = "835", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectedImprovementMs")
  public Integer getProjectedImprovementMs() {
    return projectedImprovementMs;
  }

  public void setProjectedImprovementMs(Integer projectedImprovementMs) {
    this.projectedImprovementMs = projectedImprovementMs;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAnalysisAntiPatternsInner queryAnalysisAntiPatternsInner = (QueryAnalysisAntiPatternsInner) o;
    return Objects.equals(this.patternType, queryAnalysisAntiPatternsInner.patternType) &&
        Objects.equals(this.severity, queryAnalysisAntiPatternsInner.severity) &&
        Objects.equals(this.detail, queryAnalysisAntiPatternsInner.detail) &&
        Objects.equals(this.affectedColumns, queryAnalysisAntiPatternsInner.affectedColumns) &&
        Objects.equals(this.projectedImprovementMs, queryAnalysisAntiPatternsInner.projectedImprovementMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patternType, severity, detail, affectedColumns, projectedImprovementMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAnalysisAntiPatternsInner {\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    affectedColumns: ").append(toIndentedString(affectedColumns)).append("\n");
    sb.append("    projectedImprovementMs: ").append(toIndentedString(projectedImprovementMs)).append("\n");
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

