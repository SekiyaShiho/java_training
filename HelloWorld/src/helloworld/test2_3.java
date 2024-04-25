package helloworld;
//int型の変数x,yに任意の数値を代入し、xの値をyに、yの値をxに入れ替えてxとyの値を表示するプログラムを作成する
public class test2_3 {
	/**
     * mainメソッド
     * @param args 使用しない
     */
	public static void main(String[] args){
		int x = 10 , y = 20;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("変数xの値は" + x + "です。"); 
		System.out.println("変数yの値は" + y + "です。");		
	}
}