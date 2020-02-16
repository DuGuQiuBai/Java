A:快捷键
	Ctrl+A	全选
	Ctrl+C	复制
	Ctrl+V	粘贴
	Ctrl+X	剪切
	Ctrl+Z	撤销
	Ctrl+S	保存
	
B:DOS命令
	d: 回车	盘符切换
	dir(directory):列出当前目录下的文件以及文件夹
	md (make directory) : 创建目录
	rd (remove directory): 删除目录
	cd (change directory)改变指定目录(进入指定目录)
	cd.. : 退回到上一级目录
	cd\: 退回到根目录
	del (delete): 删除文件,删除一堆后缀名一样的文件*.txt
	exit : 退出dos命令行
	cls : (clear screen)清屏
	
	扩展命令：(删除带内容的文件夹)
		rd /s 文件夹名称 (询问你是否删除)
		rd /q /s 文件夹名称 (安静的删除)
		
C:JDK,JRE,JVM的关系
	JVM保证Java语言跨平台
	JRE:JVM + 核心类库
	JDK:JRE + tools(开发工具包)

D:HelloWorld案例
	java
	javac
	java -version
	
E:如何卸载程序
	a:一个程序
		安装版  一步步安装
		绿色版	解压就可以使用
	b:卸载
		安装版	360管理工具/控制面板
		绿色版	直接删除文件夹
		
F:常见问题
	a:文件名和类名可以不一致吗?
		可以，但是不建议。建议文件名和类名一致。
	b:找不到文件
	c:单词拼写问题
	d:括号匹配问题
	e:中英文问题
	
	作业：把自己犯过的错误，全部记录下来。用word就可以了。
	不但要截图，还要记录问题的原因，解决方案。
	
G:配置path环境变量
	a:为什么要配置
		是为了让javac命令可以在任意目录下使用
	b:如何配置
		方式1：把JDK安装目录的bin目录配置到path环境变量中
			D:\develop\Java\jdk1.7.0_72\bin;后面是以前的环境变量
			
			如果把任意的exe结尾的文件的父目录配置到path中，就可以通过DOS窗口使用改命令。
		方式2：
			新建JAVA_HOME：
				变量名：JAVA_HOME
				变量值：JDK的安装路径 	D:\develop\Java\jdk1.7.0_72
			修改path：
				%JAVA_HOME%\bin;后面是以前的环境变量
	c:练习
		自己配置环境变量，并在自己指定目录先编写java程序并运行。

H:安装Editplus
	a:安装
		特别简单，记住更改路径，并添加至右键。
	b:通过该工具新建一个HelloWorld案例并编译运行。
	c:如何去除备份文件
		工具 -- 首选项 -- 文件 -- 把保存时创建备份文件的勾勾给去掉
	d:如何配置javac和java命令
		工具 -- 配置用户工具 -- 修改组名称
			
		工具 -- 配置用户工具 -- 选择刚才改名的那个组 -- 添加javac
		工具 -- 配置用户工具 -- 选择刚才改名的那个组 -- 添加java
		具体步骤，参照javac和java命令配置图
	c:练习
		安装并配置Editplus，然后通过该工具实现程序的编译和运行
