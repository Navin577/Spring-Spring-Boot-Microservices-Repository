package com.nt.service;

import com.nt.entity.CallerTuneInfo;

public interface ICallerTuneInfoService {
	public String saveCallerTuneInfo(CallerTuneInfo info);
    public String updateTuneInfoById(Integer id,String tuneName,String movieName);
    public CallerTuneInfo showCallerTuneDetailsById(Integer id);
}
