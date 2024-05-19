package com.example.mb_be.model.response;

import java.util.List;

public class NuclearFamily {
	private MemberResponse mainMember;
	private List<MateMemberRequest> mateMembers;
	
	public MemberResponse getMainMember() {
		return mainMember;
	}
	public void setMainMember(MemberResponse mainMember) {
		this.mainMember = mainMember;
	}
	public List<MateMemberRequest> getMateMembers() {
		return mateMembers;
	}
	public void setMateMembers(List<MateMemberRequest> mateMembers) {
		this.mateMembers = mateMembers;
	}
}
