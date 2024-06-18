package com.education.portal.common;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseBean {
	private String respcode;
	private String respmsg;
	private Object respString;

}