package com.poker;


public class Poker {
 
	 private String Poker;
	 
	 private String Color;
	 
	  public Poker(){
	  
		
		
	  }
	  public Poker(String color,String poker){
		  this.Color=color;
		  this.Poker=poker;
	  }

	public String getPoker() {
		return Poker;
	}

	public void setPoker(String poker) {
		Poker = poker;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
    
	
	  
	 
}
