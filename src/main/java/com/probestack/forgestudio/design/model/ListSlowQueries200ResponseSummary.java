package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ListSlowQueries200ResponseSummary
 */
@JsonTypeName("listSlowQueries_200_response_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class ListSlowQueries200ResponseSummary {

  private Integer totalQueriesAnalyzed;

  private Double totalTimeConsumedMinutes;

  private Integer queriesNeedingAttention;

  private Double estimatedRecoverableLatencyPercent;

  public ListSlowQueries200ResponseSummary totalQueriesAnalyzed(Integer totalQueriesAnalyzed) {
    this.totalQueriesAnalyzed = totalQueriesAnalyzed;
    return this;
  }

  /**
   * Get totalQueriesAnalyzed
   * @return totalQueriesAnalyzed
  */
    @Schema(name = "totalQueriesAnalyzed", example = "45280", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalQueriesAnalyzed")
  public Integer getTotalQueriesAnalyzed() {
    return totalQueriesAnalyzed;
  }

  public void setTotalQueriesAnalyzed(Integer totalQueriesAnalyzed) {
    this.totalQueriesAnalyzed = totalQueriesAnalyzed;
  }

  public ListSlowQueries200ResponseSummary totalTimeConsumedMinutes(Double totalTimeConsumedMinutes) {
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
    return this;
  }

  /**
   * Get totalTimeConsumedMinutes
   * @return totalTimeConsumedMinutes
  */
    @Schema(name = "totalTimeConsumedMinutes", example = "3420.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTimeConsumedMinutes")
  public Double getTotalTimeConsumedMinutes() {
    return totalTimeConsumedMinutes;
  }

  public void setTotalTimeConsumedMinutes(Double totalTimeConsumedMinutes) {
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
  }

  public ListSlowQueries200ResponseSummary queriesNeedingAttention(Integer queriesNeedingAttention) {
    this.queriesNeedingAttention = queriesNeedingAttention;
    return this;
  }

  /**
   * Get queriesNeedingAttention
   * @return queriesNeedingAttention
  */
    @Schema(name = "queriesNeedingAttention", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queriesNeedingAttention")
  public Integer getQueriesNeedingAttention() {
    return queriesNeedingAttention;
  }

  public void setQueriesNeedingAttention(Integer queriesNeedingAttention) {
    this.queriesNeedingAttention = queriesNeedingAttention;
  }

  public ListSlowQueries200ResponseSummary estimatedRecoverableLatencyPercent(Double estimatedRecoverableLatencyPercent) {
    this.estimatedRecoverableLatencyPercent = estimatedRecoverableLatencyPercent;
    return this;
  }

  /**
   * Get estimatedRecoverableLatencyPercent
   * @return estimatedRecoverableLatencyPercent
  */
    @Schema(name = "estimatedRecoverableLatencyPercent", example = "34.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRecoverableLatencyPercent")
  public Double getEstimatedRecoverableLatencyPercent() {
    return estimatedRecoverableLatencyPercent;
  }

  public void setEstimatedRecoverableLatencyPercent(Double estimatedRecoverableLatencyPercent) {
    this.estimatedRecoverableLatencyPercent = estimatedRecoverableLatencyPercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSlowQueries200ResponseSummary listSlowQueries200ResponseSummary = (ListSlowQueries200ResponseSummary) o;
    return Objects.equals(this.totalQueriesAnalyzed, listSlowQueries200ResponseSummary.totalQueriesAnalyzed) &&
        Objects.equals(this.totalTimeConsumedMinutes, listSlowQueries200ResponseSummary.totalTimeConsumedMinutes) &&
        Objects.equals(this.queriesNeedingAttention, listSlowQueries200ResponseSummary.queriesNeedingAttention) &&
        Objects.equals(this.estimatedRecoverableLatencyPercent, listSlowQueries200ResponseSummary.estimatedRecoverableLatencyPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalQueriesAnalyzed, totalTimeConsumedMinutes, queriesNeedingAttention, estimatedRecoverableLatencyPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSlowQueries200ResponseSummary {\n");
    sb.append("    totalQueriesAnalyzed: ").append(toIndentedString(totalQueriesAnalyzed)).append("\n");
    sb.append("    totalTimeConsumedMinutes: ").append(toIndentedString(totalTimeConsumedMinutes)).append("\n");
    sb.append("    queriesNeedingAttention: ").append(toIndentedString(queriesNeedingAttention)).append("\n");
    sb.append("    estimatedRecoverableLatencyPercent: ").append(toIndentedString(estimatedRecoverableLatencyPercent)).append("\n");
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

