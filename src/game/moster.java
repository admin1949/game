package game;
import java.util.Random;

public class moster {
	private int Grade; //1 普通，2精英，3稀有，4史诗，5传说，0BOSS. 怪物品级
	private int Hp;// 血量
	private int Hp_max;/* 血量上限 */
	private int atk;// 攻击力
	private int Mp;// 蓝量
	private int Mp_max;// 蓝量上限
	private int Power;// 力量
	private int Quick;// 敏捷
	private int Brain;// 智力
	private int Spirit;// 体力
	private int Lv;// 等级
	private int gold;/* 金币数量 */
	private String name;// 玩家名字
	private int is_alive;/* 设置存活状态 1活 0死 */

	
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
