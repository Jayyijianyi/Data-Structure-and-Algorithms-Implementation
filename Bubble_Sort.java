
//To sort the array of {100, 10, 15, 20, 45, 70, 30}

public class Bubble_Sort {

    //This function always runs O(n^2) time even if the array is sorted.
    void bubbleSort(int array[]){

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    //swap array[j+1] and array[i]
                    int temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //Prints the array
    void printArray(int array[]){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }System.out.println();
    }

    //Driver method to test the algorithm
    public static void main (String args[]){

        Bubble_Sort ob = new Bubble_Sort();
        int array[] = {100, 10, 15, 20, 45, 70, 30};
        ob.bubbleSort(array);
        System.out.println("Sorted Array: ");
        ob.printArray(array);
    }
}
