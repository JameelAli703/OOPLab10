package Lab10;

public class TThread2 extends Thread{
    public void run() {
        System.out.println("FROM THREAD 2");
        Table.printTable(10);
    }
}
