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
		my=new person(1,player);
	}
}
