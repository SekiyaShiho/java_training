package helloworld;
import java.io.*;

public class test3_1_1 {
/**
* mainメソッド
* 実力確認問題3.if文 1(ケース1)
*/
	public static void main(String[] args) throws IOException{
		System.out.println("試験の点数を入力してください。(0~100)");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res =Integer.parseInt(str);
		
		if(res >= 60) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
		
	}
}