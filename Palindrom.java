import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        if(findPalindrom() == true){
            System.out.println("Girdiğiniz kelime palindrom bir kelimedir! ");
        }
        else{
            System.out.println("Girdiğiniz kelime palindrom bir kelime değildir ");
        }
    }
    static boolean findPalindrom(){

        Scanner inp = new Scanner(System.in);

        String str;

        System.out.println("Bir kelime giriniz: ");
        str = inp.next();

        String str1 = str;
        int n = 0;

        for(int i = str.length() - 1; i > 0; i--){
            if(str.charAt(i) == str1.charAt(n)){
                n++;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
