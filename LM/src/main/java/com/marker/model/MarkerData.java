package com.marker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MARKERDATA")
public class MarkerData {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="ID")
		private Integer id;
		
		
		@Size(min=10, max=12)
		@Column(name ="NUMBER", unique=true, nullable=false)
		private int number;
		
		@NotEmpty                                                //The CharSequence, Collection, Map or Array object is not null and size > 0
		@Column(name ="STATE", nullable=false )
		private String state;
		
		public MarkerData() {
		}
		
		public MarkerData(int number, String state) {
			super();
			this.number = number;
			this.state = state;
		}
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		
	}
