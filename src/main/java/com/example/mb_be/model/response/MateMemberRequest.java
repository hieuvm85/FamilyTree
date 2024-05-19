package com.example.mb_be.model.response;

import java.util.List;

public class MateMemberRequest {
	private MemberResponse mate;
	private List<MemberResponse> soons;
	public MemberResponse getMate() {
		return mate;
	}
	public void setMate(MemberResponse mate) {
		this.mate = mate;
	}
	public List<MemberResponse> getSoons() {
		return soons;
	}
	public void setSoons(List<MemberResponse> soons) {
		this.soons = soons;
	}
	
	
}
