package com.reservation.demo.model;
 
class Hello{
	private String train_no;
	private Long user_id;
	public String getTrain_no() {
		return train_no;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Hello [src=" + train_no + ", dest=" + user_id + "]";
	}
	
}
