package com.wlw.wireless.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Area{

	/**区域id*/
	private int areaId;
	/**组织代码*/
	private int orgNo;
	/**创建日期*/
	private Date createDate;
	/**修改日期*/
	private Date modifyDate;
	/**排序参数*/
	private int sortNo;
	/**区域级别（1、2、3）*/
	private int grade;
	/**区域名*/
	private String areaName;
	/**树形结构*/
	private String treePath;
	/**上级区域id*/
	private BigDecimal parentId;
	/**是否启用 Y是 N否*/
	private String statusFlg;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public int getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(int orgNo) {
		this.orgNo = orgNo;
	}

	public int getSortNo() {
		return sortNo;
	}

	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getTreePath() {
		return this.treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public String getStatusFlg() {
		return this.statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}
}