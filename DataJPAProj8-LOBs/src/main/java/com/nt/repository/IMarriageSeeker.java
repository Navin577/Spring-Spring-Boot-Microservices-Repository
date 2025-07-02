package com.nt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.MarriageSeeker;
@Repository
public interface IMarriageSeeker extends JpaRepository<MarriageSeeker, Integer> {

	Optional<MarriageSeeker> findById(Long id);
	
	

}
