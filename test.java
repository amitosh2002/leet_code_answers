import java.util.ArrayList;

public class test {
    public static void matrix(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != k) {
                ans.add(arr[i]);

            }

        }
        System.out.print(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 3 };
        matrix(arr, 3);
    }

}
