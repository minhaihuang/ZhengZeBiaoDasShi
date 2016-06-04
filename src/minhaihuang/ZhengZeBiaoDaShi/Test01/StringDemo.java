package minhaihuang.ZhengZeBiaoDaShi.Test01;
/**
 * 复习一下String类中常用的方法
 * @author 黄帅哥
 *
 */
public class StringDemo {

	public static void main(String[] args) {
	//1，测试indexOf方法,记录字符首次出现的索引,还可以找到该字符最后一次出项的索引，lastIndexOf()
	String s="shabdfd";
	int index=s.lastIndexOf('s');
	
	System.out.println(index);
	//2,测试charAt方法，返回的是指定位置的字符，常用来遍历字符串
	for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		System.out.println(ch);
	}
	
	//3，测试subString(index1,index2)方法，按照索引来分割，开始的包括，最后的不包括，实际长度为index2-inedx1
	
	System.out.println(s.length());
	s=s.substring(0, 7);
	System.out.println(s);
	}
}
