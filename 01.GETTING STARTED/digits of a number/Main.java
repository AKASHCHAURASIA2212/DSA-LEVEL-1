import java.util.*;
    
    public class Main{
    
    public static int reverse(int num)
    {
        int n1 = num;
        int dig =0;
        while(n1!=0)
        {
            n1/=10;
            dig++;
        }
                System.out.println(dig);

        int revnum=0,count=1;
        while(num!=0)
        {
            int rem=num%10;
            //  System.out.println("rem --> "+rem);
            num=num/10;
            revnum=revnum+rem*(int)Math.pow(10,dig-1);
            //  System.out.println("revnum --> "+revnum);
            count++;
            dig--;
        }
        System.out.println(revnum);

        return revnum;
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
    //   int revnum = reverse(num);
       
    //   while(revnum!=0)
    //   {
    //       int rem = revnum%10;
    //       revnum=revnum/10;
    //       System.out.println(rem);
    //   }
      int power = 1;
    int temp = n;
    while (temp >= 10) {
      temp /= 10;
      power *= 10;
    }

    temp = n;
    while (power != 0) {
      int digit = temp / power;
      System.out.println(digit);

      temp = temp % power;
      power = power / 10;
    }
     }
    }