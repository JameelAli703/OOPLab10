package Lab10;

public class TThread1 implements Runnable{
    @Override
    public void run() {

        System.out.println("FROM THREAD 1");
        Table.printTable(5);
    }

}
