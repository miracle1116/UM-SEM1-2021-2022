
package labreport1;

import java.util.Random;
import java.util.Scanner;

public class Labreport1 {
    public static double findMedian(int a[]) {
        int median_place;
        if (a.length % 2 == 0) {
            median_place = a.length/2 ;
            return (a[median_place] + a[median_place - 1]) / 2.0;
        }
        else {
            median_place = a.length/2;
            return a[median_place];
        }
    }
    
    public static void sort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int count = 0;
            int j = i - 1;
            while (count <= j) {
                if (a[count] > a[i]) {
                   int temp = a[count];
                   a[count] = a[i];
                   a[i] = temp;
                }
                count++;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        sort(a); // sort array
        
        double median = findMedian(a);
        System.out.println("The mean of this array is "+median);
    }
}

      
        
       
       
           
   
        

 
    

