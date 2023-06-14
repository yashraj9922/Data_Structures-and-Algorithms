public class removeEvenIntegers {
    static int[] removeEvenInteger(int arr[]){
        int oddCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }

        int idx = 0;
        int oddArr[] = new int[oddCount];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                oddArr[idx] = arr[i];
                idx++;
            }
        }
        return oddArr;
    }

    public static void main(String[] args) {
        int ar[] = {1,2,4,5,6,3,5,0,6,34,6,23,56};

        int result[] = removeEvenInteger(ar);
        System.out.print("Odd integers: ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}

