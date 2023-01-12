import junit.framework.TestCase;

public class StringToIntegerTest extends TestCase {

    public void testProfit1(){
        String s = "42";
        int actual = Main.Solution.myAtoi(s);
        int expected = 42;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String s = "-42";
        int actual = Main.Solution.myAtoi(s);
        int expected = -42;
        assertEquals(expected, actual);
    }

    public void testProfit3(){
        String s = "ffaaa mmm 42";
        int actual = Main.Solution.myAtoi(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    public void testProfit4(){
        String s = "+-42";
        int actual = Main.Solution.myAtoi(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    public void testProfit5(){
        String s = "-398474625517";
        int actual = Main.Solution.myAtoi(s);
        int expected = -2147483648;
        assertEquals(expected, actual);
    }
}