package com.poker;

import java.util.HashSet;
import java.util.Set;

public class Player {
	
	private int id;
	private String name;
    public Set <Poker> PlayerPoker;
    
     public Player(){
    	
     }
     public Player(int id,String name){
    	 
    	 this.id=id;
    	 this.name=name;
    	 this.PlayerPoker=new HashSet<Poker>();
     }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
   
}
