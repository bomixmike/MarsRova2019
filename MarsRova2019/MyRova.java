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
    
    System.out.print("WELCOME TO MARS ROVA CONTROL \nTO MOVE THE ROVA ENTER THE FOLLOWING COMMANDS IN 'CAPITAL LETTERS' \n\n");
    
    System.out.print("ENTER 'F' - FRONT \nENTER 'B' - BACK \nENTER 'L' - LEFT \nENTER 'R' - RIGHT \n" );
    
          
          Scanner in = new Scanner(System.in); //scanner for taking input from the person controlling 
         // System.out.print("Enter Direction to move Rova, f is front, b is back, l is left,r is right: ");  
          
          String direction = in.nextLine(); 
          String coord = String.valueOf(x) +""+ String.valueOf(y); //coordinates for my positioning
          
       
          char[] ch=direction.toCharArray();    //Convert to character array
            for(int i=0;i<ch.length;i++){
              if(ch[i] =='L'){
          System.out.println("the Rova turned left " + coord+"\n"); 
            
              }else if(ch[i] ==' '){
                continue;}
              
              else if(ch[i] =='f' || ch[i] =='r' ||ch[i] =='l' || ch[i] =='b'){
                System.out.println("Please USE, UPPER CASE controls ONLY"); }
              
           else if(ch[i] =='R'){
          System.out.println("the Rova turned right at " + coord+"\n"); 
          
          }else if(ch[i] =='F'){
          System.out.println("the Rova moved front at " + coord+"\n"); 
          }else if(ch[i] =='B') {
          System.out.println("the Rova moved back at " + coord+"\n"); 
          }else{
          System.out.println("FOLLOW INSTRUCTIONS TO MOVE THE ROVA"+"\n"); 
          }
              }
            
           
            if(direction =="f" || direction =="r" ||direction =="l" || direction =="b"){
              System.out.println("Please USE, UPPER CASE controls ONLY!!!"); 
              
            }else{
               
            countEachChar(direction); //method call to count characters
            }
           
          
         /* if(direction.equalsIgnoreCase("l")){
          System.out.println("the Rova moved left " + coord); 
          
          }else if(direction.equalsIgnoreCase("r")){
          System.out.println("the Rova moved right at " + coord); 
          
          }else if(direction.equalsIgnoreCase("f")){
          System.out.println("the Rova moved front at " + coord); 
          }else if(direction.equalsIgnoreCase("b")) {
          System.out.println("the Rova moved back at " + coord); 
          }else{
          System.out.println("Rova will not move unless you put in the right directions"); 
          } */
          
          in.close(); 
          
          
          
          
      
                    
 }
     //METHOD TO COUNT CHARACTERS
  // method used to count characters in a String
public static void countEachChar(String str) 
   { 
 //ASCII values ranges upto 256
 int counter[] = new int[256]; 

 //String length
 int len = str.length(); 

 /* This array holds the occurrence of each char, For example
  * ASCII value of A is 65 so if A is found twice then 
  * counter[65] would have the value 2, here 65 is the ASCII value
  * of A
  */
 for (int i = 0; i < len; i++) 
  counter[str.charAt(i)]++; 

 // i AM creating another array with the size of String
 char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
    array[i] = str.charAt(i); 
    int flag = 0; 
    for (int j = 0; j <= i; j++) { 

  /* If a char is found in String then set the flag 
   * so that i can know its occurence to use for setting the direction it is facing
   */
  if (str.charAt(i) == array[j])  
   flag++;                 
    } 

    if (flag == 1)  
       System.out.println("The Mars Rova Moved " + str.charAt(i)
   + " :" + counter[str.charAt(i)]+" TIMES");
    
    //My assumption is that the rover originally is facing North as its starting point and each turn left or right is 45 degree turn
    if(str.charAt(i) =='R'){
             System.out.println("The mars rova is facing EAST ");
          /*else if(counter[str.charAt(i)].equals(2)){
             System.out.println("The mars rova is facing SOUTH ");
          }else if(counter[str.charAt(i)].equals(3)){
             System.out.println("The mars rova is facing WEST ");
          }else if(counter[str.charAt(i)].equals(4)){
             System.out.println("The mars rova is facing NORTH ");
          }else if(counter[str.charAt(i)].equals(5)){
             System.out.println("The mars rova has not yet been deisnged for more than 360 degree turns");
          }*/
    }else if(str.charAt(i) =='L'){
             System.out.println("The mars rova is facing WEST ");
         
    }
 } 
}   
// END METHOD TO COUNT CHARACTERS   

}
