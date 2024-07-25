public class TestOperate {
    public static void main(String[] args) {
        int x, y;
        x = 5 + 2 * 4;
        y = (5 + 2) * 4;
        float value;
        /*
         1. () สำคัญที่สุด
         2. * / % สำคัญรองลงมา
         3. + - สำคัญต่ำสุด
         */
        System.out.println("x =" +x);
        System.out.println("y =" +y);
        x = x / 3;
        System.out.println("x =" +x);
        value = (float)4 / 3;
        System.out.println("x =" +value);
    }
}
