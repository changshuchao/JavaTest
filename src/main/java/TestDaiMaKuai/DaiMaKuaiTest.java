package TestDaiMaKuai;

public class DaiMaKuaiTest {

    private int count = 0;

    {
        System.out.println("3构造代码块");
    }

    static {
        System.out.println("1静态代码块");
    }

    public DaiMaKuaiTest(){
        System.out.println("4构造函数");
    }

    public static void main(String[] args) {
        System.out.println("2普通代码块");

        /*在new一个对象的时候总是先执行构造代码，再执行构造函数，但是有一点需要注意构造代码不是在构造函数之前运行的，它是依托构造函数执行的。*/
        DaiMaKuaiTest test = new DaiMaKuaiTest();
        test.plusCount();
    }

    private void plusCount(){
        synchronized(this){
            count++;
        }
    }



}
