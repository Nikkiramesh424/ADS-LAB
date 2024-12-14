import java.util.*;
class Bubblee
{
     void bubbleSort(int arr[])
     {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-i-1;j++)
          {
             if(arr[j]>arr[j+1])
             {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
          }
        }
     }
     public static void main(String args[])
     {
          Bubblee obj=new Bubblee();
          int a[]={65,45,98,12};
          obj.bubbleSort(a);
          int n=a.length;
          for(int i=0;i<n;i++)
          {
            System.out.println(a[i]);
            
          }
     }
 }


OUTPUT:
12 
45 
65 
98
       
       
