package com.example.mb_be.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mb_be.model.entity.Member;


@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	List<Member> findByFullNameContaining(String fullName);
	List<Member> findByGenerationAndFamilytree_Id(int generation, int familyTreeId);
	List<Member> findByFatherOrMother(int father, int mother);
}
