package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryAnalysisRecommendationsInner
 */
@JsonTypeName("QueryAnalysis_recommendations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class QueryAnalysisRecommendationsInner {

  private UUID recommendationId;

  /**
   * Gets or Sets recommendationType
   */
  public enum RecommendationTypeEnum {
    ADD_INDEX("ADD_INDEX"),
    
    MODIFY_INDEX("MODIFY_INDEX"),
    
    DROP_INDEX("DROP_INDEX"),
    
    REWRITE_QUERY("REWRITE_QUERY"),
    
    ADD_CACHE("ADD_CACHE"),
    
    PARTITION_TABLE("PARTITION_TABLE"),
    
    UPDATE_STATISTICS("UPDATE_STATISTICS"),
    
    CHANGE_SCHEMA("CHANGE_SCHEMA"),
    
    DENORMALIZE("DENORMALIZE");

    private String value;

    RecommendationTypeEnum(String value) {
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
    public static RecommendationTypeEnum fromValue(String value) {
      for (RecommendationTypeEnum b : RecommendationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RecommendationTypeEnum recommendationType;

  private String title;

  private String description;

  private String sqlToApply;

  private Integer currentLatencyMs;

  private Integer projectedLatencyMs;

  private Double projectedImprovementPercent;

  /**
   * Gets or Sets implementationRisk
   */
  public enum ImplementationRiskEnum {
    NONE("NONE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    BREAKING("BREAKING");

    private String value;

    ImplementationRiskEnum(String value) {
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
    public static ImplementationRiskEnum fromValue(String value) {
      for (ImplementationRiskEnum b : ImplementationRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ImplementationRiskEnum implementationRisk;

  /**
   * Gets or Sets implementationEffort
   */
  public enum ImplementationEffortEnum {
    TRIVIAL("TRIVIAL"),
    
    EASY("EASY"),
    
    MEDIUM("MEDIUM"),
    
    HARD("HARD");

    private String value;

    ImplementationEffortEnum(String value) {
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
    public static ImplementationEffortEnum fromValue(String value) {
      for (ImplementationEffortEnum b : ImplementationEffortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ImplementationEffortEnum implementationEffort;

  private Double estimatedCostUSDPerMonth;

  private String notes;

  public QueryAnalysisRecommendationsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QueryAnalysisRecommendationsInner(UUID recommendationId, RecommendationTypeEnum recommendationType, Integer projectedLatencyMs, Double projectedImprovementPercent) {
    this.recommendationId = recommendationId;
    this.recommendationType = recommendationType;
    this.projectedLatencyMs = projectedLatencyMs;
    this.projectedImprovementPercent = projectedImprovementPercent;
  }

  public QueryAnalysisRecommendationsInner recommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * Get recommendationId
   * @return recommendationId
  */
  @NotNull @Valid   @Schema(name = "recommendationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendationId")
  public UUID getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
  }

  public QueryAnalysisRecommendationsInner recommendationType(RecommendationTypeEnum recommendationType) {
    this.recommendationType = recommendationType;
    return this;
  }

  /**
   * Get recommendationType
   * @return recommendationType
  */
  @NotNull   @Schema(name = "recommendationType", example = "ADD_INDEX", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendationType")
  public RecommendationTypeEnum getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(RecommendationTypeEnum recommendationType) {
    this.recommendationType = recommendationType;
  }

  public QueryAnalysisRecommendationsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
    @Schema(name = "title", example = "Add composite index on orders(customer_id, status, created_at)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public QueryAnalysisRecommendationsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "This index eliminates the full table scan and speeds up the ORDER BY clause.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QueryAnalysisRecommendationsInner sqlToApply(String sqlToApply) {
    this.sqlToApply = sqlToApply;
    return this;
  }

  /**
   * Get sqlToApply
   * @return sqlToApply
  */
    @Schema(name = "sqlToApply", example = "CREATE INDEX CONCURRENTLY idx_orders_cust_status_created ON orders (customer_id, status, created_at DESC);", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqlToApply")
  public String getSqlToApply() {
    return sqlToApply;
  }

  public void setSqlToApply(String sqlToApply) {
    this.sqlToApply = sqlToApply;
  }

  public QueryAnalysisRecommendationsInner currentLatencyMs(Integer currentLatencyMs) {
    this.currentLatencyMs = currentLatencyMs;
    return this;
  }

  /**
   * Get currentLatencyMs
   * @return currentLatencyMs
  */
    @Schema(name = "currentLatencyMs", example = "847", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentLatencyMs")
  public Integer getCurrentLatencyMs() {
    return currentLatencyMs;
  }

  public void setCurrentLatencyMs(Integer currentLatencyMs) {
    this.currentLatencyMs = currentLatencyMs;
  }

  public QueryAnalysisRecommendationsInner projectedLatencyMs(Integer projectedLatencyMs) {
    this.projectedLatencyMs = projectedLatencyMs;
    return this;
  }

  /**
   * Get projectedLatencyMs
   * @return projectedLatencyMs
  */
  @NotNull   @Schema(name = "projectedLatencyMs", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectedLatencyMs")
  public Integer getProjectedLatencyMs() {
    return projectedLatencyMs;
  }

  public void setProjectedLatencyMs(Integer projectedLatencyMs) {
    this.projectedLatencyMs = projectedLatencyMs;
  }

  public QueryAnalysisRecommendationsInner projectedImprovementPercent(Double projectedImprovementPercent) {
    this.projectedImprovementPercent = projectedImprovementPercent;
    return this;
  }

  /**
   * Get projectedImprovementPercent
   * @return projectedImprovementPercent
  */
  @NotNull   @Schema(name = "projectedImprovementPercent", example = "98.6", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectedImprovementPercent")
  public Double getProjectedImprovementPercent() {
    return projectedImprovementPercent;
  }

  public void setProjectedImprovementPercent(Double projectedImprovementPercent) {
    this.projectedImprovementPercent = projectedImprovementPercent;
  }

  public QueryAnalysisRecommendationsInner implementationRisk(ImplementationRiskEnum implementationRisk) {
    this.implementationRisk = implementationRisk;
    return this;
  }

  /**
   * Get implementationRisk
   * @return implementationRisk
  */
    @Schema(name = "implementationRisk", example = "LOW", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("implementationRisk")
  public ImplementationRiskEnum getImplementationRisk() {
    return implementationRisk;
  }

  public void setImplementationRisk(ImplementationRiskEnum implementationRisk) {
    this.implementationRisk = implementationRisk;
  }

  public QueryAnalysisRecommendationsInner implementationEffort(ImplementationEffortEnum implementationEffort) {
    this.implementationEffort = implementationEffort;
    return this;
  }

  /**
   * Get implementationEffort
   * @return implementationEffort
  */
    @Schema(name = "implementationEffort", example = "EASY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("implementationEffort")
  public ImplementationEffortEnum getImplementationEffort() {
    return implementationEffort;
  }

  public void setImplementationEffort(ImplementationEffortEnum implementationEffort) {
    this.implementationEffort = implementationEffort;
  }

  public QueryAnalysisRecommendationsInner estimatedCostUSDPerMonth(Double estimatedCostUSDPerMonth) {
    this.estimatedCostUSDPerMonth = estimatedCostUSDPerMonth;
    return this;
  }

  /**
   * Additional storage cost.
   * @return estimatedCostUSDPerMonth
  */
    @Schema(name = "estimatedCostUSDPerMonth", example = "12.5", description = "Additional storage cost.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedCostUSDPerMonth")
  public Double getEstimatedCostUSDPerMonth() {
    return estimatedCostUSDPerMonth;
  }

  public void setEstimatedCostUSDPerMonth(Double estimatedCostUSDPerMonth) {
    this.estimatedCostUSDPerMonth = estimatedCostUSDPerMonth;
  }

  public QueryAnalysisRecommendationsInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
    @Schema(name = "notes", example = "Use CONCURRENTLY to avoid table lock. Index size ~380MB.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAnalysisRecommendationsInner queryAnalysisRecommendationsInner = (QueryAnalysisRecommendationsInner) o;
    return Objects.equals(this.recommendationId, queryAnalysisRecommendationsInner.recommendationId) &&
        Objects.equals(this.recommendationType, queryAnalysisRecommendationsInner.recommendationType) &&
        Objects.equals(this.title, queryAnalysisRecommendationsInner.title) &&
        Objects.equals(this.description, queryAnalysisRecommendationsInner.description) &&
        Objects.equals(this.sqlToApply, queryAnalysisRecommendationsInner.sqlToApply) &&
        Objects.equals(this.currentLatencyMs, queryAnalysisRecommendationsInner.currentLatencyMs) &&
        Objects.equals(this.projectedLatencyMs, queryAnalysisRecommendationsInner.projectedLatencyMs) &&
        Objects.equals(this.projectedImprovementPercent, queryAnalysisRecommendationsInner.projectedImprovementPercent) &&
        Objects.equals(this.implementationRisk, queryAnalysisRecommendationsInner.implementationRisk) &&
        Objects.equals(this.implementationEffort, queryAnalysisRecommendationsInner.implementationEffort) &&
        Objects.equals(this.estimatedCostUSDPerMonth, queryAnalysisRecommendationsInner.estimatedCostUSDPerMonth) &&
        Objects.equals(this.notes, queryAnalysisRecommendationsInner.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, recommendationType, title, description, sqlToApply, currentLatencyMs, projectedLatencyMs, projectedImprovementPercent, implementationRisk, implementationEffort, estimatedCostUSDPerMonth, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAnalysisRecommendationsInner {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    recommendationType: ").append(toIndentedString(recommendationType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sqlToApply: ").append(toIndentedString(sqlToApply)).append("\n");
    sb.append("    currentLatencyMs: ").append(toIndentedString(currentLatencyMs)).append("\n");
    sb.append("    projectedLatencyMs: ").append(toIndentedString(projectedLatencyMs)).append("\n");
    sb.append("    projectedImprovementPercent: ").append(toIndentedString(projectedImprovementPercent)).append("\n");
    sb.append("    implementationRisk: ").append(toIndentedString(implementationRisk)).append("\n");
    sb.append("    implementationEffort: ").append(toIndentedString(implementationEffort)).append("\n");
    sb.append("    estimatedCostUSDPerMonth: ").append(toIndentedString(estimatedCostUSDPerMonth)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

