/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projcal.calculator;
import java.util.Scanner;
/**
 *
 * @author Aspire
 */
public class Test {
    
    public static void Testing(){
    Scanner Number1 = new Scanner(System.in);
    Scanner Number2 = new Scanner(System.in);
    Scanner Number3 = new Scanner(System.in);
    Scanner Operation = new Scanner(System.in);
    Scanner Repeat = new Scanner(System.in);
    
    //Created Three objects to reference methods to use
    Arithmetic Basic = new Arithmetic();
    Volume Vol = new Volume();
    Area Area = new Area();
    
    char UserOp;
    String Again;
    int x, y, z;
    boolean end = true;
   
    
    //Loop for Calculator operation
    while(end){
      System.out.println("...Calculator is running");
      System.out.println("+ - * / a v");
      System.out.print("Choose an operator: ");
      UserOp = Operation.next().charAt(0);
      
      //Uses If statements which has switch case statements inside of it
      if(UserOp == '+' || UserOp == '-' || UserOp == '*' || UserOp == '/'){
          System.out.println("Please enter two numbers");
          System.out.print("Enter first number: ");
          x = Number1.nextInt();
          System.out.print("Enter Second number: ");
          y = Number2.nextInt();
      
      switch(UserOp){
          case '+' -> Basic.Addition(x, y);
          case '-' -> Basic.Subtraction(x, y);
          case '*' -> Basic.Multiplication(x, y);
          case '/' -> Basic.Addition(x, y);
          default -> System.out.println("Invalid operator!");
         }//End of Switch
        } // End of if-statement
      else if(UserOp == 'a'){
          System.out.print("Enter first number: ");
          x = Number1.nextInt();
          Area.Circle(x);
        }
      else if(UserOp == 'v'){
          System.out.print("Enter first number: ");
          x = Number1.nextInt();
          System.out.print("Enter Second number: ");
          y = Number2.nextInt();
          System.out.print("Enter Third number: ");
          z = Number3.nextInt();
           Vol.Rectangle(x ,y ,z);      
          }
       else{
          System.out.println("Incorrect Operator");
        }
        // Will end Loop if User Input is N/n
        System.out.print("Another operation? Y or N: ");
        Again = Repeat.next();
        if(Again.equals("N")){
            end = false;
            System.out.println("...Calculator stopping");
        }
        else if(Again.equals("n")){
            end = false;
            System.out.println("...Calculator stopping");
       } 
    } //End of While loop
  }//End of Testing method
} // End of Class Test

/**
 *
 * @author Aspire
 */
