package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="NEW_YEAR_PARTY_REST")
public class PersonEntity {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "person_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@NonNull
	@Column(length=30)
	private String pname;
	@NonNull
	@Column(length=30)
	private String Gender;
	@NonNull
	@Column(length=30)
	private String Category;
	@NonNull
	private Double cost;
	@NonNull
	private LocalDateTime dob;
	
	@Version
	private Integer updateCount;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime creationTime;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime lastupdateCount;
	@Column(length=30)
	private String createdBy;
	@Column(length=30)
	private String updatedBy;
	@Column(length =30)
	private String status="active";
	
	
}
