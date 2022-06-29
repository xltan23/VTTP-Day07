package vttp.d7;

public class ThrMain implements Runnable {
    
    private final String msg;
    private final int sec;

    public ThrMain(String msg, int sec) {
        this.msg = msg;
        this.sec = sec;
    }

    @Override
    public void run() {
        System.out.printf(">>> Start %s, %d\n", msg, sec);
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException ex) {
        }
        System.out.printf("<<< End %s, %d\n", msg, sec);
    }
    
}
