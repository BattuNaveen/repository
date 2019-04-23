package com.marker.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.marker.model.MarkerData;

@Repository
public class MarkerDaoImpl implements MarkerDao {

	@Autowired
    private SessionFactory sessionFactory;

	 protected Session getSession(){
	        return sessionFactory.getCurrentSession();
	    }
	 
	public MarkerData findByNumber(int number) {
 
		MarkerData num = (MarkerData) getSession().get(MarkerData.class, number);
		return num;
	}

	public void saveMarkerData(MarkerData data) {

		getSession().persist(data);
	}

	public List<MarkerData> findAll() {
 
    Criteria criteria = createEntityCriteria();
    return (List<MarkerData>) criteria.list();
	}
	
	protected Criteria createEntityCriteria(){
        return getSession().createCriteria(MarkerData.class);
    }
	
}
