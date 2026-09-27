package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SlowQueryApplicationContext
 */
@JsonTypeName("SlowQuery_applicationContext")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class SlowQueryApplicationContext {

  private String service;

  private String endpoint;

  private String owner;

  public SlowQueryApplicationContext service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
    @Schema(name = "service", example = "order-service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SlowQueryApplicationContext endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
  */
    @Schema(name = "endpoint", example = "GET /api/v1/orders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public SlowQueryApplicationContext owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
    @Schema(name = "owner", example = "order-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlowQueryApplicationContext slowQueryApplicationContext = (SlowQueryApplicationContext) o;
    return Objects.equals(this.service, slowQueryApplicationContext.service) &&
        Objects.equals(this.endpoint, slowQueryApplicationContext.endpoint) &&
        Objects.equals(this.owner, slowQueryApplicationContext.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, endpoint, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlowQueryApplicationContext {\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

