package com.bhavna.area;

import com.bhavna.state.State;

public class Area extends State {
	String areaName;
	int zipCode;
	
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "AreaName :" + areaName +"  ZipCode:" + zipCode + "  StateName:" + super.getStateName() +"  countryName:"
				+ countryName ;
	}
	
	public Area(String countryName,String stateName,String areaName, int zipCode) {
		super.setCountryName(countryName);
		super.setStateName(stateName);
		this.areaName = areaName;
		this.zipCode = zipCode;
	}
	
	
}
