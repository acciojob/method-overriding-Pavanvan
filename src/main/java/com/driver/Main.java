package com.driver;

public class Main {
       public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

  public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }



        public static void main(String[] args) {
         A obj1=new A();
         System.out.println(obj1.meth());
            B obj=new B();
            System.out.println(obj.meth());
        }
    }


