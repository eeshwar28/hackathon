package com.americanexpress.hackthon.restapi.request;

import java.io.Serializable;

public class PushRequest implements Serializable{

	public String alertTitle;
	public String alertSubTitle;
	public String alertBody;
	public String alertattachment;
	//public String alertTitle;
	
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
	@Override
	public String toString() {
		return String.format("PushRequest [alertTitle=%s, alertSubTitle=%s, alertBody=%s, alertattachment=%s]",
				alertTitle, alertSubTitle, alertBody, alertattachment);
	}
	
}
