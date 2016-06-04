package minhaihuang.ZhengZeBiaoDaShi.Test01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式的获取
 * @author 黄帅哥
 *1，首先将正则表达式封装成一个类Pattern，但是该类没有构造方法，只能通过它的静态方法实例化
 *2，通过正则对象获取匹配器，同时指定规则
 *3，通过匹配器完成相应的操作
 */
public class RegularPattern {

	public static void main(String[] args) {
		
		String str="i lou you ,oh,my dear!";
		
		//获取str中所有长度为二的单词
		
		//1,通过Pattern的静态方法获取对象，
		Pattern p=Pattern.compile("\\b[a-z]{2}\\b");
		//2，通过Pattern的对象获取匹配器
		Matcher m=p.matcher(str);
		//通过匹配器的find()方法来匹配我们想要的对象
		while(m.find()){
		//通过匹配器的group()返回我们想要的对象
		System.out.println(m.group());
		}
	}
}
