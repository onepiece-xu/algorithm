package nowcoder;

/**
 * NC65 斐波那契数列
 * 描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n≤39
 *
 * 示例1
 * 输入：
 * 4
 * 复制
 * 返回值：
 * 3
 */
public class NC65 {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        //当前项的前两项的值
        int j = 0;
        //当前项的前一项的值
        int k = 1;
        //当前项的值
        int l = 0;
        for (int i = 2 ; i <= n ; i++){
            l = j + k;
            j = k;
            k = l;
        }
        return l;
    }
}
