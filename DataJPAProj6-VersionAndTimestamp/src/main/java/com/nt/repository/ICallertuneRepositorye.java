package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.CallerTuneInfo;
@Repository
public interface ICallertuneRepositorye extends JpaRepository<CallerTuneInfo, Integer> {

}
