package dugan.joseph.reusingClassesLab1;

import java.util.ArrayList;

/**
 * Created by joseph on 2/2/16.
 */
class RotatingArray extends ArrayList {


    public void rotateNumTimes(int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            rotate();
        }
    }

    public void rotate() {
        add(remove(0));
    }


}
public class ReusingClassesLab1 {
    public static void printArrayList(RotatingArray list) {
        for (Object obj : list)
            System.out.println(obj);
    }
    public static void main(String[] args) {
        Object a = (Integer)1;
        Object b = (Integer)2;
        Object c = (Integer)3;
        Object d = (Integer)4;
        Object e = (Integer)5;

        RotatingArray list = new RotatingArray();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        printArrayList(list);
        list.rotateNumTimes(3);
        printArrayList(list);
    }
}
