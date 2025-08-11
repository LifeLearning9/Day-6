import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String b[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String s="";
        for(int i=0;i<a.length;i++)
        {
            while(n>=a[i])
            {
                s=s+b[i];
                n=n-a[i];
            }
        }
        System.out.print(s);
    }
}
