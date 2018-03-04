package game;

import java.util.Scanner;

public class start {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] arge){
		System.out.println("***********欢迎来到勇者大冒险***********");
		System.out.println("请输入你的ID：");
		String id = in.next();
		System.out.println("欢迎" + id + "进入勇者的世界");
	}

}
