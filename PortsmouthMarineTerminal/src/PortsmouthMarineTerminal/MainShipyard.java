package PortsmouthMarineTerminal;

import java.util.Scanner;

public class MainShipyard {

    public static void main(String[] args) {

        boolean cont = true;
        while (cont) {
            char ans = menu();
            switch (ans)
            {
                case 'Q' | 'q':
                    cont = false;
                    break;
            }   // end switch
        }   // end while
    }   // end main

    static char menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("    Portsmouth Marine Terminal");
        System.out.println("Q   Quit Application");
        System.out.print("> ");
        // char ans = input.next().charAt(0);
        return input.next().charAt(0);
    }
}
