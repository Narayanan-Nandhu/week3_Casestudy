package com29;

public class Policy {
	
	private String key;
	private String cost_of_policy;
	private String date_of_expiry;
	private String date_of_admission;
	private String date_of_discharge;
	private String medical_specialist;
	public Policy(String key, String cost_of_policy, String date_of_expiry,
			String date_of_admission, String date_of_discharge,
			String medical_specialist) {
		super();
		this.key = key;
		this.cost_of_policy = cost_of_policy;
		this.date_of_expiry = date_of_expiry;
		this.date_of_admission = date_of_admission;
		this.date_of_discharge = date_of_discharge;
		this.medical_specialist = medical_specialist;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getCost_of_policy() {
		return cost_of_policy;
	}
	public void setCost_of_policy(String cost_of_policy) {
		this.cost_of_policy = cost_of_policy;
	}
	public String getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(String date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public String getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public String getDate_of_discharge() {
		return date_of_discharge;
	}
	public void setDate_of_discharge(String date_of_discharge) {
		this.date_of_discharge = date_of_discharge;
	}
	public String getMedical_specialist() {
		return medical_specialist;
	}
	public void setMedical_specialist(String medical_specialist) {
		this.medical_specialist = medical_specialist;
	}
	
	
	

}
