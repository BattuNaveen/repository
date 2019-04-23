package com.marker.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marker.dao.MarkerDao;
import com.marker.model.MarkerData;

@Service
@Transactional
public class MarkerServiceImpl implements MarkerService {

	@Autowired
	MarkerDao md;
	
	public MarkerData findByNumber(int number) {
		return md.findByNumber(number);
	}

	public List<MarkerData> findAll() {
		return md.findAll();
	}

	public void saveMarkerData(MarkerData data) {
       md.saveMarkerData(data);		
	}

}