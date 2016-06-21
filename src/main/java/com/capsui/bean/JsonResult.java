package com.capsui.bean;

import java.io.Serializable;

public class JsonResult implements Serializable {
	private static final long serialVersionUID = 7553249056983455065L;
	private Integer success;
	private Object data;
	private ErrorMessage error;
	// 传递至前端的其他参数
	private Object others;

	public JsonResult(Integer success, Object data, String errorCode, String errorMessage) {
		this.data = data;
		this.success = success;
		if (success == 0) {
			this.error = new ErrorMessage(errorCode, errorMessage);
		}
	}

	public JsonResult(Integer success, Object data) {
		this.data = data;
		this.success = success;
	}

	public Integer getSuccess() {
		return success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorMessage getError() {
		return error;
	}

	public void setError(ErrorMessage error) {
		this.error = error;
	}

	public Object getOthers() {
		return others;
	}

	public void setOthers(Object others) {
		this.others = others;
	}

}

class ErrorMessage {
	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorMessage(String code, String message) {
		this.setCode(code);
		this.setMessage(message);
	}
}
