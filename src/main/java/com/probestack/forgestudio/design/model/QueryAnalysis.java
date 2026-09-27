package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.QueryAnalysisAntiPatternsInner;
import com.probestack.forgestudio.design.model.QueryAnalysisParsedStructure;
import com.probestack.forgestudio.design.model.QueryAnalysisPerformanceMetrics;
import com.probestack.forgestudio.design.model.QueryAnalysisRecommendationsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryAnalysis
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class QueryAnalysis {

  private UUID analysisId;

  private String databaseId;

  /**
   * Gets or Sets databaseType
   */
  public enum DatabaseTypeEnum {
    POSTGRESQL("POSTGRESQL"),
    
    MYSQL("MYSQL"),
    
    MONGODB("MONGODB"),
    
    ORACLE("ORACLE"),
    
    SQLSERVER("SQLSERVER"),
    
    COCKROACHDB("COCKROACHDB");

    private String value;

    DatabaseTypeEnum(String value) {
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
    public static DatabaseTypeEnum fromValue(String value) {
      for (DatabaseTypeEnum b : DatabaseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DatabaseTypeEnum databaseType;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    PARSING("PARSING"),
    
    EXPLAINING("EXPLAINING"),
    
    ANALYZING("ANALYZING"),
    
    ANALYZING_INDEXES("ANALYZING_INDEXES"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime submittedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private String normalizedQuery;

  private String queryFingerprint;

  private QueryAnalysisParsedStructure parsedStructure;

  @Valid
  private List<@Valid QueryAnalysisAntiPatternsInner> antiPatterns;

  private QueryAnalysisPerformanceMetrics performanceMetrics;

  @Valid
  private List<@Valid QueryAnalysisRecommendationsInner> recommendations;

  @Valid
  private Map<String, Object> explainPlan = new HashMap<>();

  private String aiSummary;

  private String errorMessage;

  public QueryAnalysis() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QueryAnalysis(UUID analysisId, String databaseId, StatusEnum status, OffsetDateTime submittedAt) {
    this.analysisId = analysisId;
    this.databaseId = databaseId;
    this.status = status;
    this.submittedAt = submittedAt;
  }

  public QueryAnalysis analysisId(UUID analysisId) {
    this.analysisId = analysisId;
    return this;
  }

  /**
   * Get analysisId
   * @return analysisId
  */
  @NotNull @Valid   @Schema(name = "analysisId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("analysisId")
  public UUID getAnalysisId() {
    return analysisId;
  }

  public void setAnalysisId(UUID analysisId) {
    this.analysisId = analysisId;
  }

  public QueryAnalysis databaseId(String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Get databaseId
   * @return databaseId
  */
  @NotNull   @Schema(name = "databaseId", example = "payment-db-prod", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("databaseId")
  public String getDatabaseId() {
    return databaseId;
  }

  public void setDatabaseId(String databaseId) {
    this.databaseId = databaseId;
  }

  public QueryAnalysis databaseType(DatabaseTypeEnum databaseType) {
    this.databaseType = databaseType;
    return this;
  }

  /**
   * Get databaseType
   * @return databaseType
  */
    @Schema(name = "databaseType", example = "POSTGRESQL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("databaseType")
  public DatabaseTypeEnum getDatabaseType() {
    return databaseType;
  }

  public void setDatabaseType(DatabaseTypeEnum databaseType) {
    this.databaseType = databaseType;
  }

  public QueryAnalysis status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "COMPLETED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public QueryAnalysis submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

  /**
   * Get submittedAt
   * @return submittedAt
  */
  @NotNull @Valid   @Schema(name = "submittedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("submittedAt")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  public QueryAnalysis completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public QueryAnalysis normalizedQuery(String normalizedQuery) {
    this.normalizedQuery = normalizedQuery;
    return this;
  }

  /**
   * Query with bind parameters replaced by placeholders (for grouping).
   * @return normalizedQuery
  */
    @Schema(name = "normalizedQuery", example = "SELECT * FROM orders WHERE customer_id = ? AND status = ? ORDER BY created_at DESC LIMIT 100", description = "Query with bind parameters replaced by placeholders (for grouping).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("normalizedQuery")
  public String getNormalizedQuery() {
    return normalizedQuery;
  }

  public void setNormalizedQuery(String normalizedQuery) {
    this.normalizedQuery = normalizedQuery;
  }

  public QueryAnalysis queryFingerprint(String queryFingerprint) {
    this.queryFingerprint = queryFingerprint;
    return this;
  }

  /**
   * Stable hash identifying this query pattern.
   * @return queryFingerprint
  */
    @Schema(name = "queryFingerprint", example = "fp-a1b2c3d4e5f6", description = "Stable hash identifying this query pattern.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryFingerprint")
  public String getQueryFingerprint() {
    return queryFingerprint;
  }

  public void setQueryFingerprint(String queryFingerprint) {
    this.queryFingerprint = queryFingerprint;
  }

  public QueryAnalysis parsedStructure(QueryAnalysisParsedStructure parsedStructure) {
    this.parsedStructure = parsedStructure;
    return this;
  }

  /**
   * Get parsedStructure
   * @return parsedStructure
  */
  @Valid   @Schema(name = "parsedStructure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parsedStructure")
  public QueryAnalysisParsedStructure getParsedStructure() {
    return parsedStructure;
  }

  public void setParsedStructure(QueryAnalysisParsedStructure parsedStructure) {
    this.parsedStructure = parsedStructure;
  }

  public QueryAnalysis antiPatterns(List<@Valid QueryAnalysisAntiPatternsInner> antiPatterns) {
    this.antiPatterns = antiPatterns;
    return this;
  }

  public QueryAnalysis addAntiPatternsItem(QueryAnalysisAntiPatternsInner antiPatternsItem) {
    if (this.antiPatterns == null) {
      this.antiPatterns = new ArrayList<>();
    }
    this.antiPatterns.add(antiPatternsItem);
    return this;
  }

  /**
   * Get antiPatterns
   * @return antiPatterns
  */
  @Valid   @Schema(name = "antiPatterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("antiPatterns")
  public List<@Valid QueryAnalysisAntiPatternsInner> getAntiPatterns() {
    return antiPatterns;
  }

  public void setAntiPatterns(List<@Valid QueryAnalysisAntiPatternsInner> antiPatterns) {
    this.antiPatterns = antiPatterns;
  }

  public QueryAnalysis performanceMetrics(QueryAnalysisPerformanceMetrics performanceMetrics) {
    this.performanceMetrics = performanceMetrics;
    return this;
  }

  /**
   * Get performanceMetrics
   * @return performanceMetrics
  */
  @Valid   @Schema(name = "performanceMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceMetrics")
  public QueryAnalysisPerformanceMetrics getPerformanceMetrics() {
    return performanceMetrics;
  }

  public void setPerformanceMetrics(QueryAnalysisPerformanceMetrics performanceMetrics) {
    this.performanceMetrics = performanceMetrics;
  }

  public QueryAnalysis recommendations(List<@Valid QueryAnalysisRecommendationsInner> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public QueryAnalysis addRecommendationsItem(QueryAnalysisRecommendationsInner recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

  /**
   * Get recommendations
   * @return recommendations
  */
  @Valid   @Schema(name = "recommendations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendations")
  public List<@Valid QueryAnalysisRecommendationsInner> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<@Valid QueryAnalysisRecommendationsInner> recommendations) {
    this.recommendations = recommendations;
  }

  public QueryAnalysis explainPlan(Map<String, Object> explainPlan) {
    this.explainPlan = explainPlan;
    return this;
  }

  public QueryAnalysis putExplainPlanItem(String key, Object explainPlanItem) {
    if (this.explainPlan == null) {
      this.explainPlan = new HashMap<>();
    }
    this.explainPlan.put(key, explainPlanItem);
    return this;
  }

  /**
   * Full EXPLAIN tree if includeExplainPlan=true.
   * @return explainPlan
  */
    @Schema(name = "explainPlan", example = "{\"planNode\":\"Seq Scan\",\"table\":\"orders\",\"cost\":\"125000.00..125000.00\",\"rows\":12500000,\"filter\":\"(customer_id = 12345 AND status = 'PENDING')\"}", description = "Full EXPLAIN tree if includeExplainPlan=true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explainPlan")
  public Map<String, Object> getExplainPlan() {
    return explainPlan;
  }

  public void setExplainPlan(Map<String, Object> explainPlan) {
    this.explainPlan = explainPlan;
  }

  public QueryAnalysis aiSummary(String aiSummary) {
    this.aiSummary = aiSummary;
    return this;
  }

  /**
   * AI-generated plain-English summary.
   * @return aiSummary
  */
    @Schema(name = "aiSummary", example = "This query scans 12.5M rows to return 100. Adding a composite index drops latency from 847ms to 12ms — a 70x speedup. Low risk; use CONCURRENTLY to avoid locks.", description = "AI-generated plain-English summary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiSummary")
  public String getAiSummary() {
    return aiSummary;
  }

  public void setAiSummary(String aiSummary) {
    this.aiSummary = aiSummary;
  }

  public QueryAnalysis errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Populated only if status = FAILED.
   * @return errorMessage
  */
    @Schema(name = "errorMessage", description = "Populated only if status = FAILED.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAnalysis queryAnalysis = (QueryAnalysis) o;
    return Objects.equals(this.analysisId, queryAnalysis.analysisId) &&
        Objects.equals(this.databaseId, queryAnalysis.databaseId) &&
        Objects.equals(this.databaseType, queryAnalysis.databaseType) &&
        Objects.equals(this.status, queryAnalysis.status) &&
        Objects.equals(this.submittedAt, queryAnalysis.submittedAt) &&
        Objects.equals(this.completedAt, queryAnalysis.completedAt) &&
        Objects.equals(this.normalizedQuery, queryAnalysis.normalizedQuery) &&
        Objects.equals(this.queryFingerprint, queryAnalysis.queryFingerprint) &&
        Objects.equals(this.parsedStructure, queryAnalysis.parsedStructure) &&
        Objects.equals(this.antiPatterns, queryAnalysis.antiPatterns) &&
        Objects.equals(this.performanceMetrics, queryAnalysis.performanceMetrics) &&
        Objects.equals(this.recommendations, queryAnalysis.recommendations) &&
        Objects.equals(this.explainPlan, queryAnalysis.explainPlan) &&
        Objects.equals(this.aiSummary, queryAnalysis.aiSummary) &&
        Objects.equals(this.errorMessage, queryAnalysis.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisId, databaseId, databaseType, status, submittedAt, completedAt, normalizedQuery, queryFingerprint, parsedStructure, antiPatterns, performanceMetrics, recommendations, explainPlan, aiSummary, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAnalysis {\n");
    sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    normalizedQuery: ").append(toIndentedString(normalizedQuery)).append("\n");
    sb.append("    queryFingerprint: ").append(toIndentedString(queryFingerprint)).append("\n");
    sb.append("    parsedStructure: ").append(toIndentedString(parsedStructure)).append("\n");
    sb.append("    antiPatterns: ").append(toIndentedString(antiPatterns)).append("\n");
    sb.append("    performanceMetrics: ").append(toIndentedString(performanceMetrics)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    explainPlan: ").append(toIndentedString(explainPlan)).append("\n");
    sb.append("    aiSummary: ").append(toIndentedString(aiSummary)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

