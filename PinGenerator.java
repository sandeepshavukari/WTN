import java.util.Scanner;

public class PinGenerator {
    public static int [] even(int a)
    {
        int ar[]=new int[2];
        while(a>0)
        {
            int r=a%10;
            if(r%2==0)
            {
               ar[0]+=r;
            }else
            {
                ar[1]+=r;
            }
            a=a/10;
        }
        return ar;
    }
    public static int pingenerator(int a1,int a2,int a3,int a4)
    {
        int pin=0;
        int a1r[]=even(a1);
        int a2r[]=even(a2);
        int a3r[]=even(a3);
        int se=a1r[0]+a2r[0]+a3r[0];
        int so=a1r[1]+a2r[1]+a3r[1];
        if(a4%2==0)
        {
            pin=se-so;
        }
        else
        {
            pin=so-se;
        }
        return pin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        System.out.println(pingenerator(a1, a2, a3, a4));
    }
}
