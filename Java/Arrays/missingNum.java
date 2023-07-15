public class missingNum {
    static int missingNumber(int n, int[] arr){
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0; i<arr.length; i++){
            sum2 += arr[i];
        }
        return sum1 - sum2;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,5};

        int result = missingNumber(5, ar);
        System.out.println(result);
    }
}