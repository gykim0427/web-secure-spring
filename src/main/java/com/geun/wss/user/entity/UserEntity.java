package com.geun.wss.user.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	
	@Id
	private String userId;
	private String userNm;
	private String userPos;
	private String deptId;
	private LocalDateTime regDt;
	
	protected UserEntity() {};
	
	public UserEntity(String userId, String userNm, String userPos, String deptId, LocalDateTime regDt) {
		super();
		this.userId = userId;
		this.userNm = userNm;
		this.userPos = userPos;
		this.deptId = deptId;
		this.regDt = regDt;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserPos() {
		return userPos;
	}
	public void setUserPos(String userPos) {
		this.userPos = userPos;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public LocalDateTime getRegDt() {
		return regDt;
	}
	public void setRegDt(LocalDateTime regDt) {
		this.regDt = regDt;
	}
}
