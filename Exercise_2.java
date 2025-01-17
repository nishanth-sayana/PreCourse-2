class QuickSort 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */

    //Time Complexity=O(1)
    //Space Complexity=o(1)
    void swap(int arr[],int i,int j){
        //Your code here
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //Time Complexity=O(n)
    //Space Complexity=O(1)
    int partition(int arr[], int low, int high)
    {
   	//Write code here for Partition and Swap
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                //shifting elements less than pivot to the begining of the array
                i++;
                swap(arr,i,j);
            }
        }
        //shifting the pivot to a balanced position->(elements<pivot)(pivot)(elements>pivot)
        swap(arr,i+1,high);
        return i+1;
    }
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        //Time Complexity=T(k)+T(n-k)+n->Wort Case:O(n^2)|Avg case:O(nlogn)
        //Space Complexity=O(1)
        if(low<high){
            int pivot=partition(arr,low,high);
            // Recursively sort elements before
            // partition and after partition
            sort(arr,low,pivot-1);
            sort(arr,pivot+1,high);
        }

    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
