import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     int b=0;
     int c,r,n;
        System.out.println("Enter the number :");
        n=s.nextInt();
        c=n;
        while (n>0){
            r=n%10;
            b=(b*10)+r;
            n=n/10;
        }
        if(c==b){
            System.out.println("The number is a plaindrome:");
        }
        else {
            System.out.println("Not a plaindrome: ");
        }


    }
}
