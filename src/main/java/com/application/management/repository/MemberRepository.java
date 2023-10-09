package com.application.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
}