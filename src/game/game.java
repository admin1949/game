package game;

import java.util.Scanner;

public class game {
	static Scanner in = new Scanner(System.in);
	public person my;
	public moster monster;

	public void start() {
		System.out.println("***********��ӭ�������ߴ�ð��***********");
		System.out.println("���������ID��");
		String id = in.next();
		System.out.println("��ӭ" + id + "�������ߵ�����");
		System.out.println("��ѡ�����ְҵ��\t1.սʿ\t2.��ʦ\t3.����\t4.��ʦ");
		String player = in.next();
		my = new person(player);
		my.setName(id);
		show(my);
		int i=0;
		int j=my.getHp();//��ǰѪ��
		while(true){
			System.out.println("��ѡ���Ƿ����̽�գ�\n1.�ߣ�����ȥ̽��\n2.��Ҫ�ڳ���ظ�Ѫ��ֵ���ظ�13�㣬ֻ��һ�Σ�\n3.�鿴��ǰ����״̬");
			String go=in.next();
			if(go.equals("1")){
				System.out.println("��ѡ���ͼ��\n1.���ִ�.��1-3��\t2.�¹��ֵأ�4-10��.\t3.�İ���.��11-15��\t4.����̦ԭ��16-20��\n5.�¿�ƥ˹ɽ����21-25��"
						+ "\t6.�˴����Ǵ�½��26-30��");
				String chose_map=in.next();
				monster=new moster(chose_map);//���ɹ���
				i=0;
				break;
			}else if(go.equals("2")){
				if(my.getHp()>=my.getHp_max()&&i<1){
					my.setHp(my.getHp()+13);
					my.setHp(my.getHp_max());
					System.out.print("�Ѿ�Ϊ���ظ�" + (my.getHp()-j) + "��Ѫ��ֵ��"+ j+"/"+my.getHp_max() +"->" + my.getHp() + "/" + my.getHp_max()+ "\n");
					i++;
				}else{
					System.out.println("���Ѿ�ʹ�ù��ü�����");
				}
			}else if(go.equals("3")){
				show(my);
			}else{
				System.out.println("������Ĳ���ȷ����������");
			}
		}
		
		
	}

	public void show(person my) {
		System.out.println("ID��" + my.getName());
		System.out.print("HP��" + my.getHp() + "/" + my.getHp_max()+ "\n");
		System.out.print("MP��" + my.getMp() + "/" + my.getMp_max() + "\n");
		System.out.print("������" + my.getAtk()+ "\n");
		System.out.print("������" + my.getPower());
		System.out.print("\t������" + my.getBrain()+ "\n");
		System.out.print("���ݣ�" + my.getQuick());
		System.out.print("\t������" + my.getSpirit()+ "\n");
		System.out.print("�ȼ���" + my.getLv()+ "\n");
		System.out.print("����ֵ��" + my.getExp() + "/" + my.getExp_max()+"\n");

	}
}
