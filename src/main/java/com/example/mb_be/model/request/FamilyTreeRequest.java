package com.example.mb_be.model.request;

import java.time.LocalDateTime;

public class FamilyTreeRequest {

	private int id;
	private String title;
	private String address;
	private LocalDateTime creatAt;
	private LocalDateTime updateAt;
	private String creator;
	private String dynamicLink;
	private String published;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDateTime getCreatAt() {
		return creatAt;
	}
	public void setCreatAt(LocalDateTime creatAt) {
		this.creatAt = creatAt;
	}
	public LocalDateTime getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getDynamicLink() {
		return dynamicLink;
	}
	public void setDynamicLink(String dynamicLink) {
		this.dynamicLink = dynamicLink;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	
	
}
