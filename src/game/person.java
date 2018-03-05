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
	private String player;// 玩家职业标识符；1；战士；2法师；3盗贼；4；牧师 , 0为怪物
	private int point;//当前拥有技能点
	
	public person(String player) {
		this.player = player;
		if (player.equals("1")) {
			setPro("战士");
			init_fuck(7, 3, 3, 7);
			init_person();
		} else if (player.equals("2")) {
			setPro("法师");
			init_fuck(3,5,7,5);
			init_person();
		} else if (player.equals("3")) {
			setPro("盗贼");
			init_fuck(4,8,6,2);
			init_person();
		} else if (player.equals("4")) {
			setPro("牧师");
			init_fuck(100, 100, 100, 200);
			init_person();
		} else {
			System.out.println("初始化职业失败");
		}
		init();
	}

	public void init_fuck(int power, int quick, int brain, int spirit) {
		setPower(power);
		setQuick(quick);       // 根据职业设定属性
		setBrain(brain);
		setSpirit(spirit);
		setPoint(0);//初始化技能点为0
	}
	
	public void init_person(){   //根据属性和职业和等级设定具体属性
		if(getPro().equals("法师")){
			setAtk((int)(getBrain()*2+getPower()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getBrain()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
		else if(getPro().equals("战士")){
			setAtk((int)(getPower()*2+getQuick()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getPower()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
		else if(getPro().equals("盗贼")){
			setAtk((int)(getQuick()*2+getBrain()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getQuick()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
		else if(getPro().equals("牧师")){
			setAtk((int)(getBrain()*2+getQuick()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getBrain()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
	}
	
	public void init(){
		setHp(getHp_max());
		setMp(getMp_max());
		setIs_alive(1);
		setGold(0);
		setExp(0);
		setExp_max(50);
		setLv(1);
	}
	
	public void show() {//显示人物信息
		System.out.println("ID：" + getName()+"\t职业:"+getPro());
		System.out.print("HP：" + getHp() + "/" + getHp_max()+ "\n");
		System.out.print("MP：" + getMp() + "/" + getMp_max() + "\n");
		System.out.print("攻击：" + getAtk()+ "\n");
		System.out.print("力量：" + getPower());
		System.out.print("\t智力：" + getBrain()+ "\n");
		System.out.print("敏捷：" + getQuick());
		System.out.print("\t体力：" + getSpirit()+ "\n");
		System.out.print("等级：" + getLv()+ "\n");
		System.out.print("经验值：" + getExp() + "/" + getExp_max()+"\n");
		System.out.print("未分配属性点：" + getPoint()+ "\n");
		System.out.print("金币：" + getGold()+ "\n");

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

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
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

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	

}
