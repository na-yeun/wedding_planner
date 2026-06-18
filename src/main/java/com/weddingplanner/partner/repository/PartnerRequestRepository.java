package com.weddingplanner.partner.repository;

import java.util.List;

import com.weddingplanner.partner.domain.PartnerRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartnerRequestRepository extends MongoRepository<PartnerRequest, String> {

    List<PartnerRequest> findByRequesterIdOrReceiverId(String requesterId, String receiverId);
}
