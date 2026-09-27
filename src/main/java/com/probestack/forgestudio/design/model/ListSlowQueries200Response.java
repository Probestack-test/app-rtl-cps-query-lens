package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.probestack.forgestudio.design.model.ListSlowQueries200ResponseSummary;
import com.probestack.forgestudio.design.model.SlowQuery;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ListSlowQueries200Response
 */
@JsonTypeName("listSlowQueries_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")public class ListSlowQueries200Response {

  @Valid
  private List<@Valid SlowQuery> content;

  private Integer totalElements;

  private Integer totalPages;

  private ListSlowQueries200ResponseSummary summary;

  public ListSlowQueries200Response content(List<@Valid SlowQuery> content) {
    this.content = content;
    return this;
  }

  public ListSlowQueries200Response addContentItem(SlowQuery contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid   @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid SlowQuery> getContent() {
    return content;
  }

  public void setContent(List<@Valid SlowQuery> content) {
    this.content = content;
  }

  public ListSlowQueries200Response totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
    @Schema(name = "totalElements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public ListSlowQueries200Response totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
    @Schema(name = "totalPages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public ListSlowQueries200Response summary(ListSlowQueries200ResponseSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public ListSlowQueries200ResponseSummary getSummary() {
    return summary;
  }

  public void setSummary(ListSlowQueries200ResponseSummary summary) {
    this.summary = summary;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSlowQueries200Response listSlowQueries200Response = (ListSlowQueries200Response) o;
    return Objects.equals(this.content, listSlowQueries200Response.content) &&
        Objects.equals(this.totalElements, listSlowQueries200Response.totalElements) &&
        Objects.equals(this.totalPages, listSlowQueries200Response.totalPages) &&
        Objects.equals(this.summary, listSlowQueries200Response.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSlowQueries200Response {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

