package com.americanexpress.hackthon.restapi.request;

import java.io.Serializable;

public class PushRequest implements Serializable{

	public String alertTitle;
	public String alertSubTitle;
	public String alertBody;
	public String alertattachment;
	public String securityData;
	public String accountToken;
	
	public String getAlertTitle() {
		return alertTitle;
	}
	public void setAlertTitle(String alertTitle) {
		this.alertTitle = alertTitle;
	}
	public String getAlertSubTitle() {
		return alertSubTitle;
	}
	public void setAlertSubTitle(String alertSubTitle) {
		this.alertSubTitle = alertSubTitle;
	}
	public String getAlertBody() {
		return alertBody;
	}
	public void setAlertBody(String alertBody) {
		this.alertBody = alertBody;
	}
	public String getAlertattachment() {
		return alertattachment;
	}
	public void setAlertattachment(String alertattachment) {
		this.alertattachment = alertattachment;
	}
	public String getSecurityData() {
		return securityData;
	}
	public void setSecurityData(String securityData) {
		this.securityData = securityData;
	}
	public String getAccountToken() {
		return accountToken;
	}
	public void setAccountToken(String accountToken) {
		this.accountToken = accountToken;
	}
	@Override
	public String toString() {
		return String.format("PushRequest [alertTitle=%s, alertSubTitle=%s, alertBody=%s, alertattachment=%s]",
				alertTitle, alertSubTitle, alertBody, alertattachment);
	}
	
}
