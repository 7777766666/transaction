package com.example.transaction.thred;

public class MainThreadExample {

    public static void main(String[] args) {
        Thread otherThread = new Thread(new OtherThread());
        otherThread.start(); // Запускаем другой поток

        try {
            otherThread.join(); // Главный поток ожидает завершения другого потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Код, который будет выполнен после завершения другого потока
        System.out.println("Другой поток завершился. Главный поток продолжает работу.");
    }
}

class OtherThread implements Runnable {
    @Override
    public void run() {
        // Код работы другого потока
        System.out.println("Другой поток начал работу.");
        try {
            Thread.sleep(3000); // Имитация работы потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Другой поток завершил работу.");
    }
}
