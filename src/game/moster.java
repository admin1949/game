package game;
import java.util.Random;

public class moster {
	private int Grade; //1 ��ͨ��2��Ӣ��3ϡ�У�4ʷʫ��5��˵��0BOSS. ����Ʒ��
	private int Hp;// Ѫ��
	private int Hp_max;/* Ѫ������ */
	private int atk;// ������
	private int Mp;// ����
	private int Mp_max;// ��������
	private int Power;// ����
	private int Quick;// ����
	private int Brain;// ����
	private int Spirit;// ����
	private int Lv;// �ȼ�
	private int gold;/* ������� */
	private String name;// �������
	private int is_alive;/* ���ô��״̬ 1�� 0�� */

	
	public static Random random = new Random();
	public moster(String map) {
		if(map.equals("1")){
			
		}
		else if(map.equals("2")){
			
		}
		else if(map.equals("3")){
			
		}
		else if(map.equals("4")){
			
		}
		else if(map.equals("5")){
			
		}
		else if(map.equals("6")){
			
		}
	}
	
	public void init_moster(int map){
		setAtk((int)((random.nextInt(5)+1)+map*5));
		setHp_max((int)((random.nextInt(30)+1)+map*30));
		setMp_max((int)((random.nextInt(5)+1)+map*5));
		setHp(getHp_max());
		setMp(getMp_max());
		setIs_alive(1);
		setGold(map*(random.nextInt(5)+1));
		setLv(map);
	}



	public int getGrade() {
		return Grade;
	}



	public void setGrade(int grade) {
		Grade = grade;
	}



	public int getHp() {
		return Hp;
	}



	public void setHp(int hp) {
		Hp = hp;
	}



	public int getHp_max() {
		return Hp_max;
	}



	public void setHp_max(int hp_max) {
		Hp_max = hp_max;
	}



	public int getAtk() {
		return atk;
	}



	public void setAtk(int atk) {
		this.atk = atk;
	}



	public int getMp() {
		return Mp;
	}



	public void setMp(int mp) {
		Mp = mp;
	}



	public int getMp_max() {
		return Mp_max;
	}



	public void setMp_max(int mp_max) {
		Mp_max = mp_max;
	}



	public int getPower() {
		return Power;
	}



	public void setPower(int power) {
		Power = power;
	}



	public int getQuick() {
		return Quick;
	}



	public void setQuick(int quick) {
		Quick = quick;
	}



	public int getBrain() {
		return Brain;
	}



	public void setBrain(int brain) {
		Brain = brain;
	}



	public int getSpirit() {
		return Spirit;
	}



	public void setSpirit(int spirit) {
		Spirit = spirit;
	}



	public int getLv() {
		return Lv;
	}



	public void setLv(int lv) {
		Lv = lv;
	}



	public int getGold() {
		return gold;
	}



	public void setGold(int gold) {
		this.gold = gold;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getIs_alive() {
		return is_alive;
	}



	public void setIs_alive(int is_alive) {
		this.is_alive = is_alive;
	}
	
}