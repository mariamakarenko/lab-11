
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        while (true) {
            System.out.print("1- delete probel" + "\n" + "2- password generator" + "\n");
            Scanner scan0 = new Scanner(System.in);
            try {
                int key = scan0.nextInt();
                if (key == 1 || key == 2) {
                    switch (key) {
                        case 1:
                            Probel prob = new Probel();
                            prob.delProb();

                        case 2:
                            Scanner scan1 = new Scanner(System.in);
                            System.out.format("\nEnter size password\n");
                            int size = scan1.nextInt();
                            PasswordGenerator passGen = new PasswordGenerator();
                            String pass = passGen.getPass(size);
                            System.out.format("generated pass is %s\n", pass);
                    }
                } else System.out.print("No correct" + "\n");
            }
            catch (Exception error)
            {
                System.out.print(error);
            }
        }
    }
}
