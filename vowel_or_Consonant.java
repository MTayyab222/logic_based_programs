import java .util.Scanner;
public class vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c;
        System.out.println("Enter any letter in small alphabet:");
        c=s.next().charAt(0);
        if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
