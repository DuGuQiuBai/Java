import java.util.Scanner;
public class day03 {
    public static void main(String[] args){
        //三元运算符
        int a = 1;
        int b = 2;
        int max = a > b ? a:b;
        System.out.println("max:" + max);
        //两只老虎:
        //需求:动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg ,请用程序实现判断两只老虎的体重是否相同。
        int tiger1 = 180;
        int tiger2 = 200;
        System.out.println((tiger1 == tiger2) ? "体重相同" : "体重不同");
        //三个和尚:
        //需求:一座寺庙里住着三个和尚，已知他们的身高分别为150cm.210cm、165cm，请用程序实现获取这三个和尚的最高身高。
        int high1 = 150;
        int high2 = 165;
        int high3 = 210;
        int c = high1 > high2 ? high1 : high2;
        int d = c > high3 ? c : high3;
        System.out.println("三个和尚的最高身高为:" + d + "cm");
        /*
        导包 : import java.util.Scanner;                导包的动作必须出现在类定义的上边
        创建对象 : Scanner sc = new Scanner(System.in); 上面这个格式里面，只有sc是变量名，可以变，其他的都不允许变。
        接收数据 : int a = sc.nextInt();                上面这个格式里面，只有i是变量名，可以变，其他的都不允许变。
        */
        //数据输入：创建对象
        Scanner sc = new Scanner(System.in);
        //接受数据
        int e = sc.nextInt();
        System.out.println(e);

        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();
        int tempheight = height1 > height2 ? height1 : height2;
        int maxheight = tempheight > height3 ? tempheight : height3;
        System.out.println("三个和尚的身高分别为:");
        System.out.println(height1 + "cm");
        System.out.println(height2 + "cm");
        System.out.println(height3 + "cm");
        System.out.println("其中身高最高的为:" + maxheight + "cm");

        double f = sc.nextDouble();


        System.out.println(f);
        Scanner test = new Scanner(System.in);
        int g = test.nextInt();
        int h = test.nextInt();
        if (g == h) {
            System.out.println("g和h相等，都为：" + g);
        } else {
            System.out.println("g和h不相等");
        }
        //需求:任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
        int i = test.nextInt();
        int j = i % 2;
        String result = j == 0 ? "偶数" : "奇数";
        System.out.println(i + "是" + result);
        if (j == 0) {
            System.out.println(i + "是偶数");
        } else {
            System.out.println(i + "是奇数");
        }
    }
}