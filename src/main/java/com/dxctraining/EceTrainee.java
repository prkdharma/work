package com.dxctraining;

public class EceTrainee extends Trainee {
	private String deviceUsed;;
	public EceTrainee(int id,String name,String deviceUsed)
	{
		super(id,name);
		this.deviceUsed=deviceUsed;
		
	}
	public String getDeviceUsed() {
		return deviceUsed;
	}
	public void setDeviceUsed(String deviceUsed) {
		this.deviceUsed = deviceUsed;
}}
