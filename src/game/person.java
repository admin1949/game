package game;

public class person {
	private int Hp;//血量
	private int Hp_max;/*血量上限*/
	private int Mp;//蓝量
	private int Mp_max;//蓝量上限
	private int Power;//力量
	private int Quick;//敏捷
	private int Brain;//智力
	private int Spirit;//体力
	private int Lv;//等级
	private int Exp;//经验值
	private int Exp_max;//经验上限
	private int gold;/*金币数量*/
	private int is_alive;/*设置存活状态 1活 0死*/
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
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public int getExp_max() {
		return Exp_max;
	}
	public void setExp_max(int exp_max) {
		Exp_max = exp_max;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getIs_alive() {
		return is_alive;
	}
	public void setIs_alive(int is_alive) {
		this.is_alive = is_alive;
	}
	
	
}
