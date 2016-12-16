package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個數 我會幫你算出是否為質數");
		int n=scn.nextInt();
		int sum=0;
		System.out.print("因數有");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.println();
		if(sum<=2){
			System.out.print("是質數");
		}else{
			System.out.print("不是質數");
		}
	}

}
