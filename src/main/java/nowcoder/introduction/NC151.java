package nowcoder.introduction;

/**
 * NC151 最大公约数
 *
 */
public class NC151 {

    public static void main(String[] args) {
        System.out.println(gcd(3,13));
    }

    public static int gcd (int a, int b) {
        // write code here
        //辗转相除法
        if(a%b==0){return b;}
        else{return gcd(b,a%b);}
    }
}
