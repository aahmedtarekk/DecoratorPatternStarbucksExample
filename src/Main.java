import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Beverage basebeverage = new BaseBeverage();
            System.out.println("Welcome to Starbucks, what would you like to add to your beverage?");
            while(true)
            {
                System.out.println("Would you like to add 1.Mocha or 2.MilkChocolate?");
                Scanner s = new Scanner(System.in);
                int choice = s.nextInt();
                if(choice ==1)
                {
                    Beverage mocha = new Mocha(basebeverage);
                    System.out.println(mocha.description());
                    System.out.println("COST: " + mocha.cost());
                    System.out.println("Thanks for choosing Starbucks, enjoy your day!");
                    break;
                }
                else if(choice ==2)
                {
                    Beverage milk = new Milk(basebeverage);
                    System.out.println(milk.description());
                    System.out.println("COST: " + milk.cost());
                    System.out.println("Thanks for choosing Starbucks, enjoy your day!");
                    break;
                }
                else
                {
                    System.out.println("Wrong choice given!");
                }
            }
    }
}