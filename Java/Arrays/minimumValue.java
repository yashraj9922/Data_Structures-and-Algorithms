public class minimumValue {
    static int findMinimum(int[] arr){
        if(arr == null || arr.length == 0){
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

    public static void main(String[] args) {
        int ar[] = {1,2,4,5,6,3,5,0,6,34,6,23,56};

        int result = findMinimum(ar);
        System.out.print("minimum value: " + result);
    }
}
