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
		 
		 System.out.print("���"+p.getName()+"�������ǣ�");
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
			System.out.println(p.getName() + "����������ǣ�"+"["+pokerList.get(0).getColor()+pokerList.get(0).getPoker()+"]");
			checkPoker.add(pokerList.get(0));
	 }
	 
	 public static void getResult(Player p1,Player p2,List<Poker>checkPoker){
			Collections.sort(checkPoker,new PokerSort());
			System.out.println("˫����������ǣ�"+"["+checkPoker.get(0).getColor()+checkPoker.get(0).getPoker()+"]");
			System.out.println("���:");
			if(p2.PlayerPoker.contains(checkPoker.get(0))){
				System.out.println("****���2��ʤ****��-----"+p2.getName());
			}
			else{
				System.out.println("****���1��ʤ��****----"+p1.getName());
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
		System.out.println("----��ӭ���������˿�����Ϸ----");
		 System.out.println("�˿��ƴ������....");
		do {
			System.out.println("���������1--ID:");
			id = console.next();
			isNum = id.matches("[0-9]+");
			
			if (!isNum) {
				System.out.println("�����������͵�ID��");
			}
			else{
				
			System.out.println("���������1--����:");
			name = console.next();
			int Playerid=Integer.parseInt(id);
			 player1 = new Player(Playerid, name);
			System.out.println(player1.getName() + "��Ҵ����ɹ���");
	      
			}
			
			
		} while (!isNum);
		    System.out.println();
		   
		   
		do {
			System.out.println("���������2--ID:");
			id = console.next();
			isNum = id.matches("[0-9]+");
			
			if (!isNum) {
				System.out.println("�����������͵�ID��");
			}
			else{
				
			System.out.println("���������2--����:");
			name = console.next();
			int Playerid=Integer.parseInt(id);
			player2 = new Player(Playerid, name);
			System.out.println(player2.getName() + "��Ҵ����ɹ���");
			
		
			}
			
			
			
		} while (!isNum);
		  System.out.println("����׼��........");
		sendPoker(player1, cp);
		sendPoker(player2, cp);
	    System.out.println("�������...��������������.");
		getPoker(player1);
		getPoker(player2);
		getTheBigPoker(player1, checkPoker);
		getTheBigPoker(player2, checkPoker);
		getResult(player1, player2, checkPoker);

	}
}
