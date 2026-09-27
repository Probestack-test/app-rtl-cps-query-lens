package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.SlowQueryApplicationContext;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SlowQuery
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class SlowQuery {

  private String slowQueryId;

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

  private String queryFingerprint;

  private String normalizedQuery;

  private String sampleQuery;

  private Integer avgLatencyMs;

  private Integer p50LatencyMs;

  private Integer p95LatencyMs;

  private Integer p99LatencyMs;

  private Integer callFrequency;

  private Double totalTimeConsumedMinutes;

  private Integer rowsExamined;

  private Integer rowsReturned;

  @Valid
  private List<String> indexUsage;

  @Valid
  private List<String> antiPatternsFound;

  private Integer estimatedRecoverableLatencyMs;

  private Double estimatedRecoverablePercent;

  private SlowQueryApplicationContext applicationContext;

  private Boolean hasRecommendation;

  private Integer recommendationCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime firstSeenAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastSeenAt;

  /**
   * Gets or Sets trend
   */
  public enum TrendEnum {
    IMPROVING("IMPROVING"),
    
    STABLE("STABLE"),
    
    WORSENING("WORSENING"),
    
    SPIKE("SPIKE");

    private String value;

    TrendEnum(String value) {
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
    public static TrendEnum fromValue(String value) {
      for (TrendEnum b : TrendEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private TrendEnum trend;

  public SlowQuery() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SlowQuery(String slowQueryId, String databaseId, String queryFingerprint, Integer avgLatencyMs, Integer callFrequency, Double totalTimeConsumedMinutes, OffsetDateTime firstSeenAt) {
    this.slowQueryId = slowQueryId;
    this.databaseId = databaseId;
    this.queryFingerprint = queryFingerprint;
    this.avgLatencyMs = avgLatencyMs;
    this.callFrequency = callFrequency;
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
    this.firstSeenAt = firstSeenAt;
  }

  public SlowQuery slowQueryId(String slowQueryId) {
    this.slowQueryId = slowQueryId;
    return this;
  }

  /**
   * Get slowQueryId
   * @return slowQueryId
  */
  @NotNull   @Schema(name = "slowQueryId", example = "sq-abc-123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slowQueryId")
  public String getSlowQueryId() {
    return slowQueryId;
  }

  public void setSlowQueryId(String slowQueryId) {
    this.slowQueryId = slowQueryId;
  }

  public SlowQuery databaseId(String databaseId) {
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

  public SlowQuery databaseType(DatabaseTypeEnum databaseType) {
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

  public SlowQuery queryFingerprint(String queryFingerprint) {
    this.queryFingerprint = queryFingerprint;
    return this;
  }

  /**
   * Get queryFingerprint
   * @return queryFingerprint
  */
  @NotNull   @Schema(name = "queryFingerprint", example = "fp-a1b2c3d4e5f6", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queryFingerprint")
  public String getQueryFingerprint() {
    return queryFingerprint;
  }

  public void setQueryFingerprint(String queryFingerprint) {
    this.queryFingerprint = queryFingerprint;
  }

  public SlowQuery normalizedQuery(String normalizedQuery) {
    this.normalizedQuery = normalizedQuery;
    return this;
  }

  /**
   * Get normalizedQuery
   * @return normalizedQuery
  */
    @Schema(name = "normalizedQuery", example = "SELECT * FROM orders WHERE customer_id = ? AND status = ? ORDER BY created_at DESC LIMIT 100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("normalizedQuery")
  public String getNormalizedQuery() {
    return normalizedQuery;
  }

  public void setNormalizedQuery(String normalizedQuery) {
    this.normalizedQuery = normalizedQuery;
  }

  public SlowQuery sampleQuery(String sampleQuery) {
    this.sampleQuery = sampleQuery;
    return this;
  }

  /**
   * One real example with actual parameters (PII redacted).
   * @return sampleQuery
  */
    @Schema(name = "sampleQuery", example = "SELECT * FROM orders WHERE customer_id = 12345 AND status = 'PENDING' ORDER BY created_at DESC LIMIT 100", description = "One real example with actual parameters (PII redacted).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sampleQuery")
  public String getSampleQuery() {
    return sampleQuery;
  }

  public void setSampleQuery(String sampleQuery) {
    this.sampleQuery = sampleQuery;
  }

  public SlowQuery avgLatencyMs(Integer avgLatencyMs) {
    this.avgLatencyMs = avgLatencyMs;
    return this;
  }

  /**
   * Get avgLatencyMs
   * @return avgLatencyMs
  */
  @NotNull   @Schema(name = "avgLatencyMs", example = "620", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("avgLatencyMs")
  public Integer getAvgLatencyMs() {
    return avgLatencyMs;
  }

  public void setAvgLatencyMs(Integer avgLatencyMs) {
    this.avgLatencyMs = avgLatencyMs;
  }

  public SlowQuery p50LatencyMs(Integer p50LatencyMs) {
    this.p50LatencyMs = p50LatencyMs;
    return this;
  }

  /**
   * Get p50LatencyMs
   * @return p50LatencyMs
  */
    @Schema(name = "p50LatencyMs", example = "245", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p50LatencyMs")
  public Integer getP50LatencyMs() {
    return p50LatencyMs;
  }

  public void setP50LatencyMs(Integer p50LatencyMs) {
    this.p50LatencyMs = p50LatencyMs;
  }

  public SlowQuery p95LatencyMs(Integer p95LatencyMs) {
    this.p95LatencyMs = p95LatencyMs;
    return this;
  }

  /**
   * Get p95LatencyMs
   * @return p95LatencyMs
  */
    @Schema(name = "p95LatencyMs", example = "620", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p95LatencyMs")
  public Integer getP95LatencyMs() {
    return p95LatencyMs;
  }

  public void setP95LatencyMs(Integer p95LatencyMs) {
    this.p95LatencyMs = p95LatencyMs;
  }

  public SlowQuery p99LatencyMs(Integer p99LatencyMs) {
    this.p99LatencyMs = p99LatencyMs;
    return this;
  }

  /**
   * Get p99LatencyMs
   * @return p99LatencyMs
  */
    @Schema(name = "p99LatencyMs", example = "847", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p99LatencyMs")
  public Integer getP99LatencyMs() {
    return p99LatencyMs;
  }

  public void setP99LatencyMs(Integer p99LatencyMs) {
    this.p99LatencyMs = p99LatencyMs;
  }

  public SlowQuery callFrequency(Integer callFrequency) {
    this.callFrequency = callFrequency;
    return this;
  }

  /**
   * Calls per minute.
   * @return callFrequency
  */
  @NotNull   @Schema(name = "callFrequency", example = "450", description = "Calls per minute.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("callFrequency")
  public Integer getCallFrequency() {
    return callFrequency;
  }

  public void setCallFrequency(Integer callFrequency) {
    this.callFrequency = callFrequency;
  }

  public SlowQuery totalTimeConsumedMinutes(Double totalTimeConsumedMinutes) {
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
    return this;
  }

  /**
   * Latency × frequency — how much DB time this query eats.
   * @return totalTimeConsumedMinutes
  */
  @NotNull   @Schema(name = "totalTimeConsumedMinutes", example = "6352.5", description = "Latency × frequency — how much DB time this query eats.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalTimeConsumedMinutes")
  public Double getTotalTimeConsumedMinutes() {
    return totalTimeConsumedMinutes;
  }

  public void setTotalTimeConsumedMinutes(Double totalTimeConsumedMinutes) {
    this.totalTimeConsumedMinutes = totalTimeConsumedMinutes;
  }

  public SlowQuery rowsExamined(Integer rowsExamined) {
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

  public SlowQuery rowsReturned(Integer rowsReturned) {
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

  public SlowQuery indexUsage(List<String> indexUsage) {
    this.indexUsage = indexUsage;
    return this;
  }

  public SlowQuery addIndexUsageItem(String indexUsageItem) {
    if (this.indexUsage == null) {
      this.indexUsage = new ArrayList<>();
    }
    this.indexUsage.add(indexUsageItem);
    return this;
  }

  /**
   * Get indexUsage
   * @return indexUsage
  */
    @Schema(name = "indexUsage", example = "[]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indexUsage")
  public List<String> getIndexUsage() {
    return indexUsage;
  }

  public void setIndexUsage(List<String> indexUsage) {
    this.indexUsage = indexUsage;
  }

  public SlowQuery antiPatternsFound(List<String> antiPatternsFound) {
    this.antiPatternsFound = antiPatternsFound;
    return this;
  }

  public SlowQuery addAntiPatternsFoundItem(String antiPatternsFoundItem) {
    if (this.antiPatternsFound == null) {
      this.antiPatternsFound = new ArrayList<>();
    }
    this.antiPatternsFound.add(antiPatternsFoundItem);
    return this;
  }

  /**
   * Get antiPatternsFound
   * @return antiPatternsFound
  */
    @Schema(name = "antiPatternsFound", example = "[\"SELECT_STAR\",\"MISSING_INDEX\",\"FULL_TABLE_SCAN\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("antiPatternsFound")
  public List<String> getAntiPatternsFound() {
    return antiPatternsFound;
  }

  public void setAntiPatternsFound(List<String> antiPatternsFound) {
    this.antiPatternsFound = antiPatternsFound;
  }

  public SlowQuery estimatedRecoverableLatencyMs(Integer estimatedRecoverableLatencyMs) {
    this.estimatedRecoverableLatencyMs = estimatedRecoverableLatencyMs;
    return this;
  }

  /**
   * Get estimatedRecoverableLatencyMs
   * @return estimatedRecoverableLatencyMs
  */
    @Schema(name = "estimatedRecoverableLatencyMs", example = "835", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRecoverableLatencyMs")
  public Integer getEstimatedRecoverableLatencyMs() {
    return estimatedRecoverableLatencyMs;
  }

  public void setEstimatedRecoverableLatencyMs(Integer estimatedRecoverableLatencyMs) {
    this.estimatedRecoverableLatencyMs = estimatedRecoverableLatencyMs;
  }

  public SlowQuery estimatedRecoverablePercent(Double estimatedRecoverablePercent) {
    this.estimatedRecoverablePercent = estimatedRecoverablePercent;
    return this;
  }

  /**
   * Get estimatedRecoverablePercent
   * @return estimatedRecoverablePercent
  */
    @Schema(name = "estimatedRecoverablePercent", example = "98.6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRecoverablePercent")
  public Double getEstimatedRecoverablePercent() {
    return estimatedRecoverablePercent;
  }

  public void setEstimatedRecoverablePercent(Double estimatedRecoverablePercent) {
    this.estimatedRecoverablePercent = estimatedRecoverablePercent;
  }

  public SlowQuery applicationContext(SlowQueryApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
    return this;
  }

  /**
   * Get applicationContext
   * @return applicationContext
  */
  @Valid   @Schema(name = "applicationContext", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationContext")
  public SlowQueryApplicationContext getApplicationContext() {
    return applicationContext;
  }

  public void setApplicationContext(SlowQueryApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  public SlowQuery hasRecommendation(Boolean hasRecommendation) {
    this.hasRecommendation = hasRecommendation;
    return this;
  }

  /**
   * Get hasRecommendation
   * @return hasRecommendation
  */
    @Schema(name = "hasRecommendation", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasRecommendation")
  public Boolean getHasRecommendation() {
    return hasRecommendation;
  }

  public void setHasRecommendation(Boolean hasRecommendation) {
    this.hasRecommendation = hasRecommendation;
  }

  public SlowQuery recommendationCount(Integer recommendationCount) {
    this.recommendationCount = recommendationCount;
    return this;
  }

  /**
   * Get recommendationCount
   * @return recommendationCount
  */
    @Schema(name = "recommendationCount", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendationCount")
  public Integer getRecommendationCount() {
    return recommendationCount;
  }

  public void setRecommendationCount(Integer recommendationCount) {
    this.recommendationCount = recommendationCount;
  }

  public SlowQuery firstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * Get firstSeenAt
   * @return firstSeenAt
  */
  @NotNull @Valid   @Schema(name = "firstSeenAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstSeenAt")
  public OffsetDateTime getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }

  public SlowQuery lastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

  /**
   * Get lastSeenAt
   * @return lastSeenAt
  */
  @Valid   @Schema(name = "lastSeenAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastSeenAt")
  public OffsetDateTime getLastSeenAt() {
    return lastSeenAt;
  }

  public void setLastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }

  public SlowQuery trend(TrendEnum trend) {
    this.trend = trend;
    return this;
  }

  /**
   * Get trend
   * @return trend
  */
    @Schema(name = "trend", example = "WORSENING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trend")
  public TrendEnum getTrend() {
    return trend;
  }

  public void setTrend(TrendEnum trend) {
    this.trend = trend;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlowQuery slowQuery = (SlowQuery) o;
    return Objects.equals(this.slowQueryId, slowQuery.slowQueryId) &&
        Objects.equals(this.databaseId, slowQuery.databaseId) &&
        Objects.equals(this.databaseType, slowQuery.databaseType) &&
        Objects.equals(this.queryFingerprint, slowQuery.queryFingerprint) &&
        Objects.equals(this.normalizedQuery, slowQuery.normalizedQuery) &&
        Objects.equals(this.sampleQuery, slowQuery.sampleQuery) &&
        Objects.equals(this.avgLatencyMs, slowQuery.avgLatencyMs) &&
        Objects.equals(this.p50LatencyMs, slowQuery.p50LatencyMs) &&
        Objects.equals(this.p95LatencyMs, slowQuery.p95LatencyMs) &&
        Objects.equals(this.p99LatencyMs, slowQuery.p99LatencyMs) &&
        Objects.equals(this.callFrequency, slowQuery.callFrequency) &&
        Objects.equals(this.totalTimeConsumedMinutes, slowQuery.totalTimeConsumedMinutes) &&
        Objects.equals(this.rowsExamined, slowQuery.rowsExamined) &&
        Objects.equals(this.rowsReturned, slowQuery.rowsReturned) &&
        Objects.equals(this.indexUsage, slowQuery.indexUsage) &&
        Objects.equals(this.antiPatternsFound, slowQuery.antiPatternsFound) &&
        Objects.equals(this.estimatedRecoverableLatencyMs, slowQuery.estimatedRecoverableLatencyMs) &&
        Objects.equals(this.estimatedRecoverablePercent, slowQuery.estimatedRecoverablePercent) &&
        Objects.equals(this.applicationContext, slowQuery.applicationContext) &&
        Objects.equals(this.hasRecommendation, slowQuery.hasRecommendation) &&
        Objects.equals(this.recommendationCount, slowQuery.recommendationCount) &&
        Objects.equals(this.firstSeenAt, slowQuery.firstSeenAt) &&
        Objects.equals(this.lastSeenAt, slowQuery.lastSeenAt) &&
        Objects.equals(this.trend, slowQuery.trend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slowQueryId, databaseId, databaseType, queryFingerprint, normalizedQuery, sampleQuery, avgLatencyMs, p50LatencyMs, p95LatencyMs, p99LatencyMs, callFrequency, totalTimeConsumedMinutes, rowsExamined, rowsReturned, indexUsage, antiPatternsFound, estimatedRecoverableLatencyMs, estimatedRecoverablePercent, applicationContext, hasRecommendation, recommendationCount, firstSeenAt, lastSeenAt, trend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlowQuery {\n");
    sb.append("    slowQueryId: ").append(toIndentedString(slowQueryId)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    queryFingerprint: ").append(toIndentedString(queryFingerprint)).append("\n");
    sb.append("    normalizedQuery: ").append(toIndentedString(normalizedQuery)).append("\n");
    sb.append("    sampleQuery: ").append(toIndentedString(sampleQuery)).append("\n");
    sb.append("    avgLatencyMs: ").append(toIndentedString(avgLatencyMs)).append("\n");
    sb.append("    p50LatencyMs: ").append(toIndentedString(p50LatencyMs)).append("\n");
    sb.append("    p95LatencyMs: ").append(toIndentedString(p95LatencyMs)).append("\n");
    sb.append("    p99LatencyMs: ").append(toIndentedString(p99LatencyMs)).append("\n");
    sb.append("    callFrequency: ").append(toIndentedString(callFrequency)).append("\n");
    sb.append("    totalTimeConsumedMinutes: ").append(toIndentedString(totalTimeConsumedMinutes)).append("\n");
    sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
    sb.append("    rowsReturned: ").append(toIndentedString(rowsReturned)).append("\n");
    sb.append("    indexUsage: ").append(toIndentedString(indexUsage)).append("\n");
    sb.append("    antiPatternsFound: ").append(toIndentedString(antiPatternsFound)).append("\n");
    sb.append("    estimatedRecoverableLatencyMs: ").append(toIndentedString(estimatedRecoverableLatencyMs)).append("\n");
    sb.append("    estimatedRecoverablePercent: ").append(toIndentedString(estimatedRecoverablePercent)).append("\n");
    sb.append("    applicationContext: ").append(toIndentedString(applicationContext)).append("\n");
    sb.append("    hasRecommendation: ").append(toIndentedString(hasRecommendation)).append("\n");
    sb.append("    recommendationCount: ").append(toIndentedString(recommendationCount)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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

