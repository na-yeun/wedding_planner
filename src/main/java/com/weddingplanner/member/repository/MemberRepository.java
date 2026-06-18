package com.weddingplanner.member.repository;

import java.util.Optional;

import com.weddingplanner.member.domain.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, String> {

    Optional<Member> findByMemId(String memId);

    Optional<Member> findByPhone(String phone);
}
