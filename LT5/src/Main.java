import java.util.Scanner;
import javax.swing.JOptionPane;

abstract class MainClass {
    int inp1, inp2, total;

    abstract void twonumbers();
    abstract void plus();
    abstract void Sum();
    Scanner sc = new Scanner(System.in);
}

class Main extends MainClass {

    void twonumbers() {
        System.out.print("Enter two inputs:\n ");
        System.out.print("Input 1: ");
        inp1 = sc.nextInt();
        System.out.print("Input 2: ");
        inp2 = sc.nextInt();
    }

    void plus() {
        total = inp1 + inp2;
    }

    void Sum() {
        System.out.print("Total: " + total);
    }

    public static void main(String args[]) {
        Main A = new Main();
        A.twonumbers();
        A.plus();
        A.Sum();
        //////////JoptionPane.showInputDialog(A.sum);
        ////// is supposed to be my code but i cant run it, i tried other methods too but it doesnt work, having problems
        ///// in presenting the dialogue box with the total in using abstraction or inheritance
    }
}