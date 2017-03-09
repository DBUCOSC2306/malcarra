package jsjf.exceptions;

public class ElementNotFoundException extends RuntimeException
{
   public ElementNotFoundException(String collection)
   {
      super("The element is not in the " + collection);
   }
}
