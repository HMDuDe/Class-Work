package mystack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayClass {
    
    public static void main(String[] args){
        try {
            MyStack test = new MyStack();
            
            test.push(20);
            System.out.println(test.myArray());
            test.push(21);
            System.out.println(test.myArray());
            System.out.println(test.pop());
            
            System.out.println(test.getTop());
        } catch (Exception ex) {
            Logger.getLogger(ArrayClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
