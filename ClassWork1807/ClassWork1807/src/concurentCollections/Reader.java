package concurentCollections;

import java.util.Iterator;
import java.util.List;

public class Reader extends Thread {
    private List<String> list;

    public Reader(String name, List<String> list){
        this.list = list;
        super.setName(name);
    }

    @Override
    public void run() {
        while (true){
            String info = super.getName() + ":";
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                String el = iterator.next();
                info += " " + el;
            }
            try{
                Thread.sleep(10);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(info);
        }

    }
}
