package Hilos;

import java.util.ArrayList;
import java.util.List;

public class ThreadRunnable implements Runnable {
    private List<Integer> lista;
    public ThreadRunnable(){

    }
    public void run(){
        lista=new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add((int) (Math.random() * 13) + 3);
        }
    }
    public List<Integer> getLista(){
        return lista;
    }

}
