import java.util.*;

public class Problem_3 
{
    public static void seriesNumber(int n)
    {
        if (n == 1)
            System.out.print(n);
        else if (n > 1)
        {
            int count = 0;
            int temp = n;
            for (int i = 1;; i = i + 2) {
                System.out.print(i + " ");
                count = count + 1;
                if (count == temp)
                    break;
            }
        }
        else
            System.out.print("0");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if (a % 2 == 0)
        {
            seriesNumber(a - 1);
        } 
        else
        {
            seriesNumber(a);
        }
        sc.close();
    }
}
