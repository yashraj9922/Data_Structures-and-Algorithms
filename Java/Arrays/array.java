package Arrays;

class mainArray{

    //Print an Array
    public void printArray(int arr[]){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //remove even integers from an array
    public int[] removeEvenInteger(int arr[]){
        int oddCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
            else{
                break;
            }
        }
        int idx = 0;
        int oddArr[] = new int[oddCount];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2!=0){
                oddArr[idx] = arr[i];
                idx++;
            }
        }
        return oddArr;
    }


    //reverse an array
    public int[] reverseArray(int arr[]){
        int ind=0;
        int[] rev = new int[arr.length];
        for(int i = (arr.length-1); i>=0; i--){
            rev[ind] = arr[i];
            ind++;
        }
        return rev;
    }


    //find minimum value in an array
    public int findMinimum(int[] arr){
        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("invalid input");
        }
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }


    //find 2nd maximum element in an array (Time Complexity = n^2)
    public int findsecondMax(int[] arr){
        int max;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        max = arr[arr.length-2];
        return max;
    }
//more efficient way (Time Complexity = n)
    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;/*before changing maximum value we need to update secondMax  to max
                as if max is been assigned newer value then old value of max will be second maximum value*/
                max = arr[i];//after updating secondmax now update max
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];     
            }
        }
        return secondMax;
    }
    

    //moving all zeroes to end of an array
    public void moveZero(int[] arr){
        int j=0;//j will be focusing on element = 0
        for(int i = 0; i<arr.length; i++)//i will be focusing on non-zero elements
        {
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[j]!=0){
                j++;
            }
        }
    }



    //resize an array
    public int[]/*make sure the return data type should be an array */ resizeArray(int[] arr, int capacity){
        int temp[] = new int[capacity];
        for(int i = 0; i<capacity; i++){
            temp[i]=arr[i];
        }
        // arr = temp;
        // return arr;
        return temp;
    }//java is pass by value
    


    //given an array of n-1 distint numbers in the range of 1 to n. Find teh missing number in it.
    public int missingNum(){
        int miss = 0;
        return miss;
    }





}
public class array{
    public static void main(String[] args) {
        int ar[] = {1,3,2};
        mainArray obj = new mainArray();
        // obj.printArray(ar);
        // obj.findSecondMax(ar);
        
    }
}