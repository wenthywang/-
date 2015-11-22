package com.poker;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CreatePoker {
	
	 public Set<Poker> pokerSet;
	 
	 public CreatePoker(){
		 this.pokerSet=new HashSet<Poker>();
	 }
	 
	 public void getOne(){
		 String base="A23456789JQK";
    	 
    	 StringBuffer sb=new StringBuffer();
    	 
    	  for(int i=0;i<base.length();i++)
    	  {     
    	
    		  sb.append(base.charAt(i));
    		  
    		   System.out.println(sb.toString());
    		   sb.deleteCharAt(0);
    	  }
    
    	
	 }
     
    public void create(){
    	 String base="A23456789JQK";   	 
    	 StringBuffer sb=new StringBuffer();    	 
    	  for(int i=0;i<base.length();i++)
    	  {   sb.append(base.charAt(i));    		 
    		  Poker[] pk={new Poker("梅花",sb.toString()),new Poker("红桃",sb.toString()),
    				  new Poker("方块",sb.toString()),new Poker("黑桃",sb.toString())};
    		  pokerSet.addAll(Arrays.asList(pk));  		
    		   sb.deleteCharAt(0);
    	  }
         Poker[] pk1={new Poker("梅花","10"),new Poker("方块","10"),new Poker("黑桃","10"),new Poker("红桃","10")};
         pokerSet.addAll(Arrays.asList(pk1));

         System.out.println("*************************");
    }
   


}
