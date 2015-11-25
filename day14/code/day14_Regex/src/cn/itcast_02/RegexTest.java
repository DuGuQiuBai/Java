package cn.itcast_02;

import java.util.Scanner;

/*
 * 校验邮箱
 * 
 * liuyi@163.com
 * linqingxia@126.com
 * 123456@qq.com
 * zhangsan123@sina.cn
 * zhang456@sina.com.cn
 * fqy@itcast.cn
 */
public class RegexTest {
	public static void main(String[] args) {
		//定义规则
		//String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,8}(\\.[a-z]{2,3})+";
		String regex = "\\w+@\\w{2,8}(\\.[a-z]{2,3})+";
		
		//键盘录入邮箱
		Scanner sc=  new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();
		
		//校验
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}
}
