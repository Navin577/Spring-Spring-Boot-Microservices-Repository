package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="jpa_student")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "STUDENT_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer sno;
	@Column(length=20)
	@NonNull
	private String sname;
	@Column(length=20)
	@NonNull
	private String scourse;
	@Column(length=20)
	@NonNull
	private Double sfee;
	
	//META DATA COLUMN
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDateTime CreateDate;
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDateTime updateDate;
	
	@Version
	private Integer updateCount;
	
	@Column(length = 20,updatable = false)
	private String createdBy;
	@Column(length = 20,insertable = false)
	private String updatedBy;
}
