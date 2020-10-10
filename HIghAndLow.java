package card;

import java.util.Scanner;

public class HighAndLow01 {

	public static void main(String[] args) {
		System.out.println("*****************");
		System.out.println("*High & Low*");
		System.out.println("******************");
		System.out.println();
		
		int count = 1;
		
		
		while(true) {
		System.out.println("[問題表示]");
			
		System.out.println("*****　*****");
		System.out.println("* * *  * * *");
		int leftnum = (int)(Math.random()*9)+1;
		System.out.println("* " +leftnum+ " *  * * *");
		System.out.println("* * *  * * *");
		System.out.println("*****　*****");
		Scanner sc = new Scanner(System.in);
		System.out.print("High or Low ? (h/l)>");
		String select = sc.nextLine();
		if(select.equals("h")){
		System.out.print("Highを選択しました。");
		}else {
		System.out.print("Lowを選択しました。");
		}
		
		
		System.out.println("[結果表示]");
		
		System.out.println("*****　*****");
		System.out.println("* * *  * * *");
		int rightnum = (int)(Math.random()*9)+1;
		System.out.println("* " +leftnum+ " *  * " +rightnum+ " *");
		System.out.println("* * *  * * *");
		System.out.println("*****　*****");
		
		System.out.println();
		System.out.println("***ゲーム終了***");
	
		String result;
		if(leftnum < rightnum) {
			result = "h";
		}else if(leftnum > rightnum) {
			result  = "l";
		}else {
			result = select;
		}
		
		if(result.equals(select)) {
			System.out.println("→you Win!");
			count = count + 1;
			continue;
		}else {
			System.out.println("→you Lose...");
			System.out.println(count+"回成功しました");
			break;
		}
		
	}
	}

}
