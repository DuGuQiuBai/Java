public class day02 {
    /*
    字符的加减：
    整个表达式的类型自动提升到表达式中最高等级操作数同样的类型等级顺序: byte,short,char → int → long → float → double
    */
    public static void main(String[] args){
        int i = 126;
        char c = 'a';
        System.out.println(c);
        System.out.println(i + c);
        char d = (char)i;
        System.out.println(d);
        System.out.println("-------");
        System.out.println(1 + 99 + "kingdom");
        System.out.println("kingdom" + 34 + 66);
        // for(int a=32; a<=126; a++){
        //     int m = a % 10;
        //     if (m == 2) {
        //         System.out.println("--------");
        //     }
        //     char q = (char)a;
        //     System.out.println(q);
        // }
        i = 0;
        i += 10;
        //+= *= -= /= %=均有强制转换的作用
        /*
        ++和--既可以放在变量的后边，也可以放在变量的前边。
        单独使用的时候，++和--无论是放在变量的前边还是后边，结果是一样的。
        参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或者--。参与操作的时候，如果放在变量的前边，先拿变量做++或者--，后拿变量参与操作。
        */
        i++;
        System.out.println("i:" + i);
        i = 0;
        ++i;
        System.out.println("i:" + i);
        i = 0;
        int j = i++;
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        i = 0;
        j = ++i;
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        /*
        & 逻辑与：a&b，a和b都是true，结果为true，否则为false
        | 逻辑或：a|b,a和b都是false，结果为false，否则为true
        ^ 逻辑异或：a^b，a和b结果不同为true，相同为false
        ! 逻辑非：!a，结果和a的结果正好相反
        
        && 短路与，如果左边为真，右边执行;如果左边为假，右边不执行。
        || 短路或：如果左边为假，右边执行;如果左边为真，右边不执行。
        */
    }
}
