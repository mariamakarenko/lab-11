
import java.lang.*;
import java.util.Scanner;

public class Probel {
    Scanner in = new Scanner(System.in);
    void delProb() {
        System.out.print("\n"+ "Enter your text:  ");
        String s = in.nextLine();
        s = s.replaceAll(" +", " ");
        if(s.charAt(0) == ' ')  {
            s = s.substring(1, s.length());
        }
        if(s.charAt(s.length()-1) == ' ') {
            s = s.substring(0, s.length()-1);
        }
        System.out.print(s);
    }
}