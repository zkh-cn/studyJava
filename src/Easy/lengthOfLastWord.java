package Easy;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "        ";

        String[] str = s.split("");

        if(str[0].equals(" ")){
            System.out.println("1");
        }


        for(String ss:str){
            System.out.println("="+ss+"=");
        }
//        System.out.println(str[str.length-1].length());
    }
}
