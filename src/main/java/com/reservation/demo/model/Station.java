//package com.reservation.demo.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Station {
//	@Id    
//    @Column(nullable = false, unique = true, length = 8)
//    private String stn_code;
//     
//    @Column(nullable = false, length = 64)
//    private String stationName;
//     
//    @Column( nullable = false, length = 20)
//    private String city;
//     
//    @Column( nullable = false, length = 20)
//    private String state;
//    
//    @Column( nullable = false, length = 20)
//    private String pincode;
//
//	public String getStn_code() {
//		return stn_code;
//	}
//
//	public void setStn_code(String stn_No) {
//		this.stn_code = stn_No;
//	}
//
//	public String getStationName() {
//		return stationName;
//	}
//
//	public void setStationName(String stationName) {
//		this.stationName = stationName;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//
//	@Override
//	public String toString() {
//		return "Station [stn_code=" + stn_code + ", stationName=" + stationName + ", city=" + city + ", state=" + state
//				+ ", pincode=" + pincode + "]";
//	}
//    
//}
