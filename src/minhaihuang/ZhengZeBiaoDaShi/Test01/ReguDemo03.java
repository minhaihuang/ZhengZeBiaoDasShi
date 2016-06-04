package minhaihuang.ZhengZeBiaoDaShi.Test01;
/**
 * 测试正则表达式中的数量词
 * @author 黄帅哥
 *
 */
public class ReguDemo03 {

	public static void main(String[] args) {
		/**
		 * Greedy 数量词 
			X? X，一次或一次也没有 
			X* X，零次或多次 
			X+ X，一次或多次 
			X{n} X，恰好 n 次 
			X{n,} X，至少 n 次 
			X{n,m} X，至少 n 次，但是不超过 m 次 
		 */
		
		//例：
		//String str="12352";//false;
		String str1="12";//true
		boolean b1=str1.matches("[1-9][0-9]?");//表示第一个字符后的字符出现的个数不能大于1。
		System.out.println(b1);
		

		//String str2="123";//true
		String str2="1";//false
		boolean b2=str2.matches("[1-9][0-9]+");//表示第一个字符后的字符出现的个数大于等于1。
		System.out.println(b2);
		
		
		//String str3="123456";//true，长度刚好为6
		String str3="12345";//false,长度不为6
		boolean b3=str3.matches("[1-9][0-9]{5}");//表示第一个字符后的字符出现的个数等于5,也可以对应改为其他值。
		System.out.println(b3);
}
}
