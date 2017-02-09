/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1project;
 
import jsjf.ArrayStack; 

/**
 * @author jackjt
 */
public class Exam1Project
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("Creating an ArrayStack object...");
        ArrayStack<String> myArrayStack = new ArrayStack<String>();
        System.out.println("First, let's push 'booyah', then 'yada-yada' onto the stack.");
        myArrayStack.push("booyah");
        myArrayStack.push("yada-yada");
        System.out.println("Now, let's peek: " + myArrayStack.peek());
        System.out.println("Here is the current size: " + myArrayStack.size());
        System.out.println("The ArrayStack object is empty: true or false? --> " + myArrayStack.isEmpty());
        System.out.println("Here is what the toString() method says:\n" + myArrayStack.toString());
        System.out.println("Now, let's pop both items off the stack.");
        myArrayStack.pop();
        myArrayStack.pop();
        System.out.println("Here is the current size: " + myArrayStack.size());
        System.out.println("The ArrayStack object is empty: true or false? --> " + myArrayStack.isEmpty());

        System.out.println("\nNow, let's move to the LinkedStack.\n");

        System.out.println("Creating a LinkedStack object...");
        LinkedStack<String> myLinkedStack = new LinkedStack<String>();
        System.out.println("First, let's push 'randomExample', then 'foo' onto the stack.");
        myLinkedStack.push("randomExample");
        myLinkedStack.push("foo");
        System.out.println("Now, let's peek: " + myLinkedStack.peek());
        System.out.println("Here is the current size: " + myLinkedStack.size());
        System.out.println("The LinkedStack object is empty: true or false? --> " + myLinkedStack.isEmpty());
        System.out.println("Here is what the toString() method says:\n" + myLinkedStack.toString());
        System.out.println("Now, let's pop an item off the stack.");
        myLinkedStack.pop();
        myLinkedStack.pop();
        System.out.println("Here is the current size: " + myLinkedStack.size());
        System.out.println("The LinkedStack object is empty: true or false? --> " + myLinkedStack.isEmpty());
    }
}