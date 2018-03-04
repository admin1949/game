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
		my=new person(id,player);
		my.setName(id);
		show(my);
	}
	public void show(person my){
		System.out.println("\tID："+my.getName());
		System.out.print("HP："+my.getHp()+"/"+my.getHp_max());
		System.out.print("MP："+my.getMp()+"/"+my.getMp_max()+"\n");
		System.out.println("攻击："+my.getAtk());
		System.out.println("力量："+my.getPower());
		System.out.println("智力："+my.getQuick());
		System.out.println("敏捷："+my.getBrain());
		System.out.println("体力："+my.getSpirit());
		System.out.println("等级："+my.getLv());
		System.out.println("经验值："+my.getExp()+"/"+my.getExp_max());
	}
}
