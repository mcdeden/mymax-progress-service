package com.mymax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymax.entity.ProspectingCustomerProgressComment;

@Repository
public interface ProspectingCustomerProgressCommentRepository extends JpaRepository<ProspectingCustomerProgressComment, String> {

}
