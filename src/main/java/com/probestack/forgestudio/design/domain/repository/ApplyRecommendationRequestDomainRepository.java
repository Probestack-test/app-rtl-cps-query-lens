package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ApplyRecommendationRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ApplyRecommendationRequest domain operations.
 */
public interface ApplyRecommendationRequestDomainRepository {
    ApplyRecommendationRequest save(ApplyRecommendationRequest applyRecommendationRequest);

    Optional<ApplyRecommendationRequest> findById(String id);

    List<ApplyRecommendationRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
