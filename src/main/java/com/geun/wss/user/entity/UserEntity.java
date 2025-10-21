package com.geun.wss.user.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	@Id
	@Column(columnDefinition = "VARCHAR(30)")
	private String userId;
	@Column(columnDefinition = "VARCHAR(30)")
	private String userNm;
	@Column(columnDefinition = "CHAR(1)")
	private String userPos;
	@Column(columnDefinition = "CHAR(4)")
	private String deptId;
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime regDt;
}