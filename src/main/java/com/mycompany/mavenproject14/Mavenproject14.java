/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject14;


public class Mavenproject14 {

    public static void main(String[] args) throws InterruptedException {
         System.out.println("Скворцова Ксения РИБО-04-22 вариант 1");
         Object lock = new Object();
       class StepThread extends Thread {
          private final Object lock;
             public StepThread(Object object) {
                this.lock = object;
            }
       @Override
       public void run() {
         while (true) {
           synchronized (lock) {
             try {
              sleep(1000);
              System.out.println(getName());
              lock.notify();
              lock.wait();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
            }
        }
    }
       
    }
 
new StepThread(lock).start();
new StepThread(lock).start();
new StepThread(lock).start();
}
}

