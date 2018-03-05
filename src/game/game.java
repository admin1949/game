package game;

import java.util.Scanner;

public class game {
	static Scanner in = new Scanner(System.in);
	public person my;// 声明玩家类
	public moster mon_1,mon_2,mon_3;//声明3个怪物父类，每次选择出城生成3个

	public void start() {
		System.out.println("***********欢迎来到勇者大冒险***********");
		System.out.println("请输入你的ID：");
		String id = in.next();
		System.out.println("欢迎" + id + "进入勇者的世界");
		System.out.println("请选择你的职业：\n1.战士\t2.法师\t3.盗贼\t4.牧师");
		String player = in.next();
		my = new person(player);
		my.setName(id);
		my.show();
		int i=0;
		int j=my.getHp();//当前血量
		while(true){
			System.out.println("请选择是否出城探险：\n1.走，我们去探险\n2.我要在城里回复血量值（回复13点，只限一次）\n3.查看当前自身状态");
			String go=in.next();
			if(go.equals("1")){
				System.out.println("请选择地图：\n1.新手村.（1-5）\t2.月光林地（6-10）.\t3.幽暗城.（11-15）\t4.北风苔原（16-20）\n5.奥克匹斯山脉（21-25）"
						+ "\t6.潘达利亚大陆（26-30）");
				String chose_map=in.next();
				mon_1=new moster(chose_map);//生成怪物
				mon_2=new moster(chose_map);//生成怪物
				mon_3=new moster(chose_map);//生成怪物
				i=0;
				break;
			}else if(go.equals("2")){
				if(my.getHp()>=my.getHp_max()&&i<1){
					my.setHp(my.getHp()+13);
					my.setHp(my.getHp_max());
					System.out.print("已经为您回复" + (my.getHp()-j) + "点血量值："+ j+"/"+my.getHp_max() +"->" + my.getHp() + "/" + my.getHp_max()+ "\n");
					i++;
				}else{
					System.out.println("您已经使用过该技能了");
				}
			}else if(go.equals("3")){
				my.show();
			}else{
				System.out.println("您输入的不正确请重新输入");
			}
		}
		
		
	}

	

}
