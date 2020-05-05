package com.chixing.day12_boxing_generic_list;

public class GenericTest {
    public static void main(String[] args) {
        Location location =  new Location();


        MyContainer<String> c1 = new MyContainer<>();
        location.test1(c1);  // ? 任意的类型 MyContainer<?>



        MyContainer<SavingAccount> c2 = new MyContainer<>();
        location.test2(c2);// ? 任意的类型 MyContainer<? extends Account>


        MyContainer<CreditAccount> c3 = new MyContainer<>();
        location.test2(c3);// ? 任意的类型 MyContainer<? extends Account>

        MyContainer<Account> c4 = new MyContainer<>();
        location.test2(c4);// ? 任意的类型 MyContainer<? extends Account>


        MyContainer<Account> c5 = new MyContainer<>();
        location.test3(c5);// ? 任意的类型 MyContainer<? super SavingAccount>


        MyContainer<SavingAccount> c6 = new MyContainer<>();
        location.test3(c6);// ? 任意的类型 MyContainer<? super SavingAccount>



    }
}
