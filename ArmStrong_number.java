import java.util.Scanner;
public class ArmStrong_number {
    public static void main(String []args){
         Scanner s=new Scanner(System.in);
        int num;
        int check=0;
        double sum=0;
        double r,r1;
        System.out.println("Enter the number :");
        num=s.nextInt();
        int temp=num;
        int temp1=num;
        while(temp!=0) {
            temp = temp / 10;
            check++;
        }
        //System.out.println("The number of digits: "+check);
        for(int i=1;i<=check;i++){
            r=temp1%10;
            r1=Math.pow(r,check);
            temp1=temp1/10;
            sum=sum+r1;
        }if(num==sum){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("Not the armstrong: ");
        }
    }
}
