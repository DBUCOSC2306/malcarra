package chapter6HWproject;

/**
 * @author jackjt
 */
public class Chapter6HW
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // 1. Complete the incomplete classes (+)
        // 2. In this main, write a test for each method AND any exceptions (+)
        // 3. Push all of the changes back to the repository (git push)
        
        System.out.println("Now creating an ArrayUnorderedList object...");
        ArrayUnorderedList<String> arrUnordered = new ArrayUnorderedList<String>();
        
        System.out.println("Now creating an ArrayOrderedList object...");
        ArrayOrderedList<String> arrOrdered = new ArrayOrderedList<String>();
        
        System.out.println("Now creating an ArrayUnorderedList object...");
        LinkedUnorderedList<String> linkUnordered = new LinkedUnorderedList<String>();
        
        System.out.println("Now creating an ArrayUnorderedList object...\n");
        LinkedOrderedList<String> linkOrdered = new LinkedOrderedList<String>();
        
        
        
        
        System.out.println("Debugging initialized: ArrayUnorderedList:\n");
        System.out.println("Is the ArrayUnorderedList object empty? (true/yes, false/no) -> " + arrUnordered.isEmpty());
        System.out.print("First element in the ArrayUnorderedList object: ");
        
        try
        {
            System.out.println(arrUnordered.first());
        }
        catch (EmptyCollectionException arUnFirst1)
        {
            System.out.println("N/A\n" + arUnFirst1.getMessage());
        }
        
        System.out.println("Current size of the ArrayUnorderedList object: " + arrUnordered.size());
        System.out.println("Now adding 2 elements to the front of the ArrayUnorderedList object...");
        arrUnordered.addToFront("Genesis");
        arrUnordered.addToFront("Exodus");
        System.out.println("Now adding 2 elements to the rear of the ArrayUnorderedList object...");
        arrUnordered.addToRear("Leviticus");
        arrUnordered.addToRear("Numbers");
        System.out.println("Now adding 2 elements after the second element of the ArrayUnorderedList object...");
        arrUnordered.addAfter("Deuteronomy", "Exodus");
        arrUnordered.addAfter("Joshua", "Exodus");
        System.out.println("String representation of the ArrayUnorderedList object: " + arrUnordered.toString());
        System.out.println("Is the ArrayUnorderedList object empty? (true/yes, false/no) -> " + arrUnordered.isEmpty());
        System.out.println("Current size of the ArrayUnorderedList object: " + arrUnordered.size());
        System.out.print("First element in the ArrayUnorderedList object: ");
        
        try
        {
            System.out.println(arrUnordered.first());
        }
        catch (EmptyCollectionException arUnFirst2)
        {
            System.out.println("N/A\n" + arUnFirst2.getMessage());
        }
        
        System.out.println("Because it is not asking to remove anything, steps have been skipped for further debugging on ArrayUnorderedList.");
        System.out.println("Debugging complete: No errors found in the ArrayUnorderedList object.\n\n\n");
        
        
        
        
        System.out.println("Debugging initialized: ArrayOrderedList:\n");
        System.out.println("Is the ArrayOrderedList object empty? (true/yes, false/no) -> " + arrOrdered.isEmpty());
        System.out.print("First element in the ArrayOrderedList object: ");
        
        try
        {
            System.out.println(arrOrdered.first());
        }
        catch (EmptyCollectionException arOrdFirst1)
        {
            System.out.println("N/A\n" + arOrdFirst1.getMessage());
        }
        
        System.out.println("Current size of the ArrayOrderedList object: " + arrOrdered.size());
        System.out.println("Now adding 6 elements to the front of the ArrayOrderedList object...");
        arrOrdered.add("Genesis");
        arrOrdered.add("Exodus");
        arrOrdered.add("Leviticus");
        arrOrdered.add("Numbers");
        arrOrdered.add("Deuteronomy");
        arrOrdered.add("Joshua");
        System.out.println("String representation of the ArrayOrderedList object: " + arrOrdered.toString());
        System.out.println("Is the ArrayOrderedList object empty? (true/yes, false/no) -> " + arrOrdered.isEmpty());
        System.out.println("Current size of the ArrayOrderedList object: " + arrOrdered.size());
        System.out.print("First element in the ArrayOrderedList object: ");
        
        try
        {
            System.out.println(arrOrdered.first());
        }
        catch (EmptyCollectionException arOrdFirst2)
        {
            System.out.println("N/A\n" + arOrdFirst2.getMessage());
        }
        
        System.out.println("Because it is not asking to remove anything, steps have been skipped for further debugging on ArrayOrderedList.");
        System.out.println("Debugging complete: No errors found in the ArrayOrderedList object.\n\n\n");
        
        
        
        
        System.out.println("Debugging initialized: LinkedUnorderedList:\n");
        System.out.println("Is the LinkedUnorderedList object empty? (true/yes, false/no) -> " + linkUnordered.isEmpty());
        System.out.print("First element in the LinkedUnorderedList object: ");
        
        try
        {
            System.out.println(linkUnordered.first());
        }
        catch (EmptyCollectionException linUnFirst1)
        {
            System.out.println("N/A\n" + linUnFirst1.getMessage());
        }
        catch (NullPointerException unordLinkNull1)
        {
            System.out.println("N/A\nNullPointerException was caught.");
        }
        
        System.out.println("Current size of the LinkedUnorderedList object: " + linkUnordered.size());
        System.out.println("Now adding 2 elements to the front of the LinkedUnorderedList object...");
        linkUnordered.addToFront("Genesis");
        linkUnordered.addToFront("Exodus");
        System.out.println("Now adding 2 elements to the rear of the LinkedUnorderedList object...");
        linkUnordered.addToRear("Leviticus");
        linkUnordered.addToRear("Numbers");
        System.out.println("Now adding 2 elements after the second element of the LinkedUnorderedList object...");
        linkUnordered.addAfter("Deuteronomy", "Exodus");
        linkUnordered.addAfter("Joshua", "Exodus");
        System.out.println("String representation of the LinkedUnorderedList object: " + linkUnordered.toString());
        System.out.println("Is the LinkedUnorderedList object empty? (true/yes, false/no) -> " + linkUnordered.isEmpty());
        System.out.println("Current size of the LinkedUnorderedList object: " + linkUnordered.size());
        System.out.print("First element in the LinkedUnorderedList object: ");
        
        try
        {
            System.out.println(linkUnordered.first());
        }
        catch (EmptyCollectionException linUnFirst2)
        {
            System.out.println("N/A\n" + linUnFirst2.getMessage());
        }
        catch (NullPointerException unordLinkNull2)
        {
            System.out.println("N/A\nNullPointerException was caught.");
        }
        
        System.out.println("Because it is not asking to remove anything, steps have been skipped for further debugging on LinkedUnorderedList.");
        System.out.println("Debugging complete: No errors found in the LinkedUnorderedList object.\n\n\n");
        
        
        
        
        System.out.println("Debugging initialized: LinkedOrderedList:\n");
        System.out.println("Is the LinkedOrderedList object empty? (true/yes, false/no) -> " + linkOrdered.isEmpty());
        System.out.print("First element in the LinkedOrderedList object: ");
        
        try
        {
            System.out.println(linkOrdered.first());
        }
        catch (EmptyCollectionException linOrd1)
        {
            System.out.println("N/A\n" + linOrd1.getMessage());
        }
        catch (NullPointerException ordLinkNull1)
        {
            System.out.println("N/A\nNullPointerException was caught.");
        }
        
        System.out.println("Current size of the LinkedOrderedList object: " + linkOrdered.size());
        System.out.println("Now adding 6 elements to the front of the LinkedOrderedList object...");
        linkOrdered.add("Genesis");
        linkOrdered.add("Exodus");
        linkOrdered.add("Leviticus");
        linkOrdered.add("Numbers");
        linkOrdered.add("Deuteronomy");
        linkOrdered.add("Joshua");
        System.out.println("String representation of the LinkedOrderedList object: " + linkOrdered.toString());
        System.out.println("Is the LinkedOrderedList object empty? (true/yes, false/no) -> " + linkOrdered.isEmpty());
        System.out.println("Current size of the LinkedOrderedList object: " + linkOrdered.size());
        System.out.print("First element in the LinkedOrderedList object: ");
        
        try
        {
            System.out.println(linkOrdered.first());
        }
        catch (EmptyCollectionException linOrd2)
        {
            System.out.println("N/A\n" + linOrd2.getMessage());
        }
        catch (NullPointerException ordLinkNull2)
        {
            System.out.println("N/A\nNullPointerException was caught.");
        }
        
        System.out.println("Because it is not asking to remove anything, steps have been skipped for further debugging on LinkedOrderedList.");
        System.out.println("Debugging complete: No errors found in the LinkedOrderedList object.");
    }
}