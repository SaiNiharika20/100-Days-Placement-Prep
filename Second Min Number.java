import java.util.Arrays;
public class Main{
    static int SecondMin(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }
    public static void main(String[] args){
        int[] arr = {10, 3, 7, 1, 5};
        System.out.println(SecondMin(arr));
    }
}
