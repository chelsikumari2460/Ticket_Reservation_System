package com.reservation.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Train {
	@Id
	private String train_no;
	private String train_name;
	private String src;
	private String dest;
	
	@OneToMany(mappedBy="trainobj" ,fetch = FetchType.LAZY)
	List<Ticket> tick;
	
	public List<Ticket> getTick() {
		return tick;
	}
	public void setTick(List<Ticket> tick) {
		this.tick = tick;
	}
	public String getTrain_no() {
		return train_no;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	@Override
	public String toString() {
		return "Train [train_no=" + train_no + ", train_name=" + train_name + ", src=" + src + ", dest=" + dest
				+ "]";
	}
	
}
