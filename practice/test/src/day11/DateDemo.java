package day11;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date dd = new Date();
        String s = DateUtil.DatetoString(dd, "yy MM dd");
        System.out.println(s);

        String ss = "22 11 30";
        Date d = DateUtil.StringtoDate(ss, "yy MM dd");
        System.out.println(d);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + day);

        c.add(Calendar.MONTH, 10);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + day);

        c.add(Calendar.DATE, 45);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + day);
        
    }
}
