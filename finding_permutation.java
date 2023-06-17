import java.util.Scanner;
public class finding_permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n;           //total number of items:
        int n1;
        int r;           //number of items to be choosen in each permutation
        int facto=1;
        int facto1=1;
        int p;
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
        p=facto/facto1;
       System.out.println("The permutaion is: "+p);
    }
}
