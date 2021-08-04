package nowcoder;

/**
 * NC141 判断回文
 * 给定一个字符串，请编写一个函数判断该字符串是否回文。如果回文请返回true，否则返回false。
 */
public class NC141 {

    public static void main(String[] args) {

    }

    public boolean judge (String str) {
        // write code here
        for (int head = 0, tail = str.length() -1; head < tail; head++,tail++){
            if (str.charAt(head) != str.charAt(tail)){
                return false;
            }
        }
        return true;
    }
}
