package nowcoder.introduction;

import java.util.ArrayList;

/**
 * NC38 螺旋矩阵
 * 描述
 * 给定一个m x n大小的矩阵（m行，n列），按螺旋的顺序返回矩阵中的所有元素。
 * 示例1
 * 输入：
 * [[1,2,3],[4,5,6],[7,8,9]]
 * 返回值：
 * [1,2,3,6,9,8,7,4,5]
 */
public class NC38 {

    public static void main(String[] args) {
        int[][] m = new int[][]{{2,3}};
        System.out.println(spiralOrder(m));
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix.length == 0)
            return result;
        int top = 0, bottom = matrix.length - 1 ;
        int left = 0, right = matrix[0].length - 1;
        while(top < (matrix.length + 1)/2 && left < (matrix[0].length + 1)/2 ){
            //在上面，从左到右
            for(int i = left ; i <= right ; i++){
                result.add(matrix[top][i]);
            }
            //在右边，从上到下
            for(int i = top+1  ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            //在下面，从右到左
            for(int i = right-1 ; i >= left ; i--){
                result.add(matrix[bottom][i]);
            }
            //在左边，从下到上
            for(int i = bottom ; i >= top ; i--){
                result.add(matrix[i][left]);
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return result;
    }
}
