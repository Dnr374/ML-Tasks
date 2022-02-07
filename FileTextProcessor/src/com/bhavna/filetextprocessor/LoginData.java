package com.bhavna.filetextprocessor;

public class LoginData {
String userName;
String date;
String time;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public LoginData(String userName, String date, String time) {
	super();
	this.userName = userName;
	this.date = date;
	this.time = time;
}
@Override
public String toString() {
	return  userName + " "+ date+" " + time;
}

}
