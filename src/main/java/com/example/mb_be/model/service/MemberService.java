package com.example.mb_be.model.service;

import java.util.List;

import com.example.mb_be.model.entity.Member;



public interface MemberService {
	Member createMember(Member member);
	Member updateMember(int id, Member member);
	Member getMemberById(int id);
	boolean deleteMember(int id);
	List<Member> getAllMember();
	List<Member> searchMemberByFullName(String fullName);
	
	Member saveOrUpdate(Member member);
	List<Member> findByGenerationAndFamilytree_Id(int generation, int familyTreeId);
	List<Member> findByFatherOrMother(int father, int mother);
}
