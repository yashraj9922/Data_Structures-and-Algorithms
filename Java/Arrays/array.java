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
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    

    //moving all zeroes to end of an array
    public int moveZero(int[] arr){
        int zero=0;
        

        return zero;
    }
    



}


public class array{
    public static void main(String[] args) {

    }
}