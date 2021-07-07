package Easy;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int x = -8848342;
        int rev = 0;
//        int result = 0;
        while (x!=0){
            int temp = x%10;
            x = x/10;
            rev = rev*10 + temp;
        }
        System.out.println(rev);
    }
}
