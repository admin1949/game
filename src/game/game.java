package game;

import java.util.Scanner;

public class game {
	static Scanner in=new Scanner(System.in);
	public person my;
	public person monster;
	public void start(){
		System.out.println("***********欢迎来到勇者大冒险***********");
		System.out.println("请输入你的ID：");
		String id = in.next();
		System.out.println("欢迎" + id + "进入勇者的世界");
		System.out.println("请选择你的职业：\t1.战士\t2.法师\t3.盗贼\t4.牧师");
		String player=in.next();
		my=new person(1,player);
	}
}
