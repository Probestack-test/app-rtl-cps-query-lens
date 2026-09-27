package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryAnalysisPerformanceMetrics
 */
@JsonTypeName("QueryAnalysis_performanceMetrics")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class QueryAnalysisPerformanceMetrics {

  private Integer currentP50Ms;

  private Integer currentP95Ms;

  private Integer currentP99Ms;

  private Integer rowsExamined;

  private Integer rowsReturned;

  private Double ratioRowsExaminedToReturned;

  private Integer callsPerMinute;

  private Double totalTimeConsumedMinutes;

  public QueryAnalysisPerformanceMetrics currentP50Ms(Integer currentP50Ms) {
    this.currentP50Ms = currentP50Ms;
    return this;
  }

  /**
   * Get currentP50Ms
   * @return currentP50Ms
  */
    @Schema(name = "currentP50Ms", example = "245", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentP50Ms")
  public Integer getCurrentP50Ms() {
    return currentP50Ms;
  }

  public void setCurrentP50Ms(Integer currentP50Ms) {
    this.currentP50Ms = currentP50Ms;
  }

  public QueryAnalysisPerformanceMetrics currentP95Ms(Integer currentP95Ms) {
    this.currentP95Ms = currentP95Ms;
    return this;
  }

  /**
   * Get currentP95Ms
   * @return currentP95Ms
  */
    @Schema(name = "currentP95Ms", example = "620", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentP95Ms")
  public Integer getCurrentP95Ms() {
    return currentP95Ms;
  }

  public void setCurrentP95Ms(Integer currentP95Ms) {
    this.currentP95Ms = currentP95Ms;
  }

  public QueryAnalysisPerformanceMetrics currentP99Ms(Integer currentP99Ms) {
    this.currentP99Ms = currentP99Ms;
    return this;
  }

  /**
   * Get currentP99Ms
   * @return currentP99Ms
  */
    @Schema(name = "currentP99Ms", example = "847", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentP99Ms")
  public Integer getCurrentP99Ms() {
    return currentP99Ms;
  }

  public void setCurrentP99Ms(Integer currentP99Ms) {
    this.currentP99Ms = currentP99Ms;
  }

  public QueryAnalysisPerformanceMetrics rowsExamined(Integer rowsExamined) {
    this.rowsExamined = rowsExamined;
    return this;
  }

  /**
   * Get rowsExamined
   * @return rowsExamined
  */
    @Schema(name = "rowsExamined", example = "12500000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rowsExamined")
  public Integer getRowsExamined() {
    return rowsExamined;
  }

  public void setRowsExamined(Integer rowsExamined) {
    this.rowsExamined = rowsExamined;
  }

  public QueryAnalysisPerformanceMetrics rowsReturned(Integer rowsReturned) {
    this.rowsReturned = rowsReturned;
    return this;
  }

  /**
   * Get rowsReturned
   * @return rowsReturned
  */
    @Schema(name = "rowsReturned", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rowsReturned")
  public Integer getRowsReturned() {
    return rowsReturned;
  }

  public void setRowsReturned(Integer rowsReturned) {
    this.rowsReturned = rowsReturned;
  }

  public QueryAnalysisPerformanceMetrics ratioRowsExaminedToReturned(Double ratioRowsExaminedToReturned) {
    this.ratioRowsExaminedToReturned = ratioRowsExaminedToReturned;
    return this;
  }

  /**
   * Get ratioRowsExaminedToReturned
   * @return ratioRowsExaminedToReturned
  */
    @Schema(name = "ratioRowsExaminedToReturned", example = "125000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratioRowsExaminedToReturned")
  public Double getRatioRowsExaminedToReturned() {
    return ratioRowsExaminedToReturned;
  }

  public void setRatioRowsExaminedToReturned(Double ratioRowsExaminedToReturned) {
    this.ratioRowsExaminedToReturned = ratioRowsExaminedToReturned;
  }

  public QueryAnalysisPerformanceMetrics callsPerMinute(Integer callsPerMinute) {
    this.callsPerMinute = callsPerMinute;
    return this;
  }

  /**
   * Get callsPerMinute
   * @return callsPerMinute
  */
    @Schema(name = "callsPerMinute", example = "450", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("callsPerMinute")
  public Integer getCallsPerMinute() {
    return callsPerMinute;
  }

  public void setCallsPerMinute(Integer callsPerMinute) {
    this.callsPerMinute = callsPerMinute;
  }

  public QueryAnalysisPerformanceMetrics totalTimeConsumedMinutes(Double totalTimeConsumedMinutes) {
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
    return this;
  }

  /**
   * Get totalTimeConsumedMinutes
   * @return totalTimeConsumedMinutes
  */
    @Schema(name = "totalTimeConsumedMinutes", example = "6352.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTimeConsumedMinutes")
  public Double getTotalTimeConsumedMinutes() {
    return totalTimeConsumedMinutes;
  }

  public void setTotalTimeConsumedMinutes(Double totalTimeConsumedMinutes) {
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAnalysisPerformanceMetrics queryAnalysisPerformanceMetrics = (QueryAnalysisPerformanceMetrics) o;
    return Objects.equals(this.currentP50Ms, queryAnalysisPerformanceMetrics.currentP50Ms) &&
        Objects.equals(this.currentP95Ms, queryAnalysisPerformanceMetrics.currentP95Ms) &&
        Objects.equals(this.currentP99Ms, queryAnalysisPerformanceMetrics.currentP99Ms) &&
        Objects.equals(this.rowsExamined, queryAnalysisPerformanceMetrics.rowsExamined) &&
        Objects.equals(this.rowsReturned, queryAnalysisPerformanceMetrics.rowsReturned) &&
        Objects.equals(this.ratioRowsExaminedToReturned, queryAnalysisPerformanceMetrics.ratioRowsExaminedToReturned) &&
        Objects.equals(this.callsPerMinute, queryAnalysisPerformanceMetrics.callsPerMinute) &&
        Objects.equals(this.totalTimeConsumedMinutes, queryAnalysisPerformanceMetrics.totalTimeConsumedMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentP50Ms, currentP95Ms, currentP99Ms, rowsExamined, rowsReturned, ratioRowsExaminedToReturned, callsPerMinute, totalTimeConsumedMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAnalysisPerformanceMetrics {\n");
    sb.append("    currentP50Ms: ").append(toIndentedString(currentP50Ms)).append("\n");
    sb.append("    currentP95Ms: ").append(toIndentedString(currentP95Ms)).append("\n");
    sb.append("    currentP99Ms: ").append(toIndentedString(currentP99Ms)).append("\n");
    sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
    sb.append("    rowsReturned: ").append(toIndentedString(rowsReturned)).append("\n");
    sb.append("    ratioRowsExaminedToReturned: ").append(toIndentedString(ratioRowsExaminedToReturned)).append("\n");
    sb.append("    callsPerMinute: ").append(toIndentedString(callsPerMinute)).append("\n");
    sb.append("    totalTimeConsumedMinutes: ").append(toIndentedString(totalTimeConsumedMinutes)).append("\n");
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

