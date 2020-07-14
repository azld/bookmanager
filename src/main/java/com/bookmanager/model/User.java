package com.bookmanager.model;

import java.util.Calendar;

public class User {
	private String userName;
	private long   userId;
	private String userPassword;
	private String userType;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String userInfo()
	{
		String str = "";
		str = str + "name: " + this.getUserName();
		str = str + " type: " + this.getUserType();
		str = str + " userId: " + this.getUserId();
		str = str + "-------------------------";
		return str;
	}
	
	public void userRandom()
	{
		Calendar c = Calendar.getInstance();	//创建表示当前时间的Calendar对象
		int hour = c.get(Calendar.HOUR_OF_DAY);		//获得当前时间的小时
		int minute = c.get(Calendar.MINUTE);			//获得当前时间的分钟
		int second = c.get(Calendar.SECOND);			//获得当前时间的秒
		int millsecond = c.get(Calendar.MILLISECOND);			//获得当前时间的秒
		String name = hour + "-" + minute+"-" + second + millsecond;
		String type = "0" + second;
		this.setUserName(name);
		this.setUserType(type);
		this.setUserPassword(name);
	}
}
