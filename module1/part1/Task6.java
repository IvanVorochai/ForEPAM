package module1.part1;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(" res = " + getResult(1, 2));
        System.out.println(" res = " + getResult(0, -2));
        System.out.println(" res = " + getResult(-2, -5));
        System.out.println(" res = " + getResult(-2, 5));
        System.out.println(" res = " + getResult(2, 1));
    }

    public static boolean getResult(double x, double y) {
        System.out.print("x= " + x + " y= " + y);
        boolean res;

        if ((x >= -2 && y >= 0 && x <= 2 && y <= 4) || (x >= -4 && y >= -3 && x <= 4 && y <= 0)) {
            res = x != 0 || y != -1;
        } else {
            res = false;
        }
        return res;
    }
}
