package game;

import java.util.Scanner;

public class game {
	static Scanner in=new Scanner(System.in);
	public person my;
	public person monster;
	public void start(){
		System.out.println("***********��ӭ�������ߴ�ð��***********");
		System.out.println("���������ID��");
		String id = in.next();
		System.out.println("��ӭ" + id + "�������ߵ�����");
		System.out.println("��ѡ�����ְҵ��\t1.սʿ\t2.��ʦ\t3.����\t4.��ʦ");
		String player=in.next();
		my=new person(id,player);
		my.setName(id);
		show(my);
	}
	public void show(person my){
		System.out.println("\tID��"+my.getName());
		System.out.print("HP��"+my.getHp()+"/"+my.getHp_max());
		System.out.print("MP��"+my.getMp()+"/"+my.getMp_max()+"\n");
		System.out.println("������"+my.getAtk());
		System.out.println("������"+my.getPower());
		System.out.println("������"+my.getQuick());
		System.out.println("���ݣ�"+my.getBrain());
		System.out.println("������"+my.getSpirit());
		System.out.println("�ȼ���"+my.getLv());
		System.out.println("����ֵ��"+my.getExp()+"/"+my.getExp_max());
	}
}
