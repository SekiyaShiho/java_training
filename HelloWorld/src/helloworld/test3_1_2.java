package helloworld;
import java.io.*;

public class test3_1_2 {
	/**
	 * @param args
	 * @throws IOException
	 * 実力確認問題3.if文 1(ケース2) 
	 */
	
	public static void main(String[] args) throws IOException{
		System.out.println("試験の点数を入力してください。(0~100)");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res =Integer.parseInt(str);
		
		if (res >= 80 && res <= 100) {
			System.out.println("たいへんよくできました。");
		} else if (res >= 60 && res < 80) {
			System.out.println("よくできました。");
		} else if (res < 60 && res >= 0) {
			System.out.println("ざんねんでした。");
		} else {
			System.out.println("0～100の点数を入力してください。");
		}
	}
}