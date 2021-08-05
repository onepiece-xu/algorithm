package nowcoder;

/**
 * NC107 寻找峰值
 * 描述
 * 山峰元素是指其值大于或等于左右相邻值的元素。给定一个输入数组nums，任意两个相邻元素值不相等，数组可能包含多个山峰。
 * 找到索引最大的那个山峰元素并返回其索引。
 *
 * 输入：
 * [2,4,1,2,7,8,4]
 * 返回值：
 * 5
 */
public class NC107 {

    public static void main(String[] args) {
        int[] a = {0,72,42,92,40,28,4,65,25,61,6,9,29,53,8,23,96,53,46,62,54,10,13,32,64,8,59,84,52,73,81,8,89,67,30,29,35,79,38,58,63,4,61,32,63,73,20,38,91,19,3,79,39,81,92,32,66,7,73,35,19,65,51,82,38,42,98,84,59,57,64,49,62,97,90,30,29,78,94,50,54,53,40,44,9,67,87,39,41,52,29,94,35,80,22,29,69,58,70,57,51,1,69,85,10,65,15,91,12,29,38,90,31,2,1,2,26,6,84,11,38,33,55,28,43,88,7,29,86,54,59,23,9,74,54,91,25,19,46,15,63,47,17,12,43,62,86,74,47,98,89,34,83,97,72,12,26,27,12,89,0,31,89,73,48,37,94,85,25,6,20,53,40,72,3,88,83,90,96,5,18,98,54,32,8,2,53,12,31,70,50,23,82,46,64,10,88,40,41,82,84,92,47,72,79,65,53,27,0,54,95,66,58,83,7,0,96,73,69,85,76,81,89,59,50,23,42,80,2,84,43,69,93,98,47,54,62,24,3,71,96,45,85,6,87,92,68,21,17,55,0,18,48,73,6,11,92,26,16,25,17,3,37,29,18,59,2,27,88,19,16,18,86,55,96,15,41,82,33,25,49,18,31,34,39,83,99,68,28,82,15,88,83,89,77,68,1,24,66,79,71,62,72,95,30,29,21,23,39,70,17,46,7,12,54,87,67,74,89,64,39,16,63,51,94,56,46,32,90,47,36,59,68,26,92,35,63,16,90,53,14,18,85,57,84,78,43,78,17,70,56,60,8,19,71,1,43,37,3,56,90,14,44,1,37,97,82,80,61,44,70,5,84,32,3,20,16,78,66,81,15,12,98,57,97,36,42,21,93,97,40,27,43,80,73,64,20,46,3,2,23,26,87,51,38,97,12,72,77,57,10,11,22,50,16,38,45,77,16,7,85,77,76,81,33,47,3,9,50,28,71,58,81,83,81,69,47,27,39,28,95,22,37,1,50,52,20,26,87,62,23,7,57,61,74,24,16,54,77,97,81,8,75,60,36,97,74,95,5,49,15,17,91,50,70,17,11,38,64,71,5,79,78,88,0,69,75,68,70,3,95,8,50,5,25,78,19,88,73,98,92,6,34,32,47,25,92,91,85,46,6,69,1,79,86,25,28,73,67,11,79,97,32,88,53,67,20,63,78,14,93,89,61,85,28,19,96,91,79,76,13,11,89,93,85,84,19,87,41,76,20,32,17,81,22,56,72,49,0,81,98,6,45,52,75,67,74,43,38,58,40,19,83,51,56,38,36,0,37,73,3,77,57,56,14,22,33,28,49,10,82,60,83,17,61,33,45,93,85,1,10,85,64,53,57,59,5,80,45,39,75,89,44,37,21,69,33,11,99,93,27,53,9,66,5,62,35,58,50,64,80,60,35,48,86,63,41,69,25,23,94,98,54,15,19,80,15,56,50,4,5,19,11,59,13,55,95,33,64,61,58,40,10,79,86,5,56,86,33,6,83,30,47,2,30,14,98,74,42,79,55,97,13,19,75,26,10,1,6,26,74};
        System.out.println(solve(a));
    }

    /**
     * 寻找最后的山峰
     * @param a int整型一维数组
     * @return int整型
     */
    public static int solve (int[] a) {
        // write code here
        int index = a.length - 1;
        if (a[index] > a[index-1]){
            return index;
        }
        index--;
        while (index > 0){
            if (a[index] > a[index-1]){
                if (a[index] > a[index+1]){
                    return index;
                }
                index -= 2;
                continue;
            }
            index--;
        }
        return index > 0 ? index : 0;
    }
}
