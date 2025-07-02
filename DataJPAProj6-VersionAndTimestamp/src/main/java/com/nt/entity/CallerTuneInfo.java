package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="CallerTuneInfo")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CallerTuneInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer tuneId;
	
	@Column(length=20)
	@NonNull
	private String tuneName;
	
	@Column(length=20)
	@NonNull
	private String movieName;
	
	@Version
	@Column(name="UPDATE_COUNT")
	private Integer updatedCount;
	
	
	  @Column(name="SERVICE_OPTED_ON")
	 	@CreationTimestamp
		/*
		 * @Column(insertable=true)
		 */	private LocalDateTime serviceOptedon;
	
	
	  @Column(name="LASTLY_UPDATED_ON")
	 	@UpdateTimestamp
		/*
		 * @Column(insertable=false)
		 */	private LocalDateTime lastlyUpdatedOn;

}
