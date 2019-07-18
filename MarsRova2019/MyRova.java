
/* Author: Bongomin Micheal*/
import java.util.*;  
//import java.io.IOException;
public class MyRova{ //my mars rova class 
      
      /* start variable declarations*/
  
      //starting coordinates
       static Integer x = 0;
       static Integer y = 0;
  
       String direction = "N"; //my default direction is north, the rova has to be rovadirection somewhere at the start
      //directions
      public static final String n = "N"; // for north
      public static final String e = "E"; //for east
      public static final String w = "W";  //for west
      public static final String s = "S";  //for south
      
      /* end variable declarations*/
  public static void main(String[] args){
    
    System.out.print("WELCOME TO MARS ROVA CONTROL \nTO MOVE THE ROVA ENTER THE FOLLOWING COMMANDS \n\n");
    
    System.out.print("ENTER 'F' - FRONT \nENTER 'B' - BACK \nENTER 'L' - LEFT \nENTER 'R' - RIGHT \n" );
    
         Scanner in = new Scanner(System.in); //scanner for taking input from the person controlling 
         // System.out.print("Enter Direction to move Rova, f is front, b is back, l is left,r is right: ");  
          
          String direction = in.nextLine(); 
          String coord = String.valueOf(x) +""+ String.valueOf(y); //coordinates for my positioning
          
          
          if(direction.equalsIgnoreCase("l")){
          System.out.println("the Rova moved left " + coord); 
          
          }else if(direction.equalsIgnoreCase("r")){
          System.out.println("the Rova moved right at " + coord); 
          
          }else if(direction.equalsIgnoreCase("f")){
          System.out.println("the Rova moved front at " + coord); 
          }else if(direction.equalsIgnoreCase("b")) {
          System.out.println("the Rova moved back at " + coord); 
          }else{
          System.out.println("Rova will not move unless you put in the right directions"); 
          }
          
          in.close(); 
          
          
                    
 }
  

}
