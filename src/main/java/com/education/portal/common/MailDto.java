package com.education.portal.common;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MailDto {
	private String subject;
	private String message;
}
