package game;

import java.util.Scanner;

public class fight {
	private int i=1;//ս���غϼ�����
	private String mode;//ս��ģʽ
	static Scanner in = new Scanner(System.in);
	public static game g = new game();//��������ѡ�����¿�ʼ 
	public void fight1(person my,moster mon){
		System.out.println("��������һֻ"+mon.getLv()+"��"+mon.getName()+"����");
		mon.show();
		System.out.println("ѡ���Ƿ�ս����\n1.�Զ�ս��,\t2.�ֶ�ս��.\t3.����");
		mode = in.next();
		if(mode.equals("1")){
			while(my.getIs_alive()==1&&mon.getIs_alive()==1){
			fight2(my,mon);
		}
		}
		else if(mode.equals("2")){
			while(true){
				
			}
		}
		else if(mode.equals("3")){
			
		}
		
	
	}
	
	private void fight2(person my,moster mon){
		mon.setHp(mon.getHp()-my.getAtk());
		my.setHp(my.getHp()-mon.getAtk());
		if(my.getHp()<=0){
			my.setHp(0);
			my.setIs_alive(0);
		}
		if(mon.getHp()<0){
			mon.setHp(0);
		}
		System.out.println("***��"+i+"�غ�***");
		i++;
		System.out.println("����ǰʣ��Ѫ��"+my.getHp()+"/"+my.getHp_max());
		System.out.println("����ǰ����"+my.getAtk());
		System.out.println("���ﵱǰʣ��Ѫ��"+mon.getHp()+"/"+mon.getHp_max());
		System.out.println("���ﵱǰ����"+mon.getAtk());
		if(mon.getHp()<=0){
			win(my,mon);
		}
		else if (my.getIs_alive()==0){
			death(my);
		}
	}
	
	private void win(person my,moster mon){
		my.setExp(my.getExp()+mon.getExp());
		my.setGold(my.getGold()+mon.getGold());
		mon.setIs_alive(0);
		System.out.println("��ϲ���ʤ��");
		System.out.println("��þ���"+mon.getExp());
		System.out.println("��ý��"+mon.getGold());
		while(my.getExp()>=my.getExp_max()){
			lvup(my);
		}
	}
	
	private void death(person my){
		System.out.println("***��������***\n1.vip-ԭ�ظ���\n2.����ѡ���ɫ\n3.�˳���Ϸ");
		while(true){
			String chose=in.next();
			if(chose.equals("1")){
				System.out.println("***��������ֵ��vip�����ѽ�ԭ�ظ���");
				my.setHp(my.getHp_max());
				my.setIs_alive(1);
				break;
			}else if(chose.equals("2")){
				g.start();
				break;
			}else if(chose.equals("3")){
				System.exit(0);
			}else{
				System.out.println("������Ĳ���ȷ������������");
			}
		}
		
		
		
	}
	
	private void lvup(person my){
		System.out.println("***��ϲ��������,���5���������Ե�***");
		my.setLv(my.getLv()+1);
		my.setExp(my.getExp()-my.getExp_max());
		my.setExp_max(my.getLv()*50);
		my.setPoint(my.getPoint()+5);
		my.init_person();
		my.setHp(my.getHp_max());
		my.setMp(my.getMp_max());
		my.show();
	}
}
