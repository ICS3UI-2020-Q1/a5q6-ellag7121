import java.util.Scanner;
/**
 * ask user for number between 1 and 10, draw a box of * with that width and height
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a new scanner to get user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int number; //the number given by the user

    //ask user for number
    System.out.println("Please enter a number between 1 and 10");
    number = input.nextInt();

    //make a for loop to draw the correct number of rows
    for(int i = 0; i < number; i++){
      //make another for loop to draw each line of stars
      for(int j = 0; j < number; j++){
        //draw a star
        System.out.print("*");
      }
      //move down 1 line
      System.out.println("");
    }
  }
}
