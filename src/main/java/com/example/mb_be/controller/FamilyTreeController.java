package com.example.mb_be.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mb_be.model.entity.FamilyTree;
import com.example.mb_be.model.entity.Member;
import com.example.mb_be.model.entity.User;
import com.example.mb_be.model.request.FamilyTreeRequest;
import com.example.mb_be.model.response.MemberResponse;
import com.example.mb_be.model.response.NuclearFamily;
import com.example.mb_be.model.service.FamilyTreeService;
import com.example.mb_be.model.service.MemberService;
import com.example.mb_be.model.service.UserService;

@RestController
@RequestMapping("/api/familyTree")
public class FamilyTreeController {
	
	@Autowired
	FamilyTreeService familyTreeService;
	@Autowired
	UserService userService;
	@Autowired
	MemberService memberService;
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody FamilyTreeRequest familyTreeRequest , @RequestParam("idUser") int idUser){
		FamilyTree familyTree = new FamilyTree();
		
		familyTree.setTitle(familyTreeRequest.getTitle());
	    familyTree.setAddress(familyTreeRequest.getAddress());
	    familyTree.setCreatAt(familyTreeRequest.getCreatAt());
	    familyTree.setUpdateAt(familyTreeRequest.getUpdateAt());
	    familyTree.setCreator(familyTreeRequest.getCreator());
	    familyTree.setDynamicLink(familyTreeRequest.getDynamicLink());
	    familyTree.setPublished(familyTreeRequest.getPublished());
	    
	    User user = userService.getUserById(idUser);
	    familyTree.setUser(user);
	    
	    
	    
	    
		Member member = new Member();
		
		member.setFullName("");
	    member.setDealDate(null);
	    member.setBirthday(null);
	    member.setGeneration(1);
	    member.setPhone("");
	    member.setMaritalStatus("");
	    member.setJob("");
	    member.setEducation("");
	    member.setEmail("");
	    member.setChildPosition(0);
	    member.setPhotoURL("https://inkythuatso.com/uploads/thumbnails/800/2023/03/9-anh-dai-dien-trang-inkythuatso-03-15-27-03.jpg");
	    member.setAddress("");
	    member.setLongevity(0);
	    member.setFather(-1);
	    member.setMother(-1);
	    
	    
	    familyTree.setMember(new ArrayList<>());
	    
	    
	    
	    familyTree.setAlbum(new ArrayList<>());
	    familyTreeService.saveOrUpdate(familyTree);
	    
	    member.setFamilyTree(familyTree);
	    memberService.saveOrUpdate(member);
		return ResponseEntity.ok(familyTree);
		
		
		
	}
	
	@GetMapping("/gets")
	public ResponseEntity<?> create( @RequestParam("idUser") int idUser){
		User user = userService.getUserById(idUser);
		return ResponseEntity.ok(user.getFamilyTree()); 
	}
	
	@GetMapping("/getGenTree")
	public ResponseEntity<?> getGenFamilyByGeneration(@RequestParam("idTree") int idTree){
		FamilyTree familyTree = familyTreeService.getFamilyTreeById(idTree);
		List<Member> members = familyTree.getMember();
		int maxGen=1;
		for(Member member: members) {
			if(member.getGeneration()>maxGen)
				maxGen = member.getGeneration();
		}
		
		return ResponseEntity.ok(maxGen); 
	}
	@GetMapping("/getTree")
	public ResponseEntity<?> getFamilyByGeneration(@RequestParam("idTree") int idTree,@RequestParam("gen") int gen){

			List<Member> members = memberService.findByGenerationAndFamilytree_Id(gen, idTree) ;
			List<NuclearFamily> data= new ArrayList<>();
			for(Member member:members) {
				if(member.getFather()!=0) {
					NuclearFamily nuclearFamily = new NuclearFamily();
					nuclearFamily.setMainMember(new MemberResponse(member));
					if(member.getMate()!=0)
						nuclearFamily.setMateMember(new MemberResponse(memberService.getMemberById(member.getMate())));	
					List<Member> soons = memberService.findByFatherOrMother(member.getId(),member.getId());
					List<MemberResponse> soonsRes = new ArrayList<>();
					for(Member soon:soons) {
						soonsRes.add(new MemberResponse(soon));
					}
					nuclearFamily.setSoons(soonsRes);
					data.add(nuclearFamily);
				}
			}
		return ResponseEntity.ok(data); 
	}
	
}
