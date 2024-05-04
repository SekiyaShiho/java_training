package helloworld;
import java.io.*;

public class test3_2 {
/**
* mainメソッド
* 実力確認問題3.if文 2
*/
	public static void main(String[] args) throws IOException{
		System.out.println("整数値x,yを入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String y = br.readLine();
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		if(x1 < y1 && (x1 % 2) == 0 && (y1 % 2) == 0) {
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		}
		else if(x1 == y1 && x1 < 0) {
			System.out.println("xとyは等しく、かつ、負の数である。");
		}
		else if(x1 < y1 || (x1 % 2) == 0) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		}
	}
}