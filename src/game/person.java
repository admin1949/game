package game;

public class person {
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
	private int Exp;// 经验值
	private int Exp_max;// 经验上限
	private int gold;/* 金币数量 */
	private String name;// 玩家名字
	private String pro;//职业
	private int is_alive;/* 设置存活状态 1活 0死 */
	private int sign;// 设置标识符1玩家 ；2怪物；3；装备
	private String player;// 玩家职业标识符；1；战士；2法师；3盗贼；4；牧师

	public person(int sign, String player) {
		this.sign = sign;
		this.player = player;
		if (sign == 1) {
			setHp(80);
			setExp(0);
			setExp_max(50);
			setIs_alive(1);
			setGold(0);
			setLv(1);
			setMp(20);
			setMp_max(20);
			if (player.equals("1")) {
				setName("战士");
				init_fuck(7, 3, 3, 7);
				init_person();
			} else if (player.equals("2")) {
				setName("法师");
				init_fuck(7, 3, 3, 7);
				init_person();
			} else if (player.equals("3")) {
				setName("盗贼");
				init_fuck(7, 3, 3, 7);
				init_person();
			} else if (player.equals("4")) {
				setName("牧师");
				init_fuck(100, 3, 3, 200);
				init_person();
			} else {
				System.out.println("初始化职业失败");
			}

		}
	}

	public void init_fuck(int power, int quick, int brain, int spirit) {
		setPower(power);
		setQuick(quick);
		setBrain(brain);
		setSpirit(spirit);
	}
	
	public void init_person(){
		if(getPro().equals("法师")){
			setAtk((int)(getBrain()*2+getPower()*0.2));
			setHp((int)(getSpirit()*10+getBrain()*2));
			setMp((int)(getBrain()*2));
		}
		else if(getPro().equals("战士")){
			setAtk((int)(getPower()*2+getQuick()*0.2));
			setHp((int)(getSpirit()*10+getPower()*2));
			setMp((int)(getBrain()*2));
		}
		else if(getPro().equals("盗贼")){
			setAtk((int)(getQuick()*2+getBrain()*0.2));
			setHp((int)(getSpirit()*10+getQuick()*2));
			setMp((int)(getBrain()*2));
		}
		else if(getPro().equals("牧师")){
			setAtk((int)(getBrain()*2+getQuick()*0.2));
			setHp((int)(getSpirit()*10+getBrain()*2));
			setMp((int)(getBrain()*2));
		}
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
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

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}
	

}
