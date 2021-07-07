package Easy;

public class addBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        int sum = Integer.parseInt(a,2) + Integer.parseInt(b,2);
        System.out.println(sum);
        System.out.println(Integer.toBinaryString(sum).toString());
    }
}
