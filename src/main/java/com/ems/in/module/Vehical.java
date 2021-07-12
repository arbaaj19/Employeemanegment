package com.ems.in.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehical {
	public Vehical() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vid;
	@Column
	private String vname;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	
	
}
