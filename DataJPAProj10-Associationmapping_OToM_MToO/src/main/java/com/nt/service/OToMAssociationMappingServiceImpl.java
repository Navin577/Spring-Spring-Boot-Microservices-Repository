package com.nt.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumber;
@Component
public class OToMAssociationMappingServiceImpl implements IOToMAssociationMgmtService {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumber phoneRepo;

	@Override
	public void saveDataUsingParent() {
		//create parent object
		Person per=new Person("raja","hyd");
		//create child Objects
		PhoneNumber ph1=new PhoneNumber(999999L,"airtel","personal");
		PhoneNumber ph2=new PhoneNumber(888888L,"Vi","office");
		
		//add parent to child
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		
		//add childs to parent
		Set<PhoneNumber> phoneSet=new HashSet();
		phoneSet.add(ph1);
		phoneSet.add(ph2);
		per.setContactDetails(phoneSet);
		
		//save the parent object
		personRepo.save(per);
		System.out.println("Person and his associated phoneNumbers are saved(parent to child)");
	}

	@Override
	public void saveDataUsingChild() {
		//create parent object
		Person per=new Person("ramesh","vizag");
		//create child objects
		PhoneNumber ph1=new PhoneNumber(888888L,"aitel","personal");
		PhoneNumber ph2=new PhoneNumber(777777L,"vi","oofice");
		
		//add parent to childs
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		
		//add childs to parent 
		Set<PhoneNumber> phonesSet=new HashSet();
		phonesSet.add(ph1);
		phonesSet.add(ph2);
		per.setContactDetails(phonesSet);
		
		//save the parent object
		phoneRepo.save(ph1);
		phoneRepo.save(ph2);
		System.out.println("Person and his associated phoneNumbers are saved(child to parent)");
	}

	@Override
	public void loadDataUsingParent() {
		Iterable<Person> it=personRepo.findAll();
		it.forEach(per->{
			System.out.println("parent::"+per);
			
			Set<PhoneNumber> childs=per.getContactDetails();
			System.out.println("childs count::"+childs.size());
			
			childs.forEach(ph->{
				System.out.println("child::"+ph.getMobileNo());
			});
		});
	}

}
