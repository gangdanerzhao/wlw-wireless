package com.wlw.wireless.query;

import org.hibernate.validator.constraints.NotBlank;

public class Query {

	
	private String vendorCode;
	
	private String time;
	
	private String stkName;
	
	private String orderBy;
	
	@NotBlank
	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStkName() {
		return stkName;
	}

	public void setStkName(String stkName) {
		this.stkName = stkName;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
