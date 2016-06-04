package minhaihuang.ZhengZeBiaoDaShi.Test01;
/**
 * 判断一个QQ是否为正确的qq号，分别用普通的方法和正则表达式来完成此需求，比较两者的优缺点。
 * @author 黄帅哥
 *
 */
public class CheckQQ {

	public static void main(String[] args) {
		//1,用普通的方法比较，需要方法体
		String str="177";
		boolean b=check(str);
		System.out.println(b);
		
		
		//2,用正则表达式来判断，更省事，不需要方法体
	//matches方法内部的是正则表达式，意思是：第一个字符在1-9之间，第二个以及以后的字符都在0-9之间，总长度为4-11，
		//大括号里面表示第一个字符以后的字符串长度范围。
		boolean b1=str.matches("[1-9][0-9]{3,10}");
		System.out.println(b1);
	}
	
	/**
	 * 判断一个qq号正确的标准
	 * 1，长度在4-11之内，包括4和11
	 * 2，不能以0开头
	 * 3，全部由数字组成，
	 * @param str
	 * @return
	 */
	public static boolean check(String str){
		
		//1,长度在4-11之内，包括4和11,否则返回false
		int len=str.length();
		if(len<4||len>11){
			return false;
		}
		
		//2，不能以0开头
		char ch=str.charAt(0);
		if(ch=='0'){
			return false;
		}
		
		//3,全部由数字组成
		for(int i=0;i<len;i++){
			ch=str.charAt(i);
			if(ch>'9'||ch<'0'){
				return false;
			}
		}
		
		return true;
	}
}
