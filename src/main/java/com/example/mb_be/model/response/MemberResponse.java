package com.example.mb_be.model.response;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mb_be.model.entity.Member;
import com.example.mb_be.model.service.MemberService;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class MemberResponse {
	private int id;
	private String fullName;
	private LocalDate dealDate;
	private LocalDate birthday;
	private int sex;
	
	private int generation;
	private String phone;
	
	private String maritalStatus;
	private String job;
	private String education;
	private String email;
	
	private int childPosition;
	
	private String photoURL;
	private String address;
	private int longevity;
	
	private LocalDate ngayGioAL;
	private String father;
	private String morhter;

	


	
	
	public MemberResponse(Member member,String nameFather,String nameMother) {		
		super();
		this.id = member.getId();
		this.fullName = member.getFullName();
		this.dealDate = member.getDealDate();
		this.birthday = member.getBirthday();
		this.sex = member.getSex();
		this.generation = member.getGeneration();
		this.phone = member.getPhone();
		this.maritalStatus = member.getMaritalStatus();
		this.job = member.getJob();
		this.education = member.getEducation();
		this.email = member.getEmail();
		this.childPosition = member.getChildPosition();
		this.photoURL = member.getPhotoURL();
		this.address = member.getAddress();
		this.longevity = member.getLongevity();
		this.ngayGioAL = member.getNgayGioAL();
		this.morhter = nameMother;
		this.father = nameFather;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDealDate() {
		return dealDate;
	}

	public void setDealDate(LocalDate dealDate) {
		this.dealDate = dealDate;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getChildPosition() {
		return childPosition;
	}

	public void setChildPosition(int childPosition) {
		this.childPosition = childPosition;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLongevity() {
		return longevity;
	}

	public void setLongevity(int longevity) {
		this.longevity = longevity;
	}

	public LocalDate getNgayGioAL() {
		return ngayGioAL;
	}

	public void setNgayGioAL(LocalDate ngayGioAL) {
		this.ngayGioAL = ngayGioAL;
	}



	public String getFather() {
		return father;
	}



	public void setFather(String father) {
		this.father = father;
	}



	public String getMorhter() {
		return morhter;
	}



	public void setMorhter(String morhter) {
		this.morhter = morhter;
	}
	
}
