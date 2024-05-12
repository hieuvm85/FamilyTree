package com.example.mb_be.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mb_be.model.entity.Member;
import com.example.mb_be.model.service.MemberService;
import com.example.mb_be.repository.MemberRepository;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public Member createMember(Member member) {
        return memberRepository.save(member);
    }
	@Override
	public Member updateMember(int id, Member member) {
		member.setId(id);
        return memberRepository.save(member);
    }
	@Override
	public boolean deleteMember(int id) {
        memberRepository.deleteById(id);
        return true;
    }
	@Override
	public Member getMemberById(int id) {
		return memberRepository.findById(id).orElse(null);
	}
	@Override
	public List<Member> getAllMember() {
        return memberRepository.findAll();
    }
	@Override
	public List<Member> searchMemberByFullName(String fullName) {
        return memberRepository.findByFullNameContaining(fullName);
    }
	@Override
	public Member saveOrUpdate(Member member) {
		// TODO Auto-generated method stub
		return memberRepository.save(member);
	}
	@Override
	public List<Member> findByGenerationAndFamilytree_Id(int generation, int familyTreeId) {
		// TODO Auto-generated method stub
		return memberRepository.findByGenerationAndFamilytree_Id(generation, familyTreeId);
	}
	@Override
	public List<Member> findByFatherOrMother(int father, int mother) {
		// TODO Auto-generated method stub
		return memberRepository.findByFatherOrMother(father, mother);
	}
	
	
}
	