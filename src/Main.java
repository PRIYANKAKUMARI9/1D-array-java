import java.util.Scanner;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 90;//phy
        marks[1] = 10;//cham
        marks[2] = 50;//math
        System.out.println("marks of physics :--" + marks[0]);
        System.out.println("marks of chamestry :--" + marks[1]);
        System.out.println("marks of math :--" + marks[2] + " hai ");

        //easy me print krwane ke liye for loop use krenge

        String[] add = new String[5];
        add[0] = "name";
        add[1] = "priyanka";
        add[2] = "vivek";
        add[3] = "life";
        add[4] = "till end";


        for (int i = 0; i <= 4; i++) {
            System.out.println("array loop example = " + add[i]);
        }

        //another uses of array syntax

        int[] count = {1, 2, 3, 4, 5};

        for (int i = 0; i <= 4; i++) {
            System.out.println(count[i]);
        }

        //use in this scanner (get input of user)

        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] scan=new int[size];


        //output
        for(int i=0; i<size; i++){
            System.out.println(scan[i]);
        }
    }
}
