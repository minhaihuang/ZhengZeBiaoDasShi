package minhaihuang.ZhengZeBiaoDaShi.Test01;
/**
 * 测试正则表达式中的替换的方法
 * @author 黄帅哥
 *
 */
public class RegularReplaceAll {

	public static void main(String[] args) {
		

	//要求，把多次重复的字符全部变为1个，例abb，变成ab
	String str="abbbbbbcdddddeff";
	
	//使用正则表达式，需要用到组的概念
	String reg="([a-z])\\1+";
	String repStr=str.replaceAll(reg, "$1");//这里的美元符$表示动态获取内容的意思
	System.out.println(repStr);//abcdef
	}
}
