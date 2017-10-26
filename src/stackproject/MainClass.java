/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

import java.util.ArrayList;

/**
 *
 * @author tfranz
 */
public class MainClass {
    
   public static void main(String[] args) {
   StackProject <String> myStack = new StackProject(3);
       

    
    myStack.push("Mario");
    myStack.push("Banjo");
    myStack.push("Rayman");
    //stack.push(4); //overflow error
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    
    
    
    }
}
