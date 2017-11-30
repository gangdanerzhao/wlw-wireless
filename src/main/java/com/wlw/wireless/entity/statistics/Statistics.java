package com.wlw.wireless.entity.statistics;

import java.math.BigDecimal;

public class Statistics {

	private String stkName;
	private BigDecimal pur;
	private BigDecimal  sales;
	private BigDecimal  wh;
	public String getStkName() {
		return stkName;
	}
	public void setStkName(String stkName) {
		this.stkName = stkName;
	}
	public BigDecimal getPur() {
		return pur;
	}
	public void setPur(BigDecimal pur) {
		this.pur = pur;
	}
	public BigDecimal getSales() {
		return sales;
	}
	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}
	public BigDecimal getWh() {
		return wh;
	}
	public void setWh(BigDecimal wh) {
		this.wh = wh;
	}
	
}
