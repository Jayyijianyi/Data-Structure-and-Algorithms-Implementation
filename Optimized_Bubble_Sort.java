
//To sort the array of {100, 10, 15, 20, 45, 70, 30}
//This time, the function optimized by stopping the algorithm if inner loop didn’t cause any swap.

public class Optimized_Bubble_Sort {
    //Optimized version of Bubble sort
    static void bubbleSort (int array[], int size){

        int i, j, temp;
        boolean swapped;
        for (i=0; i< size - 1; i++){
            swapped = false;
            for(j=0; j<size-i-1; j++){
                if (array[j] > array [j+1]){
                    //swap array[j] and array[j+1]
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped =true;
                }
            }

            //If no 2 elements were swapped by inner loop, then break
            if (swapped == false){
                break;
            }
        }
    }

    static void printArray (int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }System.out.println();
    }

    public static void main (String args[]){
        Optimized_Bubble_Sort obs = new Optimized_Bubble_Sort();
        int array[] = {100, 10, 15, 20, 45, 70, 30};
        int n = array.length;
        obs.bubbleSort(array, n);
        System.out.println("Sorted Array: ");
        printArray(array);
    }
}

/*
Output:
Sorted Array: 
10 15 20 30 45 70 100 
 */
