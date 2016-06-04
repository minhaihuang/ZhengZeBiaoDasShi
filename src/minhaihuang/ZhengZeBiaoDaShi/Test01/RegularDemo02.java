package minhaihuang.ZhengZeBiaoDaShi.Test01;
/**
 * 测试正则表达式中的预定义字符类
 * @author 黄帅哥
 *
 */
public class RegularDemo02 {

	public static void main(String[] args) {
	/**
	     . 任何字符（与行结束符可能匹配也可能不匹配） 
		\d 数字：[0-9] 
		\D 非数字： [^0-9] 
		\s 空白字符：[ \t\n\x0B\f\r] 
		\S 非空白字符：[^\s] 
		\w 单词字符：[a-zA-Z_0-9] 
		\W 非单词字符：[^\w] 

	 */
	String reg1=".";//任意字符
	boolean b1="a".matches(reg1);
	System.out.println(b1);//true
	
	String reg2="\\d";//判断是否为0-9的数字,等价于[0-9]
	//boolean b2="a".matches(reg2);//false
	boolean b2="0".matches(reg2);//true
	System.out.println(b2);
	
	String reg3="\\D";//非数字等价于[^0-9]
	//boolean b3="0".matches(reg3);//false
	boolean b3="a".matches(reg1);//true
	System.out.println(b3);//true
	
	String reg4="\\s";//判断是否为空白字符，等价于[ \t\n\x0B\f\r] 
	//boolean b4="a".matches(reg4);//false
	boolean b4=" ".matches(reg4);//true
	System.out.println(b4);//true
	
	String reg5="\\S";//判断是否为非空白字符，等价于[^\s] 
	//boolean b5=" ".matches(reg5);//false
	boolean b5="a".matches(reg5);//true
	System.out.println(b5);//true
	
	String reg6="\\w";//判断是否为单词字符。等价于[a-zA-Z_0-9] 
	//boolean b6="-".matches(reg6);//false
	boolean b6="_".matches(reg6);//true
	System.out.println(b6);//true
	
	String reg7="\\W";//判断是否为非单词字符。等价于[^\w] 
	//boolean b7="_".matches(reg7);//false
	boolean b7="-".matches(reg7);//true
	System.out.println(b7);//true
	}
}
