package com.arushi.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	//HAS -A properties
	private  LocalTime  time;	
	private  LocalDate  date;
	// simple properties
	public int age;
	
	public WishMessageGenerator(LocalDate  date , LocalTime time, int age) {
		System.out.println("WishMessageGenerator:: 3-param constructor");
		this.time=time;
		this.date=date;
		this.age=age;
	}

	//setter method  for setter injection
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime(-)");
		this.time=time;
	}
	
	public  void  setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}
	public void  setAge(int age) {
		System.out.println("WishMessageGenerator.setAge()");
		this.age=age;
	}
	
	
	//business method
	public  String  showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()::"+time+"..."+date+"..."+age);
		//get current hour of the day
		int hour=time.getHour();
		//generate the wish message
		 if(hour<12)
			 return "Good Morning::"+user;
		 else if(hour<16)
			 return "Good AfterNoon::"+user;
		 else if(hour<20)
			 return "Good Evening ::"+user;
		 else
			 return "Good Night ::"+user;
	}
	

}
