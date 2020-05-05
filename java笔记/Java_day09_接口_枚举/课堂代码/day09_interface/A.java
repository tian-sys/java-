package com.chixing.day09_interface;


//接口A
public interface A {
    public void fun1();
    public void fun2();
}

//实现子类B
class B implements A{

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }
}

//接口C
interface  C{
    public void fun3();
    public  void fun4();
}

//实现子类D
class D implements A,C{

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }

    @Override
    public void fun4() {

    }
}


//接口E
interface E extends A{
    public void fun5();
}

/*
    Java的类是单继承 ， 接口是多继承的
 */
interface F extends A,C{

}



class G  {

}

class H extends G implements A,C{

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }

    @Override
    public void fun4() {

    }
}