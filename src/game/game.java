package game;

import java.util.Scanner;

public class game {
	static Scanner in = new Scanner(System.in);
	public person my;// ���������
	public moster mon_1, mon_2, mon_3;// ����3�����︸�࣬ÿ��ѡ���������3��
	static fight fight = new fight();

	public void start() {
		System.out.println("***********��ӭ�������ߴ�ð��***********");
		System.out.println("���������ID��");
		String id = in.next();
		System.out.println("��ӭ" + id + "�������ߵ�����");
		System.out.println("��ѡ�����ְҵ��\n1.սʿ\t2.��ʦ\t3.����\t4.��ʦ");
		String player = in.next();
		my = new person(player);
		my.setName(id);
		my.show();
		int i = 0;
		int j = my.getHp();// ��ǰѪ��
		while (true) {
			System.out.println("��ѡ���Ƿ����̽�գ�\n1.�ߣ�����ȥ̽��\n2.��Ҫ�ڳ���ظ�Ѫ��ֵ���ظ�13�㣬ֻ��һ�Σ�\n3.�鿴��ǰ����״̬");
			String go = in.next();
			if (go.equals("1")) {
				System.out.println("��ѡ���ͼ��\n1.���ִ�.��1-5��\t2.�¹��ֵأ�6-10��.\t3.�İ���.��11-15��\t4.����̦ԭ��16-20��\n5.�¿�ƥ˹ɽ����21-25��"
						+ "\t6.�˴����Ǵ�½��26-30��");
				String chose_map = in.next();
				mon_1 = new moster(chose_map);// ���ɹ���
				mon_2 = new moster(chose_map);// ���ɹ���
				mon_3 = new moster(chose_map);// ���ɹ���
				i = 0;
				System.out.println("********************");
				System.out.println("��������1ֻ" + mon_1.getLv() + "����" + mon_1.getName() + "����");
				System.out.println("��������1ֻ" + mon_2.getLv() + "����" + mon_2.getName() + "����");
				System.out.println("��������1ֻ" + mon_3.getLv() + "����" + mon_3.getName() + "����");
				System.out.println("***��ѡ��ս�����ǿ���***");
				System.out.println("1.ѡ��" + mon_1.getLv() + "����" + mon_1.getName() + "����.");
				System.out.println("2.ѡ��" + mon_2.getLv() + "����" + mon_2.getName() + "����.");
				System.out.println("3.ѡ��" + mon_3.getLv() + "����" + mon_3.getName() + "����.");
				System.out.println("4.��������.");
				String choose = in.next();

				while (true) {
					if (choose.equals("1")) {
						fight.fight1(my, mon_1);
					} else if (choose.equals("2")) {
						fight.fight1(my, mon_2);
					} else if (choose.equals("3")) {
						fight.fight1(my, mon_3);
					} else if (choose.equals("4")) {
						System.out.println("��������.�˵�һB");
						break;
					} else {
						System.out.println("������Ĳ���ȷ����������");
						choose = in.next();
					}
					break;
				}
				
			} else if (go.equals("2")) {
				if (my.getHp() >= my.getHp_max() && i < 1) {
					my.setHp(my.getHp() + 13);
					my.setHp(my.getHp_max());
					System.out.print("�Ѿ�Ϊ���ظ�" + (my.getHp() - j) + "��Ѫ��ֵ��" + j + "/" + my.getHp_max() + "->"
							+ my.getHp() + "/" + my.getHp_max() + "\n");
					i=1;
				} else {
					System.out.println("���Ѿ�ʹ�ù��ü�����"+i);
				}
			} else if (go.equals("3")) {
				my.show();
			} else {
				System.out.println("������Ĳ���ȷ����������");
			}
		}

	}

}
