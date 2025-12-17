public class Main{
    static int Secondlargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 5, 40};
        int result = Secondlargest(arr);
        System.out.println(result);
    }
}
