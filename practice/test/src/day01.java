public class day01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print('我');
        int a = 132;
        System.out.println(a);
        a = 2341;
        System.out.println(a);
        System.out.println("----------");
        //强制类型转换(不建议)
        int m = (int)123.4223;
        System.out.println(m);
        /*
        类型转换：
        byte -> short -> int -> long -> float -> double
                char
        */
        System.out.println("----------");
        int b = 3500;
        int c = 256;
        System.out.println(b + c);
        System.out.println(b - c);
        System.out.println(b * c);
        System.out.println(b / c);
        //除法要得到小数必须有小数的参与
        System.out.println(b / 256.0);
        System.out.println(b % c);
    }
}