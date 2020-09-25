import java.util.Scanner; 
 
public class calculator { 
 public static void main(String[] args) { 
  double answer = 0; 
  Scanner Scan = new Scanner(System.in); 
  Scanner strScan = new Scanner(System.in); 
   
  System.out.println("Enter a number"); 
  Double num1 = Scan.nextDouble(); 
   
  System.out.println("Enter another number"); 
  Double num2 = Scan.nextDouble();
   
  System.out.println("Select an operator: +, -, *, /"); 
  
  String op = strScan.nextLine();
  
  if (op.equals("+")) { answer = num1 + num2;} 
  else if (op.equals("-")) { answer = num1 - num2;} 
  else if (op.equals("*")) { answer = num1 * num2;}
  
  else if (op.equals("/")) {
    answer = num1/num2;
  
  } 
   
  System.out.println(answer) ;
   
 } 
}