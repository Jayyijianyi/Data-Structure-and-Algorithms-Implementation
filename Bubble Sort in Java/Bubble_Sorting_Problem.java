/*
This is a function problem.
You only need to complete the function bubble
that sorts the array.

Input:
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1

Output:
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10

Explanation:
Testcase 1: 1 3 4 7 9 are in sorted form.
Testcase 2: For the given input , 1 2 3 4 5 6 7 8 9 10 are in sorted form.
 */


import java.util.*;

class Bubble_Sorting_Problem {

    /* The task is to complete bubble() which is used
   in below bubbleSort() */

    /* A function to implement bubble sort*/
    static void bubbleSort(int arr[], int n){
        for(int i =0; i<n-1; i++){
            bubble(arr, i, n);
        }
    }

    static void bubble(int arr[], int i, int n){
        //add your code here
        for(int j =0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        System.out.println("Sorted array: ");
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many array you want to sort?");
        int t = sc.nextInt();

        while(t>0){
            System.out.println("What is the length of your array?");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                System.out.println("Input the integer values:");
                arr[i]=sc.nextInt();
            }
            Bubble_Sorting_Problem st = new Bubble_Sorting_Problem();
            bubbleSort(arr, n);
            printArray(arr);

            t--;
        }
    }
}
