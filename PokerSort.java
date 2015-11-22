package com.poker;

import java.util.Comparator;

public class PokerSort implements Comparator<Poker> {

	@Override
	public int compare(Poker o1, Poker o2) {
		// TODO Auto-generated method stub
		if(toInt(o2)-toInt(o1)>0)
		{
		return toInt(o2)-toInt(o1);
		}
		else if(toInt(o2)-toInt(o1)<0){
			return toInt(o2)-toInt(o1);
		}
		else {
			return toInt1(o2)-toInt1(o1);
		}
		
	}
	private int toInt(Poker poker) {
	    String str = (String) poker.getPoker();
	    str = str.replaceAll("A", "14");
	    str = str.replaceAll("2", "2");
	    str = str.replaceAll("3", "3");
	    str = str.replaceAll("4", "4");
	    str = str.replaceAll("5", "5");
	    str = str.replaceAll("6", "6");
	    str = str.replaceAll("7", "7");
	    str = str.replaceAll("8", "8");
	    str = str.replaceAll("9", "9");
	    str = str.replaceAll("10", "10");
	    str = str.replaceAll("J", "11");
	    str = str.replaceAll("Q", "12");
	    str = str.replaceAll("K", "13");
	    
	    
	    
	    // 
	    return Integer.parseInt(str);
	  }
	private int toInt1(Poker poker) {
	    String str = (String) poker.getColor();
	    str = str.replaceAll("黑桃", "4");
	    str = str.replaceAll("红桃", "3");
	    str = str.replaceAll("梅花", "2");
	    str = str.replaceAll("方块", "1");

	    return Integer.parseInt(str);
	  }

}
