package com.family.repository;

import com.family.data.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by kesavan on 11/21/2015.
 */
@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends MongoRepository<Member,String>{
}
