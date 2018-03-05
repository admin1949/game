package game;

import java.util.Scanner;

public class fight {
	private int i=1;//战斗回合计数器
	private String mode;//战斗模式
	static Scanner in = new Scanner(System.in);
	public static game g = new game();//死亡可以选择重新开始 
	public void fight1(person my,moster mon){
		System.out.println("你遇到了一只"+mon.getLv()+"的"+mon.getName()+"怪物");
		mon.show();
		System.out.println("选择是否战斗：\n1.自动战斗,\t2.手动战斗.\t3.逃跑");
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
		System.out.println("***第"+i+"回合***");
		i++;
		System.out.println("您当前剩余血量"+my.getHp()+"/"+my.getHp_max());
		System.out.println("您当前攻击"+my.getAtk());
		System.out.println("怪物当前剩余血量"+mon.getHp()+"/"+mon.getHp_max());
		System.out.println("怪物当前攻击"+mon.getAtk());
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
		System.out.println("恭喜获得胜利");
		System.out.println("获得经验"+mon.getExp());
		System.out.println("获得金币"+mon.getGold());
		while(my.getExp()>=my.getExp_max()){
			lvup(my);
		}
	}
	
	private void death(person my){
		System.out.println("***你已死亡***\n1.vip-原地复活\n2.重新选择角色\n3.退出游戏");
		while(true){
			String chose=in.next();
			if(chose.equals("1")){
				System.out.println("***由于您充值了vip，您已近原地复活");
				my.setHp(my.getHp_max());
				my.setIs_alive(1);
				break;
			}else if(chose.equals("2")){
				g.start();
				break;
			}else if(chose.equals("3")){
				System.exit(0);
			}else{
				System.out.println("你输入的不正确，请重新输入");
			}
		}
		
		
		
	}
	
	private void lvup(person my){
		System.out.println("***恭喜你升级了,获得5点自由属性点***");
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
