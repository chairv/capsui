package com.capsui.bean;

import java.util.Date;

/**
 * Created by tancw on 2016/6/22.
 */
public class TempFlow {
	private long id;
	private String template_id;
	private String title;
	private String primary_industry;
	private String deputy_industry;
	private String content;
	private String example;
	private String access_token;
	private int status;
	private String openId;
	private Date createTime;
	private String remark;
	private String as_temp_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
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

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAs_temp_id() {
		return as_temp_id;
	}

	public void setAs_temp_id(String as_temp_id) {
		this.as_temp_id = as_temp_id;
	}
}
