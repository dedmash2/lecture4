import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 55, -3, 15, 0, -555};
        System.out.println(Arrays.toString(sort(arr)));
    }
    private static int[] sort(int[] result){
        int mid = result.length / 2;

        if (result.length <= 1) return result;

        int[] left = Arrays.copyOfRange(result, 0, mid);
        int [] right = Arrays.copyOfRange(result, left.length, result.length);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right){
        int length = left.length + right.length;
        int[] result = new int[length];
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;
        
        while (leftIndex < left.length && rightIndex < right.length){
            if (left[leftIndex] > right[rightIndex]) {
                result[resultIndex++] = right[rightIndex++];
            } else {
                result[resultIndex++] = left[leftIndex++];
            }
        }

        while (resultIndex < length){
            if (leftIndex != left.length){
                result[resultIndex++] = left[leftIndex++];
            }
            if (rightIndex != right.length){
                result[resultIndex++] = right[rightIndex++];
            }
        }
        return result;
    }
}