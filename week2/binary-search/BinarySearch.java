import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int index = Arrays.binarySearch(nums, target);
        if(index >= 0) {
            System.out.println(index);
        } else  {
            System.out.println(-1);
        }

    }
}