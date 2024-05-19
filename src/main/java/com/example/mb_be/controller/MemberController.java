package com.example.mb_be.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mb_be.model.entity.Member;
import com.example.mb_be.model.request.MemberRequest;
import com.example.mb_be.model.service.FamilyTreeService;
import com.example.mb_be.model.service.MemberService;
import com.example.mb_be.model.service.UserService;

@RestController
@RequestMapping("/api/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	@Autowired
	FamilyTreeService familyTreeService;
	@Autowired
	UserService userService;
	
	@PostMapping("/create/mate")
	public ResponseEntity<?> createMate(@RequestBody MemberRequest memberRequest,
			@RequestParam("idMember") int idMember)
	{
		Member member = new Member();
		
		member.setFullName(memberRequest.getFullName());
	    member.setDealDate(memberRequest.getDealDate());
	    member.setBirthday(memberRequest.getBirthday());
	    member.setPhone(memberRequest.getPhone());
	    member.setMaritalStatus(memberRequest.getMaritalStatus());
	    member.setJob(memberRequest.getJob());
	    member.setEducation(memberRequest.getEducation());
	    member.setEmail(memberRequest.getEmail());
	    member.setChildPosition(memberRequest.getChildPosition());
	    member.setPhotoURL(memberRequest.getPhotoURL());
	    member.setAddress(memberRequest.getAddress());
	    member.setLongevity(memberRequest.getLongevity());
	    
	    Member mate  = memberService.getMemberById(idMember);
	  
	   	member.setFamilyTree(mate.getFamilyTree());
	   	member.setGeneration(mate.getGeneration());
	   	List<Integer> mates = new ArrayList<>();
	   	mates.add(idMember);
	   	member.setMates(mates);

	   	member.setFather(0);
		member.setMother(0);

		memberService.saveOrUpdate(member);
		mates = mate.getMates();
		mates.add(member.getId());
		mate.setMates(mates);
		memberService.saveOrUpdate(mate);
		return ResponseEntity.ok(member);
	}
	@PostMapping("/create/soon")
	public ResponseEntity<?> createSoon(@RequestBody MemberRequest memberRequest,
			@RequestParam("idMember") int idMember)
	{
		Member member = new Member();
		
		member.setFullName(memberRequest.getFullName());
	    member.setDealDate(memberRequest.getDealDate());
	    member.setBirthday(memberRequest.getBirthday());
	    member.setSex(memberRequest.getSex());
	    member.setPhone(memberRequest.getPhone());
	    member.setMaritalStatus(memberRequest.getMaritalStatus());
	    member.setJob(memberRequest.getJob());
	    member.setEducation(memberRequest.getEducation());
	    member.setEmail(memberRequest.getEmail());
	    member.setChildPosition(memberRequest.getChildPosition());
	    member.setPhotoURL(memberRequest.getPhotoURL());
	    member.setAddress(memberRequest.getAddress());
	    member.setLongevity(memberRequest.getLongevity());
	    
	    Member faOrMo = memberService.getMemberById(idMember);
	  
	   	member.setFamilyTree(faOrMo.getFamilyTree());
	   	member.setGeneration(faOrMo.getGeneration()+1);
	   	member.setMates( new ArrayList<>());
	   	
	   	if(faOrMo.getSex()==0) {
	   		member.setFather(idMember);
	   		member.setMother(faOrMo.getMates().get(0));
	   	}
	   	else {
	   		member.setMother(idMember);
	   		member.setFather(faOrMo.getMates().get(0));
	   	}
		memberService.saveOrUpdate(member);
	
		return ResponseEntity.ok(member);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody MemberRequest memberRequest)
	{
		Member member = memberService.getMemberById(memberRequest.getId());
		member.setId(memberRequest.getId());
		member.setFullName(memberRequest.getFullName());
	    member.setDealDate(memberRequest.getDealDate());
	    member.setBirthday(memberRequest.getBirthday());
	    member.setSex(memberRequest.getSex());
	    member.setPhone(memberRequest.getPhone());
	    member.setMaritalStatus(memberRequest.getMaritalStatus());
	    member.setJob(memberRequest.getJob());
	    member.setEducation(memberRequest.getEducation());
	    member.setEmail(memberRequest.getEmail());
	    member.setChildPosition(memberRequest.getChildPosition());
	    member.setPhotoURL(memberRequest.getPhotoURL());
	    member.setAddress(memberRequest.getAddress());
	    member.setLongevity(memberRequest.getLongevity());	     
		memberService.saveOrUpdate(member);
		
		return ResponseEntity.ok(member);
	}
	
}
