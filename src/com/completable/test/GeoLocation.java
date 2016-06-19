package com.completable.test;

public class GeoLocation {

	private String area;
	
	public GeoLocation (String area) {
		this.area = area;
	}
	public GeoLocation trackDevice() {
		return new GeoLocation("EGIL");
	}
	public String getArea() {
		return area;
	}
	
}
