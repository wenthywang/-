package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;


   
  
public class StartGame {
	

	 public static  void sendPoker(Player p,CreatePoker cp){
		 System.out.println("***************************");
	
	      Object[] obj= cp.pokerSet.toArray();
	       
	      Poker poker=new Poker();
	      for(int i=0;i<3;i++)
	      {
	    	  poker=(Poker) obj[i];
	    	  p.PlayerPoker.add(poker);
	    	  cp.pokerSet.remove(poker);
			
		}
	  
	    
	    
	    }
	 
	 public static void getPoker(Player p){
		 
		 System.out.print("玩家"+p.getName()+"的手牌是：");
		  for(Poker poker1:p.PlayerPoker){
			  System.out.print("["+poker1.getColor()+poker1.getPoker()+"]"+"");
			 
		  }
		  System.out.println();
	 }
	 public static void getTheBigPoker(Player p,List<Poker>checkPoker){
		
		 List<Poker> pokerList=new ArrayList<Poker>();
		    for (Poker poker : p.PlayerPoker) {
				pokerList.add(poker);
			}
		    Collections.sort(pokerList,new PokerSort());
			System.out.println(p.getName() + "的最大手牌是："+"["+pokerList.get(0).getColor()+pokerList.get(0).getPoker()+"]");
			checkPoker.add(pokerList.get(0));
	 }
	 
	 public static void getResult(Player p1,Player p2,List<Poker>checkPoker){
			Collections.sort(checkPoker,new PokerSort());
			System.out.println("双方最大手牌是："+"["+checkPoker.get(0).getColor()+checkPoker.get(0).getPoker()+"]");
			System.out.println("结果:");
			if(p2.PlayerPoker.contains(checkPoker.get(0))){
				System.out.println("****玩家2获胜****！-----"+p2.getName());
			}
			else{
				System.out.println("****玩家1获胜！****----"+p1.getName());
			}
	 }
	

	public static void main(String[] args) throws InterruptedException {
		
		 Scanner console = new Scanner(System.in);
		 List<Poker> checkPoker=new ArrayList<Poker>();
		 CreatePoker cp=new CreatePoker();
		 cp.create();
		Player player1=new Player();
		Player player2=new Player();
		String id;
		String name;
		boolean isNum;
		System.out.println("----欢迎来到简易扑克牌游戏----");
		 System.out.println("扑克牌创建完成....");
		do {
			System.out.println("请输入玩家1--ID:");
			id = console.next();
			isNum = id.matches("[0-9]+");
			
			if (!isNum) {
				System.out.println("请输入整数型的ID！");
			}
			else{
				
			System.out.println("请输入玩家1--名字:");
			name = console.next();
			int Playerid=Integer.parseInt(id);
			 player1 = new Player(Playerid, name);
			System.out.println(player1.getName() + "玩家创建成功！");
	      
			}
			
			
		} while (!isNum);
		    System.out.println();
		   
		   
		do {
			System.out.println("请输入玩家2--ID:");
			id = console.next();
			isNum = id.matches("[0-9]+");
			
			if (!isNum) {
				System.out.println("请输入整数型的ID！");
			}
			else{
				
			System.out.println("请输入玩家2--名字:");
			name = console.next();
			int Playerid=Integer.parseInt(id);
			player2 = new Player(Playerid, name);
			System.out.println(player2.getName() + "玩家创建成功！");
			
		
			}
			
			
			
		} while (!isNum);
		  System.out.println("发牌准备........");
		sendPoker(player1, cp);
		sendPoker(player2, cp);
	    System.out.println("发牌完成...。。。。。。。.");
		getPoker(player1);
		getPoker(player2);
		getTheBigPoker(player1, checkPoker);
		getTheBigPoker(player2, checkPoker);
		getResult(player1, player2, checkPoker);

	}
}
