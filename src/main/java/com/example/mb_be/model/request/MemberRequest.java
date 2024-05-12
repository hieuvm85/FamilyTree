package com.example.mb_be.model.request;

import java.time.LocalDate;


public class MemberRequest {

	private int id;
	private String fullName;
	private LocalDate dealDate;
	private LocalDate birthday;
	private int sex;
//	private int father;
//	private int mother;
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
	
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
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
//	public int getFather() {
//		return father;
//	}
//	public void setFather(int father) {
//		this.father = father;
//	}
//	public int getMother() {
//		return mother;
//	}
//	public void setMother(int mother) {
//		this.mother = mother;
//	}
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
//	public int getMate() {
//		return mate;
//	}
//	public void setMate(int mate) {
//		this.mate = mate;
//	}
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
}
