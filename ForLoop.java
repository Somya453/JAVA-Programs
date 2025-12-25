import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine();
        System.out.println(name);


        for(int i = 0; i <= 3; i++) {
            System.out.println("Namste " + name);
        }
    }
    
}
