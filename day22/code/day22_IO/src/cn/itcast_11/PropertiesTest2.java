package cn.itcast_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 我有一个猜数字小游戏的程序，请写一个程序实现在测试类中只能用5次，超过5次提示：亲，游戏试玩已结束，请付费。
 * 
 * 分析：
 * 		A:写一个猜数字小游戏的程序
 * 		B:在测试类中可以玩，但是不能超过5次
 * 		C:如何控制呢?
 * 			就可以把玩的次数写到一个文件中，每次玩之前，先读取文件中的次数进行判断
 * 		  	如果没有超过5次，就可以继续玩，超过就不能玩了，给出提示即可。
 * 
 * 三国群英传2(等级)
 */
public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		Properties prop = new Properties();
		Reader r = new FileReader("playCount.txt");
		prop.load(r);
		r.close();

		// 获取数据
		String value = prop.getProperty("count");
		// 把字符串转成int类型的值
		int count = Integer.parseInt(value);

		if (count >= 5) {
			System.out.println("亲，游戏试玩已结束，请找班长付费。卡号是:10086");
		} else {
			GuessNumberGame.start();
			count++;
			// 修改集合
			prop.setProperty("count", String.valueOf(count));

			// 把集合的数据写到文本文件
			Writer w = new FileWriter("playCount.txt");
			prop.store(w, null);
			w.close();
		}
	}
}
