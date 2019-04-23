package com.marker.dao;

import java.util.List;

import com.marker.model.MarkerData;

public interface MarkerDao {

	MarkerData findByNumber(int number);
	List<MarkerData> findAll();
	void saveMarkerData(MarkerData data);
}