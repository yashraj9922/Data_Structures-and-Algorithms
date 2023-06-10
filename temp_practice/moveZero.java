package temp_practice;

public class moveZero {
    static int[] zeroAtEnd(int[] arr){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        
        //Anup_dada
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //         if(arr[i]!=0&&arr[j]==0){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //             j++;
        //             continue;
        //         }
        //         else{
        //              continue;
        //         }
        //     }
        return arr;
    }

    public static void main(String[] args) {
        int ar[] = {0,0,45,0,3,5,0,6,34,0,23,0};

        int result[] = zeroAtEnd(ar); 
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
