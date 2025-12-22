public class Main{
    static int swapcount(int[] arr){
        int swaps = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
    public static void main(String[] args){
        int[] arr = {5, 3, 1, 4, 2};
        System.out.println(swapcount(arr));
    }
}
