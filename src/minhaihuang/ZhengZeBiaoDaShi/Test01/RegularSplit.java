package minhaihuang.ZhengZeBiaoDaShi.Test01;

import java.util.Arrays;

/**
 * 用正则表达式来切割字符串
 * @author 黄帅哥
 *
 */
public class RegularSplit {

	public static void main(String[] args) {
		//1,先切割一般的字符串
		String s="a,b,c";
		String[] str=s.split(",");
		
		System.out.println(Arrays.toString(str));
		
		//2，切割比较复杂的字符串
		String s1="a,,,b,,c,d";//当出现这种情况时，若再使用上面的方法，会获得很多空格，
		//但是我们只想获取到a b c d
		
		//使用正则表达式切割
		String[] strArr=s1.split("[,]+");//切割成功
		System.out.println(Arrays.toString(strArr));
		
		//3，当有中文逗号时，同样使用正则表达式切割
		String s2="a,，b,c,，，d，，,f";//值获取a b c d f 
		String[]  strArr2=s2.split("[,，]+");//切割成功
		System.out.println(Arrays.toString(strArr2));
		
		//4，按照重复的字符来切割。例abbcddde,切割后的结果为：a c e
		String s3="abbcddde";
		//要用到组的概念,下面指定的索引从1开始，即为([a-z])
		String[] strArr3=s3.split("([a-z])\\1+");
		System.out.println(Arrays.toString(strArr3));
	}
}
