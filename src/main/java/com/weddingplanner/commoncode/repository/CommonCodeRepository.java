package com.weddingplanner.commoncode.repository;

import java.util.List;
import java.util.Optional;

import com.weddingplanner.commoncode.domain.CommonCode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommonCodeRepository extends MongoRepository<CommonCode, String> {

    List<CommonCode> findByGroupCodeOrderByCodeAsc(String groupCode);

    Optional<CommonCode> findByGroupCodeAndCode(String groupCode, String code);
}
