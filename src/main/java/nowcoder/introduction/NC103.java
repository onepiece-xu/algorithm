package nowcoder.introduction;

/**
 * NC103 反转字符串
 *
 * 描述
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * 输入：
 * "abcd"
 * 返回值：
 * "dcba"
 */
public class NC103 {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefghijklmn"));
    }

    public static String reverseStr(String str){
        //StringBuffer的reverse的方法就是如此
        char[] value = str.toCharArray();
        int n = value.length - 1;
        for (int j = (n-1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = value[j];
            char ck = value[k];
            value[j] = ck;
            value[k] = cj;
        }
        return new String(value);
    }

}
