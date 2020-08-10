public class Test2 {

    private static int i = 0;
    public static void main(String[] args) {
        // 假设这个代码是多线程的

        //锁的粒度大
        synchronized (Test.class) {
            for (int c = 0; c < 10000; c++) {
                i++;
            }
        }

        //锁的粒度小
        for (int c = 0; c < 10000; c++) {
            synchronized (Test.class) {
                i++;
            }
        }
    }

}
