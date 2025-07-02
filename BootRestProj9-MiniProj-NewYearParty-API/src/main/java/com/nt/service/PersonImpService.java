package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonEntity;
import com.nt.repositary.PersonRepository;
import com.nt.vo.PersonVO;
@Service("personService")
public class PersonImpService implements IPersonMgmtService {
	@Autowired
	private PersonRepository personRepo;

	@Override
	public String insertPerson(PersonVO personvo) {
		//convert PersonVo obj into personenntity
		PersonEntity personEntity=new PersonEntity();
		BeanUtils.copyProperties(personvo, personEntity);
		
		personEntity.setCreatedBy(System.getProperty("user.name"));
		//save the object
	PersonEntity p=	personRepo.save(personEntity);
		int idVal=p.getPid();
		return "Person Object is saved with id value:"+idVal;
	}

}
