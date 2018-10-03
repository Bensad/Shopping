/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;
import java.util.Scanner;

/**
 *
 * @author besad0473
 */
public class Shopping {
    Scanner keyedInput = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double USB = 19.99;
        final double Mouse = 25.99;
       final double Keyboard = 49.99;
       double cost = 0;
       int usb ;
       int mouse;
       int key;
       Scanner keyedInput = new Scanner (System.in);
        System.out.println("How many USBs");
           usb = keyedInput.nextInt();
           System.out.println("How many Mouses");
           mouse = keyedInput.nextInt();
           System.out.println("How many Keyboards");
           key = keyedInput.nextInt();
           
           cost = usb*USB + Mouse*mouse + Keyboard*key;
           System.out.println("It will cost $"+ cost);
           
           
       
        // TODO code application logic here
    }
    
}
