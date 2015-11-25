/*
	包：其实就是文件夹
	作用：对类进行分类管理
	
	包的划分：
	举例：
		学生的增加，删除，修改，查询
		老师的增加，删除，修改，查询
		工人的增加，删除，修改，查询
	A:按照功能分
		cn.itcast.add
			AddStudent
			AddTeacher
			AddWorker
		cn.itcast.delete
			DeleteStudent
			DeleteTeacher
			DeleteWorker
		cn.itcast.update
		cn.itcast.find
	B:按照模块分
		cn.itcast.student
			add
			delete
			update
			find
		cn.itcast.teacher
			add
			delete
			update
			find
		cn.itcast.worker
			add
			delete
			update
			find
	
	定义包的格式:
		package 包名;

	带包的编译和运行：
		手动式：
			A:编译带包的类文件
			B:自己手动创建包
			C:把编译生成的class文件放到包里面去
			D:运行即可，注意要带包名
				java cn.itcast.HelloWorld
		自动式：
			A:编译的时候带一个参数 -d
				javac -d . HelloWorld.java
			B:运行即可，注意要带包名
				java cn.itcast.HelloWorld

		注意事项：
			package语句必须是程序的第一条可执行的代码
			package语句在一个java文件中只能有一个
			如果没有package，默认表示无包名
*/
package cn.itcast;

class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}