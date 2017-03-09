package chapter5HWproject;

/**
 * @author jackjt
 */
public class Chapter5HW
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // 1. Complete the CirucularArrayQueue and LinkedQueue classes /// DONE
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        
        System.out.println("Now creating the CircularArrayQueue object...");
        CircularArrayQueue<String> caq = new CircularArrayQueue<String>();
        
        System.out.println("Now creating the LinkedQueue object...\n");
        LinkedQueue<String> lq = new LinkedQueue<String>();
        
        
        
        System.out.println("Debugging initialized: CircularArrayQueue:\n");
        System.out.println("Is the CircularArrayQueue object empty? (true/yes, false/no) -> " + caq.isEmpty());
        System.out.print("First element in the CircularArrayQueue object: ");
        
        try
        {
            System.out.println(caq.first());
        }
        catch (EmptyCollectionException caqFirst1)
        {
            System.out.println("N/A\n" + caqFirst1.getMessage());
        }
        
        System.out.println("Current size of the CircularArrayQueue object: " + caq.size());
        System.out.println("Now adding 2 elements to the CircularArrayQueue object...");
        caq.enqueue("LOTR #1: The Fellowship of the Ring");
        caq.enqueue("LOTR #2: The Two Towers");
        System.out.println("String representation of the CircularArrayQueue object: " + caq.toString());
        System.out.println("Is the CircularArrayQueue object empty? (true/yes, false/no) -> " + caq.isEmpty());
        System.out.println("Current size of the CircularArrayQueue object: " + caq.size());
        System.out.print("First element in the CircularArrayQueue object: ");
        
        try
        {
            System.out.println(caq.first());
        }
        catch (EmptyCollectionException caqFirst2)
        {
            System.out.println("N/A\n" + caqFirst2.getMessage());
        }
        
        System.out.println("Now removing 1 element from the CircularArrayQueue object...");
        
        try
        {
            caq.dequeue();
        }
        catch (EmptyCollectionException caqDeque1)
        {
            System.out.println(caqDeque1.getMessage());
        }
        
        System.out.print("First element in the CircularArrayQueue object: ");
        
        try
        {
            System.out.println(caq.first());
        }
        catch (EmptyCollectionException caqFirst3)
        {
            System.out.println("N/A\n" + caqFirst3.getMessage());
        }
        
        System.out.println("Is the CircularArrayQueue object empty? (true/yes, false/no) -> " + caq.isEmpty());
        System.out.println("Current size of the CircularArrayQueue object: " + caq.size());
        System.out.println("Now removing 2 elements from the CircularArrayQueue object...");
        
        try
        {
            caq.dequeue();
        }
        catch (EmptyCollectionException caqDeque2)
        {
            System.out.println(caqDeque2.getMessage());
        }
        
        try
        {
            caq.dequeue();
        }
        catch (EmptyCollectionException caqDeque3)
        {
            System.out.println(caqDeque3.getMessage());
        }
        
        System.out.println("Debugging complete: No errors found in the CircularArrayQueue object.\n\n\n");
        
        
        
        System.out.println("Debugging initialized: LinkedQueue:\n");
        System.out.println("Is the LinkedQueue object empty? (true/yes, false/no) -> " + lq.isEmpty());
        System.out.print("First element in the LinkedQueue object: ");
        
        try
        {
            System.out.println(lq.first());
        }
        catch (EmptyCollectionException lqFirst1)
        {
            System.out.println("N/A\n" + lqFirst1.getMessage());
        }
        
        System.out.println("Current size of the LinkedQueue object: " + lq.size());
        System.out.println("Now adding 2 elements to the LinkedQueue object...");
        lq.enqueue("Episode I: The Phantom Menace");
        lq.enqueue("Episode II: Attack of the Clones");
        System.out.println("Here is a string representation of the LinkedQueue object: " + lq.toString());
        System.out.println("Is the LinkedQueue object empty? (true/yes, false/no) -> " + lq.isEmpty());
        System.out.println("Current size of the LinkedQueue object: " + lq.size());
        System.out.print("First element in the LinkedQueue object: ");
        
        try
        {
            System.out.println(lq.first());
        }
        catch (EmptyCollectionException lqFirst2)
        {
            System.out.println("N/A\n" + lqFirst2.getMessage());
        }
        
        System.out.println("Now removing 1 element from the LinkedQueue object...");
        
        try
        {
            lq.dequeue();
        }
        catch (EmptyCollectionException lqDeque1)
        {
            System.out.println(lqDeque1.getMessage());
        }
        
        System.out.print("First element in the LinkedQueue object: ");
        
        try
        {
            System.out.println(lq.first());
        }
        catch (EmptyCollectionException lqFirst3)
        {
            System.out.println("N/A\n" + lqFirst3.getMessage());
        }
        
        System.out.println("Is the LinkedQueue object empty? (true/yes, false/no) -> " + lq.isEmpty());
        System.out.println("Current size of the LinkedQueue object: " + lq.size());
        System.out.println("Now removing 2 elements from the LinkedQueue object...");
        
        try
        {
            lq.dequeue();
        }
        catch (EmptyCollectionException lqDeque2)
        {
            System.out.println(lqDeque2.getMessage());
        }
        
        try
        {
            lq.dequeue();
        }
        catch (EmptyCollectionException lqDeque3)
        {
            System.out.println(lqDeque3.getMessage());
        }
        
        System.out.println("Debugging complete: No errors found in the LinkedQueue object.\n\n\n");
    }
}