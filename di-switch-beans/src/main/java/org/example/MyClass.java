package org.example;
class MyParent{
    int num = 1000;
    public MyParent(){
        doSomething();
    }
    public void doSomething(){
        System.out.println(num);
    }
}
public class MyClass extends MyParent{
    int num = 10;
    public MyClass(){
        super();
    }
    public void doSomething(){
        System.out.println(num);
    }
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.doSomething();
    }
}
