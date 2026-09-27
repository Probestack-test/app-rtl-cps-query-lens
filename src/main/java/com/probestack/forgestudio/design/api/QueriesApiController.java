package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AnalyzeQueryRequest;
import com.probestack.forgestudio.design.model.ApplyRecommendationRequest;
import com.probestack.forgestudio.design.model.ListSlowQueries200Response;
import com.probestack.forgestudio.design.model.OptimizationAction;
import com.probestack.forgestudio.design.model.QueryAnalysis;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.QueriesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T04:45:24.605562200Z[GMT]")
@Controller
@RequestMapping("${openapi.queryLens.base-path:/v1}")
public class QueriesApiController implements QueriesApi {

    private static final Logger log = LoggerFactory.getLogger(QueriesApiController.class);

    private final QueriesService queriesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public QueriesApiController(QueriesService queriesService, GeneratedRequestValidator generatedRequestValidator) {
        this.queriesService = queriesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<QueryAnalysis> analyzeQuery(@RequestBody() AnalyzeQueryRequest analyzeQueryRequest) {
        log.info("Processing analyzeQuery request");
        try {
            generatedRequestValidator.validate("analyzeQuery", analyzeQueryRequest);
            var response = queriesService.analyzeQuery(analyzeQueryRequest);
            log.info("analyzeQuery completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process analyzeQuery: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<OptimizationAction> applyRecommendation(@PathVariable() UUID recommendationId, @RequestBody() ApplyRecommendationRequest applyRecommendationRequest) {
        log.info("Processing applyRecommendation request");
        try {
            generatedRequestValidator.validate("applyRecommendation", applyRecommendationRequest);
            var response = queriesService.applyRecommendation(recommendationId, applyRecommendationRequest);
            log.info("applyRecommendation completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process applyRecommendation: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<QueryAnalysis> getQueryAnalysis(@PathVariable() UUID analysisId, @RequestParam(value = "includeExplainPlan", required = false, defaultValue = "false") Boolean includeExplainPlan) {
        log.info("Processing getQueryAnalysis request");
        try {
            var response = queriesService.getQueryAnalysis(analysisId, includeExplainPlan);
            log.info("getQueryAnalysis completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getQueryAnalysis: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ListSlowQueries200Response> listSlowQueries(@RequestParam(value = "databaseId", required = false) String databaseId, @RequestParam(value = "minLatencyMs", required = false, defaultValue = "100") Integer minLatencyMs, @RequestParam(value = "minCallFrequency", required = false, defaultValue = "1") Integer minCallFrequency, @RequestParam(value = "environment", required = false, defaultValue = "PRODUCTION") String environment, @RequestParam(value = "orderBy", required = false, defaultValue = "TOTAL_TIME_CONSUMED") String orderBy, @RequestParam(value = "window", required = false, defaultValue = "LAST_24_HOURS") String window, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listSlowQueries request");
        try {
            var response = queriesService.listSlowQueries(databaseId, minLatencyMs, minCallFrequency, environment, orderBy, window, page, size);
            log.info("listSlowQueries completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listSlowQueries: {}", e.getMessage(), e);
            throw e;
        }
    }
}
