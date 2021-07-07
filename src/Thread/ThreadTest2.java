package Thread;

public class ThreadTest2  implements Runnable{
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
        ThreadTest2 threadTest2 = new ThreadTest2();
        new Thread(threadTest2).start();//创建线程对象，代理

        for (int i = 0; i < 300; i++) {

            System.out.println("===================");
        }
    }
}
