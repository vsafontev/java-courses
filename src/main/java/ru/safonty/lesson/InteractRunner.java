package ru.safonty.lesson;
import java.util.Scanner;



/**
 * Created by safon on 03.06.2016.
 */
public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String operation = "add";


            while (!exit.equals("yes")) {
                System.out.println("Operation : add/sub/multi/div ");
                operation = reader.next();
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                if (operation.equals("add")) {
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));
                }
                else if (operation.equals("div")) {
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                 }

                else if (operation.equals("sub")) {
                    calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                }

                else if (operation.equals("multi")) {
                    calc.multi(Integer.valueOf(first), Integer.valueOf(second));
                }

                else {
                    System.out.println("operation corrupted!!!");
                }



                System.out.println("Result : " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no ");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
