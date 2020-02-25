/*
Amer stas
 */
package assigment2;
import javax.swing.*;
public class Assigment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // varablies that are needed
       String input;
       String revin = "";
       // Asking the user to enter an input.
       input= JOptionPane.showInputDialog("Enter a word and the program will find out if it's palindrome or not");
       
       //using a loop to inverse the word entered
       for (int i =input.length()-1;i>=0;i--)
       {
           revin +=input.charAt(i);
       }
       // comparing the two words to find out if the world is plain drome or not
       if (input.equalsIgnoreCase(revin))
       {
           JOptionPane.showMessageDialog(null, input+ " is a plaindrome " );
       }
       else 
       {
           JOptionPane.showMessageDialog(null, input+ "is not a plaindrome");
       }
        
    }
}
