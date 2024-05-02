package helloworld;
import java.io.*;

public class test3_1_3 {
/**
* mainメソッド
* 実力確認問題3.if文 1(ケース3)
*/
	public static void main(String[] args) throws IOException{
		System.out.println("試験の点数を入力してください。(0~100)");
			
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res =Integer.parseInt(str);
		
		if (res >= 80) {
			System.out.println("優");
		}
		else if(res >= 70 && res <80) {
			System.out.println("良");
		}
		else if(res >= 60 && res <70) {
			System.out.println("可");
		}
		else {
			System.out.println("不可");
		}
	}
}