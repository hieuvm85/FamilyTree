package com.example.mb_be.model.response;

import java.util.List;

public class NuclearFamily {
	private MemberResponse mainMember;
	private MemberResponse mateMember;
	private List<MemberResponse> soons;
	public MemberResponse getMainMember() {
		return mainMember;
	}
	public void setMainMember(MemberResponse mainMember) {
		this.mainMember = mainMember;
	}
	public MemberResponse getMateMember() {
		return mateMember;
	}
	public void setMateMember(MemberResponse mateMember) {
		this.mateMember = mateMember;
	}
	public List<MemberResponse> getSoons() {
		return soons;
	}
	public void setSoons(List<MemberResponse> soons) {
		this.soons = soons;
	}
	
	
}
