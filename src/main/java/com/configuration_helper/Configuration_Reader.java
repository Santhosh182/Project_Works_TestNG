package com.configuration_helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Configuration_Reader {
	public static Properties p;
public Configuration_Reader() throws IOException {
	File f = new File("C:\\Users\\Santhosh\\eclipse-workspace\\March22_PB\\src\\main\\java\\com\\property_TestData\\Configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	// TODO Auto-generated constructor stub
}
	public String get_config_url() throws IOException {
		String urllink = p.getProperty("url");
		return urllink;
	}
public String get_config_username() {
	
	String username = p.getProperty("username");
	return username;

}

public String get_config_password() {
	// TODO Auto-generated method stub
	String password = p.getProperty("password");
	return password;
}
public String get_config_location() {
	// TODO Auto-generated method stub
String location = p.getProperty("location");
return location;
}
public String get_config_hotel() {
	// TODO Auto-generated method stub
String hotelname = p.getProperty("hotel");
return hotelname;
}
public String get_config_room() {
	// TODO Auto-generated method stub
String roomname = p.getProperty("room");
return roomname;
}
public String get_config_roomno() {
	// TODO Auto-generated method stub
String roomno = p.getProperty("roomno");
return roomno;
}
public String get_config_checkindate() {
	// TODO Auto-generated method stub
String checkin = p.getProperty("checkindate");
return checkin;
}
public String get_config_checkoutdate() {
	// TODO Auto-generated method stub
String checkout = p.getProperty("checkoutdate");
return checkout;
}
public String get_config_adultroom() {
	// TODO Auto-generated method stub
String adultroom = p.getProperty("adultroom");
return adultroom;
}
public String get_config_childrenroom() {
	// TODO Auto-generated method stub
String childrenroom = p.getProperty("childrenroom");
return childrenroom;

}
public String get_config_firstname() {
	// TODO Auto-generated method stub
String firstname = p.getProperty("firstname");
return firstname;
}
public String get_config_lastname() {
	// TODO Auto-generated method stub
String lastnmae = p.getProperty("lastname");
return lastnmae;
}
public String get_config_address() {
	// TODO Auto-generated method stub
String address = p.getProperty("address");
return address;
}
public String get_config_creditcard() {
	// TODO Auto-generated method stub
	String credit = p.getProperty("creditcardno");
	return credit;
}
public String get_config_expirydate() {
	// TODO Auto-generated method stub
String expirydate = p.getProperty("expirydate");
return expirydate;
}
public String get_config_expiryyear() {
	// TODO Auto-generated method stub
String expiryyear = p.getProperty("expiryyear");
return expiryyear;
}

}
