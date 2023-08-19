package concurentCollections;

import java.util.List;

public class Writer extends Thread {
    private List<String> list;
    private int item;

    public Writer(String name, List<String> list) {
        this.list = list;
        item = 0;
        super.setName(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            String new_item = " Element " + item++;
            list.add(new_item);
            System.out.println(super.getName() + " New element added!" + new_item);
        }
    }
}
