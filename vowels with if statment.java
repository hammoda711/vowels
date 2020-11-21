

import java.util.Scanner;
public class vowels {

    public static void main(String[] args) {
        String str = "";
        int count = 0;
        System.out.println("enter a text");
        Scanner input = new Scanner(System.in);
        str= input.next();
//converting all the chars to lowercasefor(int i = 0; i < str.length(); i++){ to avoid using both lowercase and highercase 
        str = str.toLowerCase();
      
      for(int i = 0; i < str.length(); i++){  
        char ch = str.charAt(i);
       switch(ch){
           case'o':
           case'u':
           case'i':
           case'e':
           case'a':
               count++;
                      
           break;
          
       } 
              
               
      }     
        System.out.println(count);        
               
               
      } 
    }         
               /* for(int i = 0; i < str.length(); i++){
           
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            count++;
            }*/
       
     
    
        
   



