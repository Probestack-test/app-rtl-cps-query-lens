package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OptimizationAction
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class OptimizationAction {

  private UUID actionId;

  private UUID recommendationId;

  private String databaseId;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    DRY_RUN("DRY_RUN"),
    
    CANARY_ON_REPLICA("CANARY_ON_REPLICA"),
    
    APPLY_NOW("APPLY_NOW"),
    
    SCHEDULED("SCHEDULED");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ModeEnum mode;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    VALIDATING("VALIDATING"),
    
    APPLYING("APPLYING"),
    
    VERIFYING("VERIFYING"),
    
    COMPLETED("COMPLETED"),
    
    REVERTED("REVERTED"),
    
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
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private String sqlExecuted;

  private Integer beforeLatencyMs;

  private Integer afterLatencyMs;

  private Double actualImprovementPercent;

  private Integer storageAddedBytes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime revertUntil;

  private String appliedBy;

  private String auditReference;

  private String errorMessage;

  public OptimizationAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OptimizationAction(UUID actionId, UUID recommendationId, ModeEnum mode, StatusEnum status, OffsetDateTime startedAt) {
    this.actionId = actionId;
    this.recommendationId = recommendationId;
    this.mode = mode;
    this.status = status;
    this.startedAt = startedAt;
  }

  public OptimizationAction actionId(UUID actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * @return actionId
  */
  @NotNull @Valid   @Schema(name = "actionId", example = "f47ac10b-58cc-4372-a567-0e02b2c3d479", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actionId")
  public UUID getActionId() {
    return actionId;
  }

  public void setActionId(UUID actionId) {
    this.actionId = actionId;
  }

  public OptimizationAction recommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * Get recommendationId
   * @return recommendationId
  */
  @NotNull @Valid   @Schema(name = "recommendationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendationId")
  public UUID getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
  }

  public OptimizationAction databaseId(String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Get databaseId
   * @return databaseId
  */
    @Schema(name = "databaseId", example = "payment-db-prod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("databaseId")
  public String getDatabaseId() {
    return databaseId;
  }

  public void setDatabaseId(String databaseId) {
    this.databaseId = databaseId;
  }

  public OptimizationAction mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @NotNull   @Schema(name = "mode", example = "CANARY_ON_REPLICA", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public OptimizationAction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "APPLYING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OptimizationAction startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @NotNull @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public OptimizationAction completedAt(OffsetDateTime completedAt) {
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

  public OptimizationAction sqlExecuted(String sqlExecuted) {
    this.sqlExecuted = sqlExecuted;
    return this;
  }

  /**
   * Get sqlExecuted
   * @return sqlExecuted
  */
    @Schema(name = "sqlExecuted", example = "CREATE INDEX CONCURRENTLY idx_orders_cust_status_created ON orders (customer_id, status, created_at DESC);", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqlExecuted")
  public String getSqlExecuted() {
    return sqlExecuted;
  }

  public void setSqlExecuted(String sqlExecuted) {
    this.sqlExecuted = sqlExecuted;
  }

  public OptimizationAction beforeLatencyMs(Integer beforeLatencyMs) {
    this.beforeLatencyMs = beforeLatencyMs;
    return this;
  }

  /**
   * Get beforeLatencyMs
   * @return beforeLatencyMs
  */
    @Schema(name = "beforeLatencyMs", example = "847", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beforeLatencyMs")
  public Integer getBeforeLatencyMs() {
    return beforeLatencyMs;
  }

  public void setBeforeLatencyMs(Integer beforeLatencyMs) {
    this.beforeLatencyMs = beforeLatencyMs;
  }

  public OptimizationAction afterLatencyMs(Integer afterLatencyMs) {
    this.afterLatencyMs = afterLatencyMs;
    return this;
  }

  /**
   * Get afterLatencyMs
   * @return afterLatencyMs
  */
    @Schema(name = "afterLatencyMs", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("afterLatencyMs")
  public Integer getAfterLatencyMs() {
    return afterLatencyMs;
  }

  public void setAfterLatencyMs(Integer afterLatencyMs) {
    this.afterLatencyMs = afterLatencyMs;
  }

  public OptimizationAction actualImprovementPercent(Double actualImprovementPercent) {
    this.actualImprovementPercent = actualImprovementPercent;
    return this;
  }

  /**
   * Get actualImprovementPercent
   * @return actualImprovementPercent
  */
    @Schema(name = "actualImprovementPercent", example = "98.6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualImprovementPercent")
  public Double getActualImprovementPercent() {
    return actualImprovementPercent;
  }

  public void setActualImprovementPercent(Double actualImprovementPercent) {
    this.actualImprovementPercent = actualImprovementPercent;
  }

  public OptimizationAction storageAddedBytes(Integer storageAddedBytes) {
    this.storageAddedBytes = storageAddedBytes;
    return this;
  }

  /**
   * Get storageAddedBytes
   * @return storageAddedBytes
  */
    @Schema(name = "storageAddedBytes", example = "398000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageAddedBytes")
  public Integer getStorageAddedBytes() {
    return storageAddedBytes;
  }

  public void setStorageAddedBytes(Integer storageAddedBytes) {
    this.storageAddedBytes = storageAddedBytes;
  }

  public OptimizationAction revertUntil(OffsetDateTime revertUntil) {
    this.revertUntil = revertUntil;
    return this;
  }

  /**
   * Get revertUntil
   * @return revertUntil
  */
  @Valid   @Schema(name = "revertUntil", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revertUntil")
  public OffsetDateTime getRevertUntil() {
    return revertUntil;
  }

  public void setRevertUntil(OffsetDateTime revertUntil) {
    this.revertUntil = revertUntil;
  }

  public OptimizationAction appliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
    return this;
  }

  /**
   * Get appliedBy
   * @return appliedBy
  */
    @Schema(name = "appliedBy", example = "dba@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appliedBy")
  public String getAppliedBy() {
    return appliedBy;
  }

  public void setAppliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
  }

  public OptimizationAction auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://querylens/action-f47ac10b", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }

  public OptimizationAction errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
    @Schema(name = "errorMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OptimizationAction optimizationAction = (OptimizationAction) o;
    return Objects.equals(this.actionId, optimizationAction.actionId) &&
        Objects.equals(this.recommendationId, optimizationAction.recommendationId) &&
        Objects.equals(this.databaseId, optimizationAction.databaseId) &&
        Objects.equals(this.mode, optimizationAction.mode) &&
        Objects.equals(this.status, optimizationAction.status) &&
        Objects.equals(this.startedAt, optimizationAction.startedAt) &&
        Objects.equals(this.completedAt, optimizationAction.completedAt) &&
        Objects.equals(this.sqlExecuted, optimizationAction.sqlExecuted) &&
        Objects.equals(this.beforeLatencyMs, optimizationAction.beforeLatencyMs) &&
        Objects.equals(this.afterLatencyMs, optimizationAction.afterLatencyMs) &&
        Objects.equals(this.actualImprovementPercent, optimizationAction.actualImprovementPercent) &&
        Objects.equals(this.storageAddedBytes, optimizationAction.storageAddedBytes) &&
        Objects.equals(this.revertUntil, optimizationAction.revertUntil) &&
        Objects.equals(this.appliedBy, optimizationAction.appliedBy) &&
        Objects.equals(this.auditReference, optimizationAction.auditReference) &&
        Objects.equals(this.errorMessage, optimizationAction.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, recommendationId, databaseId, mode, status, startedAt, completedAt, sqlExecuted, beforeLatencyMs, afterLatencyMs, actualImprovementPercent, storageAddedBytes, revertUntil, appliedBy, auditReference, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationAction {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    sqlExecuted: ").append(toIndentedString(sqlExecuted)).append("\n");
    sb.append("    beforeLatencyMs: ").append(toIndentedString(beforeLatencyMs)).append("\n");
    sb.append("    afterLatencyMs: ").append(toIndentedString(afterLatencyMs)).append("\n");
    sb.append("    actualImprovementPercent: ").append(toIndentedString(actualImprovementPercent)).append("\n");
    sb.append("    storageAddedBytes: ").append(toIndentedString(storageAddedBytes)).append("\n");
    sb.append("    revertUntil: ").append(toIndentedString(revertUntil)).append("\n");
    sb.append("    appliedBy: ").append(toIndentedString(appliedBy)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
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

