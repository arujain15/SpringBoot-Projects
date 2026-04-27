package com.arushi.ston;

public class Printer {
	 private static Printer  INSTANCE;
	 
	 private  Printer() {
		System.out.println("Printer:: 0-param constructor");
	 }
		
		  //static factory method having singleton logic
		public  static Printer   getInstance() {
			  //singleton logic
			 if(INSTANCE==null)
				  INSTANCE=new Printer();
			
			 return INSTANCE;
		}
}
