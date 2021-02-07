package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 创建Scanner对象
		
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		System.out.print("Input your Choice: "); // 打印提示
		int choice = scanner.nextInt(); // 读取一行输入并获取以前的成绩
		// 计算机随机数 1, 2, 3:
		int random = (int)(1 +  Math.random() * 3);
		System.out.println(" random: " + random);
		switch (choice) {
		case 1:
			System.out.println(" The Choice of Computer: " + random);
			switch(random){
				case 1:
					System.out.println(" It's a draw. ");
					break;
				case 2:
					System.out.println(" You win! ");
					break;
				case 3:
					System.out.println(" You lose! ");
					break;
			}
			break;
			
		case 2:
			System.out.println(" The Choice of Computer: " + random);
			switch(random){
				case 1:
					System.out.println(" You lose! ");
					break;
				case 2:
					System.out.println(" It's a draw. ");
					break;
				case 3:
					System.out.println(" You win! ");
					break;
			}
			break;
			
		case 3:
			System.out.println(" The Choice of Computer: " + random);
			switch(random){
				case 1:
					System.out.println(" You win! ");
					break;
				case 2:
					System.out.println(" You lose! ");
					break;
				case 3:
					System.out.println(" It's a draw. ");
					break;
			}
			break;
		}
		
	}

}
