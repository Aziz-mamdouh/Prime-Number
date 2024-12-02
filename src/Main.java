import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        check1 num = new check1();
        check2 numm = new check2();

        System.out.println("please enter the num :");
        int in =input.nextInt();
        num.setX(in);
        numm.setX(in);
        num.checkprime();
        numm.checkPrime2();





    }
}