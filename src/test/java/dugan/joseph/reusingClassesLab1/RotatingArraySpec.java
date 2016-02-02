package dugan.joseph.reusingClassesLab1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by joseph on 2/2/16.
 */
public class RotatingArraySpec {
    private Object a = (Integer)1;
    private Object b = (Integer)2;
    private Object c = (Integer)3;
    private Object d = (Integer)4;

    private static final int ROTATE_NUM_TIMES = 3;


    private RotatingArray list;

    @Before
    public void setUp() {
        System.out.println("Seeting up object");
        list = new RotatingArray();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
    }

    @Test
    public void testRotate() {
        // when
        list.rotateNumTimes(ROTATE_NUM_TIMES);

        Object[] expectedList = new Object[] {d, a, b, c};
        Object[] actualList = list.toArray();

        assertArrayEquals("Liats are unequal", expectedList, actualList);
    }

    @After
    public void teardown() {
        list = null;
        System.out.println("Object has been torn down");
    }
}
