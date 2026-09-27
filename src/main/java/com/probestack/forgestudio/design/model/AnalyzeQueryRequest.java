package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalyzeQueryRequest
 */
@JsonTypeName("analyzeQuery_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class AnalyzeQueryRequest {

  private String databaseId;

  /**
   * Gets or Sets querySource
   */
  public enum QuerySourceEnum {
    INLINE_SQL("INLINE_SQL"),
    
    SLOW_QUERY_LOG("SLOW_QUERY_LOG"),
    
    APM_TRACE("APM_TRACE"),
    
    ORM_GENERATED("ORM_GENERATED"),
    
    MANUAL_UPLOAD("MANUAL_UPLOAD");

    private String value;

    QuerySourceEnum(String value) {
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
    public static QuerySourceEnum fromValue(String value) {
      for (QuerySourceEnum b : QuerySourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private QuerySourceEnum querySource;

  private String inlineSql;

  private String slowQueryId;

  @Valid
  private Map<String, Object> parameters = new HashMap<>();

  private Boolean includeExplainAnalyze = false;

  /**
   * Environment context for recommendations.
   */
  public enum EnvironmentEnum {
    DEV("DEV"),
    
    STAGING("STAGING"),
    
    PRODUCTION("PRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
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
    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnvironmentEnum environment = EnvironmentEnum.STAGING;

  @Valid
  private Map<String, Object> applicationContext = new HashMap<>();

  public AnalyzeQueryRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalyzeQueryRequest(String databaseId, QuerySourceEnum querySource) {
    this.databaseId = databaseId;
    this.querySource = querySource;
  }

  public AnalyzeQueryRequest databaseId(String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Database identifier (from registered databases).
   * @return databaseId
  */
  @NotNull   @Schema(name = "databaseId", example = "payment-db-prod", description = "Database identifier (from registered databases).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("databaseId")
  public String getDatabaseId() {
    return databaseId;
  }

  public void setDatabaseId(String databaseId) {
    this.databaseId = databaseId;
  }

  public AnalyzeQueryRequest querySource(QuerySourceEnum querySource) {
    this.querySource = querySource;
    return this;
  }

  /**
   * Get querySource
   * @return querySource
  */
  @NotNull   @Schema(name = "querySource", example = "INLINE_SQL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("querySource")
  public QuerySourceEnum getQuerySource() {
    return querySource;
  }

  public void setQuerySource(QuerySourceEnum querySource) {
    this.querySource = querySource;
  }

  public AnalyzeQueryRequest inlineSql(String inlineSql) {
    this.inlineSql = inlineSql;
    return this;
  }

  /**
   * Required if querySource = INLINE_SQL.
   * @return inlineSql
  */
    @Schema(name = "inlineSql", example = "SELECT * FROM orders WHERE customer_id = 12345 AND status = 'PENDING' ORDER BY created_at DESC LIMIT 100;", description = "Required if querySource = INLINE_SQL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inlineSql")
  public String getInlineSql() {
    return inlineSql;
  }

  public void setInlineSql(String inlineSql) {
    this.inlineSql = inlineSql;
  }

  public AnalyzeQueryRequest slowQueryId(String slowQueryId) {
    this.slowQueryId = slowQueryId;
    return this;
  }

  /**
   * Required if querySource = SLOW_QUERY_LOG.
   * @return slowQueryId
  */
    @Schema(name = "slowQueryId", example = "sq-abc-123", description = "Required if querySource = SLOW_QUERY_LOG.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slowQueryId")
  public String getSlowQueryId() {
    return slowQueryId;
  }

  public void setSlowQueryId(String slowQueryId) {
    this.slowQueryId = slowQueryId;
  }

  public AnalyzeQueryRequest parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AnalyzeQueryRequest putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Optional bind parameters for prepared statements.
   * @return parameters
  */
    @Schema(name = "parameters", example = "{\"customer_id\":12345,\"status\":\"PENDING\"}", description = "Optional bind parameters for prepared statements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public Map<String, Object> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  public AnalyzeQueryRequest includeExplainAnalyze(Boolean includeExplainAnalyze) {
    this.includeExplainAnalyze = includeExplainAnalyze;
    return this;
  }

  /**
   * Run EXPLAIN ANALYZE (executes query, higher cost).
   * @return includeExplainAnalyze
  */
    @Schema(name = "includeExplainAnalyze", example = "false", description = "Run EXPLAIN ANALYZE (executes query, higher cost).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeExplainAnalyze")
  public Boolean getIncludeExplainAnalyze() {
    return includeExplainAnalyze;
  }

  public void setIncludeExplainAnalyze(Boolean includeExplainAnalyze) {
    this.includeExplainAnalyze = includeExplainAnalyze;
  }

  public AnalyzeQueryRequest environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Environment context for recommendations.
   * @return environment
  */
    @Schema(name = "environment", example = "PRODUCTION", description = "Environment context for recommendations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public AnalyzeQueryRequest applicationContext(Map<String, Object> applicationContext) {
    this.applicationContext = applicationContext;
    return this;
  }

  public AnalyzeQueryRequest putApplicationContextItem(String key, Object applicationContextItem) {
    if (this.applicationContext == null) {
      this.applicationContext = new HashMap<>();
    }
    this.applicationContext.put(key, applicationContextItem);
    return this;
  }

  /**
   * Which service and endpoint this query comes from.
   * @return applicationContext
  */
    @Schema(name = "applicationContext", example = "{\"service\":\"order-service\",\"endpoint\":\"GET /api/v1/orders\",\"p99LatencyMs\":847,\"callFrequencyPerMinute\":450}", description = "Which service and endpoint this query comes from.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationContext")
  public Map<String, Object> getApplicationContext() {
    return applicationContext;
  }

  public void setApplicationContext(Map<String, Object> applicationContext) {
    this.applicationContext = applicationContext;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeQueryRequest analyzeQueryRequest = (AnalyzeQueryRequest) o;
    return Objects.equals(this.databaseId, analyzeQueryRequest.databaseId) &&
        Objects.equals(this.querySource, analyzeQueryRequest.querySource) &&
        Objects.equals(this.inlineSql, analyzeQueryRequest.inlineSql) &&
        Objects.equals(this.slowQueryId, analyzeQueryRequest.slowQueryId) &&
        Objects.equals(this.parameters, analyzeQueryRequest.parameters) &&
        Objects.equals(this.includeExplainAnalyze, analyzeQueryRequest.includeExplainAnalyze) &&
        Objects.equals(this.environment, analyzeQueryRequest.environment) &&
        Objects.equals(this.applicationContext, analyzeQueryRequest.applicationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseId, querySource, inlineSql, slowQueryId, parameters, includeExplainAnalyze, environment, applicationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeQueryRequest {\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    querySource: ").append(toIndentedString(querySource)).append("\n");
    sb.append("    inlineSql: ").append(toIndentedString(inlineSql)).append("\n");
    sb.append("    slowQueryId: ").append(toIndentedString(slowQueryId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    includeExplainAnalyze: ").append(toIndentedString(includeExplainAnalyze)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    applicationContext: ").append(toIndentedString(applicationContext)).append("\n");
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

