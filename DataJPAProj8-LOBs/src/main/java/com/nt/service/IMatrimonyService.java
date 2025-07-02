package com.nt.service;

import java.util.Optional;

import com.nt.entity.MarriageSeeker;

public interface IMatrimonyService {
	public String registerMarriageSeeker(MarriageSeeker seeker);
	public Optional<MarriageSeeker>searchSeekerById(Long id);

}
