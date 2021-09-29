public class Main {
    public static void main(String[] args) throws InterruptedException {
        //new MyThread().start();
        ThreadGroup mainGroup =new ThreadGroup("main group");
        final Thread thread0 =new Thread(mainGroup, new MyThread());
        final Thread thread1 =new Thread(mainGroup, new MyThread());
        final Thread thread2 =new Thread(mainGroup, new MyThread());
        final Thread thread3 =new Thread(mainGroup, new MyThread());
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(15000);
        mainGroup.interrupt();
    }
}
