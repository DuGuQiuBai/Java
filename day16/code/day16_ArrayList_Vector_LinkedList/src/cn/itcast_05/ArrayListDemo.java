package cn.itcast_05;

import java.util.ArrayList;

/*
 * 需求：四大名著
 * 三国演义
 * 		吕布，典韦，赵云
 * 红楼梦
 * 		贾宝玉，林黛玉，王熙凤，秦可卿
 * 水浒传
 * 		武松，鲁智深，李逵，卢俊义，索超，吴用
 * 西游记
 * 		白骨精，观音姐姐，孙悟空，牛魔王，红孩儿
 * 
 * 我国有四大名著，每部名著里有很多代表性角色。
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 三国演义小集合
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("吕布");
		sgyy.add("典韦");
		sgyy.add("赵云");

		// 红楼梦小集合
		ArrayList<String> hlm = new ArrayList<String>();
		hlm.add("贾宝玉");
		hlm.add("林黛玉");
		hlm.add("王熙凤");
		hlm.add("秦可卿");

		// 水浒传小集合
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("武松");
		shz.add("鲁智深");
		shz.add("李逵");
		shz.add("卢俊义");
		shz.add("索超");
		shz.add("吴用");

		// 西游记小集合
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("白骨精");
		xyj.add("观音姐姐");
		xyj.add("孙悟空");
		xyj.add("牛魔王");
		xyj.add("红孩儿");

		// 代表名著的大集合
		ArrayList<ArrayList<String>> sdmz = new ArrayList<ArrayList<String>>();
		sdmz.add(sgyy);
		sdmz.add(hlm);
		sdmz.add(shz);
		sdmz.add(xyj);

		// 遍历集合
		for (ArrayList<String> array : sdmz) {
			for (String s : array) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
