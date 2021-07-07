package Easy;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 12;
        StringBuffer sbf = new StringBuffer();
        sbf.append(x);


        System.out.println(sbf.reverse());

        StringBuffer sbf2 = sbf.reverse();

        String str = sbf.toString();
        String str2 = sbf2.toString();

        if(str.equals(str2) ){
            System.out.println("true");
        }


    }
}
