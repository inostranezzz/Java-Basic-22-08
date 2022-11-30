package org.example.homework.Throwable;

public class BackLog implements AutoCloseable {


    @Override
    public void close(){
        System.out.println("Инстанс класса закрыт");
    }


}
