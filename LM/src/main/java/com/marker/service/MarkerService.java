package com.marker.service;

import java.util.List;

import com.marker.model.MarkerData;

public interface MarkerService {

	MarkerData findByNumber(int number);
	List<MarkerData> findAll();
	void saveMarkerData(MarkerData data);
	
}
