package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.entity.CallerTuneInfo;
import com.nt.repository.ICallertuneRepositorye;

import jakarta.transaction.Transactional;
@Service
public class CallerTuneInfoServiceImpl implements ICallerTuneInfoService {
	@Autowired
	private ICallertuneRepositorye callerTuneRepo;

	@Override
	@Transactional
	public String saveCallerTuneInfo(CallerTuneInfo info) {
        Integer idVal=callerTuneRepo.save(info).getTuneId();
		return "CallerTune is saved with the id value::"+idVal;
	}

	@Override
	public String updateTuneInfoById(Integer id, String tuneName, String movieName) {
		Optional<CallerTuneInfo> opt=callerTuneRepo.findById(id);
		if(opt.isPresent())
		{
			CallerTuneInfo info=opt.get();
			info.setTuneName(tuneName);
			info.setMovieName(movieName);
			CallerTuneInfo tune=callerTuneRepo.save(info);
			return "Object is updated for"+tune.getUpdatedCount()+"times....lastly modified on:"+tune.getLastlyUpdatedOn()+"...created on::"+tune.getServiceOptedon();
		}else {
		return "CallerTuneService is not found";
	}
	}
	@Override
	public CallerTuneInfo showCallerTuneDetailsById(Integer id) {
		// TODO Auto-generated method stub
		return callerTuneRepo.findById(id).orElseThrow(()->new IllegalArgumentException("caller tune not found"));
	}

}
