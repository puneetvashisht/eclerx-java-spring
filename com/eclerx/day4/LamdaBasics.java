package com.eclerx.day4;

/**
 *  Greeting
 */
@FunctionalInterface
interface  Greeting {
    void sayHello();
}

class JapaneseGreeting implements Greeting{
    @Override
    public void sayHello() {
      System.out.println("Konichiwa!!");
    }  
}

public class LamdaBasics {
    public static void greet(Greeting greeting){
        greeting.sayHello();
    }

    public static void main(String[] args) {
       greet(new JapaneseGreeting());
       greet(new Greeting(){
        @Override
        public void sayHello() {
            System.out.println("Namaste!");
        } 
       });

       // No implementation classes created here
    //    Greeting frenchGreeting = () -> System.out.println("Bonjour!");
       greet(() -> System.out.println("Bonjour!"));


       Thread t1 = new Thread(()->System.out.println("Running in thread.." + Thread.currentThread().getName()));
       t1.start();
    }
}
