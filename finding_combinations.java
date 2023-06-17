import java.util.Scanner;
public class finding_combinations {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n;           //total number of items:
        int n1;
        int r;           //number of items to be choosen in each permutation
        int facto=1;
        int facto1=1;
        int facto2=1;
        int c;
        System.out.println("Enter the n: ");
        n=s.nextInt();
        System.out.println("Enter r: ");
        r=s.nextInt();
        n1=n-r;
        for(int i=n;i>=1;i--){
            facto=facto*i;
        }
        for(int i=n1;i>=1;i--){
            facto1=facto1*i;
        }
        for(int i=r;i>=1;i--){
            facto2=facto2*i;
        }
        c=facto/(facto2*facto1);
        System.out.println("The combination is: "+c);

    }
}
