import java.util.*;

public class Problem_1
{
    public static double calculate(double a, double b, String s)
    {
        String oper = s.toLowerCase();
        if (oper.equals("add"))
            return a + b;
        else if (oper.equals("sub"))
            return a - b;
        else if (oper.equals("mul"))
            return a * b;
        else if (oper.equals("div") && b != 0)
            return a / b;
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter type of operation(add,sub,mul,div) in String: ");
        String s = sc.next();
        double result = calculate(a, b, s);
        System.out.println("Result: " + result);
        sc.close();
    }
}