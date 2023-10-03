package Homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework8_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Integer(100));
        list.add(new Double(3.14));
        list.add(new Long(21L));
        list.add(new Short("100"));
        list.add(new Double(5.1));
        list.add("Kitty");
        list.add(new Integer(100));
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));

        System.out.println("使用傳統for迴圈：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        System.out.println("使用foreach迴圈：");
        for (Object obj: list) {
            System.out.print(obj + " ");
        }
        System.out.println();

        System.out.println("使用Iterator：");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("====================================================================");
        System.out.println("移除非Number相關的物件：");
        for (int i = 0, len = list.size(); i < len; i++) {
            if (!(list.get(i) instanceof Number)) {
                list.remove(i);
                i--;
                len--;
            }
        }

        for (Object obj: list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
