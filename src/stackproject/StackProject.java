/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

import java.util.ArrayList;
import java.util.LinkedList;
import javafx.scene.Node;

/**
 *
 * @author tfranz
 */
public class StackProject <T extends String>{

   
    /**
     * @param args the command line arguments
     */
 private int maxsize;
 private int end;
 private ArrayList<T> stack;
 
 public StackProject(int maxsize){
     stack = new ArrayList<>(maxsize);
     this.maxsize = maxsize;
     end = 0;
}
 
 public void push(T item) {
    stack.add(end, item);
    end++;
 }
 
 public T pop() {
    return stack.get(--end);
 }
}

 

    
