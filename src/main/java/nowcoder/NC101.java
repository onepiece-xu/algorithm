package nowcoder;

/**
 * NC101 缺失数字
 * 描述
 * 从 0,1,2,...,n 这 n+1 个数中选择 n 个数，选择出的数字依然保持有序，
 * 找出这 n 个数中缺失的那个数，要求 O(n) 或 O(log(n)) 并尽可能小。
 *
 * 示例1
 * [0,1,2,3,4,5,7]
 * 6
 *
 */
public class NC101 {

    public static void main(String[] args) {
        int[] a = {0,2,3};
        System.out.println(solve(a));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 找缺失数字
     * @param a int整型一维数组 给定的数字串
     * @return int整型
     */
    public static int solve (int[] a) {
        // write code here
        int starIndex = 0;
        int endIndex = a.length;
        do{
            int midIndex = (endIndex+starIndex) >> 1;
            if (midIndex < a[midIndex]){
                endIndex = midIndex;
            }else if (midIndex == a[midIndex]){
                starIndex = midIndex+1;
            }
        }while(starIndex < endIndex);

        return ++starIndex;
    }
}
