package game;

public class person {
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
	private int Exp;// ����ֵ
	private int Exp_max;// ��������
	private int gold;/* ������� */
	private String name;// �������
	private String pro;//ְҵ
	private int is_alive;/* ���ô��״̬ 1�� 0�� */
	private String player;// ���ְҵ��ʶ����1��սʿ��2��ʦ��3������4����ʦ , 0Ϊ����
	private int point;//��ǰӵ�м��ܵ�
	
	public person(String player) {
		this.player = player;
		if (player.equals("1")) {
			setPro("սʿ");
			init_fuck(7, 3, 3, 7);
			init_person();
		} else if (player.equals("2")) {
			setPro("��ʦ");
			init_fuck(3,5,7,5);
			init_person();
		} else if (player.equals("3")) {
			setPro("����");
			init_fuck(4,8,6,2);
			init_person();
		} else if (player.equals("4")) {
			setPro("��ʦ");
			init_fuck(100, 100, 100, 200);
			init_person();
		} else {
			System.out.println("��ʼ��ְҵʧ��");
		}
		init();
	}

	public void init_fuck(int power, int quick, int brain, int spirit) {
		setPower(power);
		setQuick(quick);       // ����ְҵ�趨����
		setBrain(brain);
		setSpirit(spirit);
		setPoint(0);//��ʼ�����ܵ�Ϊ0
	}
	
	public void init_person(){   //�������Ժ�ְҵ�͵ȼ��趨��������
		if(getPro().equals("��ʦ")){
			setAtk((int)(getBrain()*2+getPower()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getBrain()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
		else if(getPro().equals("սʿ")){
			setAtk((int)(getPower()*2+getQuick()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getPower()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
		else if(getPro().equals("����")){
			setAtk((int)(getQuick()*2+getBrain()*0.2)+getLv()*5);
			setHp_max((int)(getSpirit()*10+getQuick()*2)+getLv()*10);
			setMp_max((int)(getBrain()*2)+getLv()*10);
		}
		else if(getPro().equals("��ʦ")){
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
	
	public void show() {//��ʾ������Ϣ
		System.out.println("ID��" + getName()+"\tְҵ:"+getPro());
		System.out.print("HP��" + getHp() + "/" + getHp_max()+ "\n");
		System.out.print("MP��" + getMp() + "/" + getMp_max() + "\n");
		System.out.print("������" + getAtk()+ "\n");
		System.out.print("������" + getPower());
		System.out.print("\t������" + getBrain()+ "\n");
		System.out.print("���ݣ�" + getQuick());
		System.out.print("\t������" + getSpirit()+ "\n");
		System.out.print("�ȼ���" + getLv()+ "\n");
		System.out.print("����ֵ��" + getExp() + "/" + getExp_max()+"\n");
		System.out.print("δ�������Ե㣺" + getPoint()+ "\n");
		System.out.print("��ң�" + getGold()+ "\n");

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
