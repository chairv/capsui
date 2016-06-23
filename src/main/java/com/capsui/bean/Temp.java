package com.capsui.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by qiao on 2016/6/17.
 */
public class Temp implements Serializable {
	private String id;
	private String title;
	private String primary_industry;
	private String deputy_industry;
	private String content;
	private String example;
	private String remark;
	private Date createTime;
	private int status;

	public Temp() {
	}

	public Temp(TempFlow flow) {
		this.title = flow.getTitle();
		this.primary_industry = flow.getPrimary_industry();
		this.deputy_industry = flow.getDeputy_industry();
		this.content = flow.getContent();
		this.example = flow.getExample();
		this.createTime = new Date();
		this.status = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrimary_industry() {
		return primary_industry;
	}

	public void setPrimary_industry(String primary_industry) {
		this.primary_industry = primary_industry;
	}

	public String getDeputy_industry() {
		return deputy_industry;
	}

	public void setDeputy_industry(String deputy_industry) {
		this.deputy_industry = deputy_industry;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
