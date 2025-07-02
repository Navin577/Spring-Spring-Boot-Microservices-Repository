package com.nt.repositary;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PersonEntity;
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}
