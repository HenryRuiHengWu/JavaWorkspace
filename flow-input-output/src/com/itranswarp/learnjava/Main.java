package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 创建Scanner对象
		System.out.print("Input your prevous score: "); // 打印提示
		int prev = scanner.nextInt(); // 读取一行输入并获取以前的成绩
		System.out.print("Input your score: "); // 打印提示
		int score = scanner.nextInt(); // 读取一行输入并获取当前成绩
		double percent = ((double)score-(double)prev)/((double)prev)*100;
		System.out.printf("成绩提高了%.2f%%",percent);
	}

}
