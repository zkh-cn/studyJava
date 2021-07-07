package Thread;

public class ThreadTest extends Thread{
    private int count = 10;
    public void run(){//重新run方法
        while (true){
            System.out.println("fauefefbebfeue");
            if (--count == 0){
                break;
            }
        }
    }


    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();//启动线程
        for (int i = 0; i < 300; i++) {

            System.out.println("===================");
        }
    }
}
