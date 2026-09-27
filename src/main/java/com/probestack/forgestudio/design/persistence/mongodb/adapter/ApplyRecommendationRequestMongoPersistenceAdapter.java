package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ApplyRecommendationRequestDomainRepository;
import com.probestack.forgestudio.design.model.ApplyRecommendationRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.ApplyRecommendationRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ApplyRecommendationRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ApplyRecommendationRequestMongoPersistenceAdapter implements ApplyRecommendationRequestDomainRepository {
    private final ApplyRecommendationRequestMongoRepository repository;

    public ApplyRecommendationRequestMongoPersistenceAdapter(
            ApplyRecommendationRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ApplyRecommendationRequest save(ApplyRecommendationRequest applyRecommendationRequest) {
        ApplyRecommendationRequestDocument document = toDocument(applyRecommendationRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ApplyRecommendationRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ApplyRecommendationRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private ApplyRecommendationRequestDocument toDocument(
            ApplyRecommendationRequest applyRecommendationRequest) {
        ApplyRecommendationRequestDocument document = new ApplyRecommendationRequestDocument();
        BeanUtils.copyProperties(applyRecommendationRequest, document);
        return document;
    }

    private ApplyRecommendationRequest toDomain(ApplyRecommendationRequestDocument document) {
        ApplyRecommendationRequest domain = new ApplyRecommendationRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
