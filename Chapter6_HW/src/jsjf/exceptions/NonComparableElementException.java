package jsjf.exceptions;

public class NonComparableElementException extends RuntimeException
{
   public NonComparableElementException(String collection)
   {
      super(collection + " needs comparable elements.");
   }
}
