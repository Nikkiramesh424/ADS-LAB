import java.util.*;
class Binarysearch  
{
  int binarysearch(int array[], int x, int low, int high) 
  {
    while (low <= high) 
    {
      int mid = low + (high - low) / 2;
         if (array[mid] == x)
             return mid;

         if (array[mid] < x)
            low = mid + 1;

         else
             high = mid - 1;
    }
     return -1;
  }
   public static void main(String args[])
  {
    Binarysearch ob = new Binarysearch();
    int array[] = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;
    Scanner sc = new Scanner (System.in);
    int x=sc.nextInt();
    int result = ob.binarysearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
     OUTPUT:     3
                 Element found at index 0

    
