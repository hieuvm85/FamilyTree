package com.example.mb_be.model.entity;


import java.time.LocalDate;
import java.util.List;




import jakarta.persistence.*;


@Entity
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "full_name")
	private String fullName;
	private LocalDate dealDate;
	private LocalDate birthday;
	private int sex;
	
	private int father;
	private int mother;
	
	private int generation;
	private String phone;
	
	@Column(name= "marital_status")
	private String maritalStatus;
	private String job;
	private String education;
	private String email;
	
	@ElementCollection
	@CollectionTable(name = "member_mates")
	private List<Integer> mates;
	
	@Column(name = "child_position")
	private int childPosition;
	
	private String photoURL;
	private String address;
	private int longevity;
	
	
	private LocalDate ngayGioAL;
	
	@ManyToOne
	@JoinColumn(name = "familytree_id")
	private FamilyTree familytree;
	
	public FamilyTree getFamilyTree() {
		return familytree;
	}

	public void setFamilyTree(FamilyTree familytree) {
		this.familytree = familytree;
	}

	public int getId() {
		return id;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
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

	public int getFather() {
		return father;
	}

	public void setFather(int father) {
		this.father = father;
	}

	public int getMother() {
		return mother;
	}

	public void setMother(int mother) {
		this.mother = mother;
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



	public List<Integer> getMates() {
		return mates;
	}

	public void setMates(List<Integer> mates) {
		this.mates = mates;
	}

	public FamilyTree getFamilytree() {
		return familytree;
	}

	public void setFamilytree(FamilyTree familytree) {
		this.familytree = familytree;
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

	
}
