package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ApplyRecommendationRequest
 */
@JsonTypeName("applyRecommendation_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class ApplyRecommendationRequest {

  /**
   * How to apply the change.
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

  private String reason;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledAt;

  private Integer revertWindowMinutes = 60;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    PAGERDUTY("PAGERDUTY"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
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
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  public ApplyRecommendationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplyRecommendationRequest(ModeEnum mode, String reason) {
    this.mode = mode;
    this.reason = reason;
  }

  public ApplyRecommendationRequest mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * How to apply the change.
   * @return mode
  */
  @NotNull   @Schema(name = "mode", example = "CANARY_ON_REPLICA", description = "How to apply the change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public ApplyRecommendationRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "Index on orders(customer_id, status) — canary on read replica first.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ApplyRecommendationRequest scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * Required if mode = SCHEDULED (low-traffic window recommended).
   * @return scheduledAt
  */
  @Valid   @Schema(name = "scheduledAt", example = "2026-09-28T02:00Z", description = "Required if mode = SCHEDULED (low-traffic window recommended).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledAt")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public ApplyRecommendationRequest revertWindowMinutes(Integer revertWindowMinutes) {
    this.revertWindowMinutes = revertWindowMinutes;
    return this;
  }

  /**
   * How long the change can be reverted.
   * minimum: 5
   * maximum: 1440
   * @return revertWindowMinutes
  */
  @Min(5) @Max(1440)   @Schema(name = "revertWindowMinutes", example = "60", description = "How long the change can be reverted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revertWindowMinutes")
  public Integer getRevertWindowMinutes() {
    return revertWindowMinutes;
  }

  public void setRevertWindowMinutes(Integer revertWindowMinutes) {
    this.revertWindowMinutes = revertWindowMinutes;
  }

  public ApplyRecommendationRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public ApplyRecommendationRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Get notifyChannels
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyRecommendationRequest applyRecommendationRequest = (ApplyRecommendationRequest) o;
    return Objects.equals(this.mode, applyRecommendationRequest.mode) &&
        Objects.equals(this.reason, applyRecommendationRequest.reason) &&
        Objects.equals(this.scheduledAt, applyRecommendationRequest.scheduledAt) &&
        Objects.equals(this.revertWindowMinutes, applyRecommendationRequest.revertWindowMinutes) &&
        Objects.equals(this.notifyChannels, applyRecommendationRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, reason, scheduledAt, revertWindowMinutes, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyRecommendationRequest {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    revertWindowMinutes: ").append(toIndentedString(revertWindowMinutes)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
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

