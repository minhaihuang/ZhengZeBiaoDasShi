package minhaihuang.ZhengZeBiaoDaShi.Test01;
/**
 * 测试正则表达式的一些常用定义以及规则
 * @author 黄帅哥
 *
 */
public class RegularDemo01 {
	public static void main(String[] args) {
		//字符类
		String reg="[abc]";
		boolean b="a".matches(reg);//判断是否为，a,b,c中的任意一个
		System.out.println(b);//true
		
		String reg1="[^abc]";
		boolean b1="a".matches(reg1);//判断是否不是a,b,c。
		System.out.println(b1);//false
		
		String reg2="[a-z]";
		boolean b2="a".matches(reg2);//判断是否为a-z中的其中一个
		System.out.println(b2);//true
		
		String reg3="[a-zA-z]";//等价于[a-z[A-Z]
		boolean b3="A".matches(reg3);//判断是否为a-z,或者A-Z中的一个
		System.out.println(b3);//true
		
		String reg4="[a-z&&[abc]]";
		boolean b4="d".matches(reg4);//判断是否为a-z和[abc]的交集的任意一个
		System.out.println(b4);//false
	}

}
