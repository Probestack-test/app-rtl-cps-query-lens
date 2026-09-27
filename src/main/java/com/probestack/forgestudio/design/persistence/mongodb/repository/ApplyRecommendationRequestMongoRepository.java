package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ApplyRecommendationRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ApplyRecommendationRequest documents.
 */
public interface ApplyRecommendationRequestMongoRepository extends MongoRepository<ApplyRecommendationRequestDocument, String> {
}
