package com.chixing.day14_file;

/*

    JavaBean : 无参构造函数 + get,set

 */
public class Customer {

    private int custId;
    private String custEmail;
    private long custTelno;

    public Customer(){}
    public Customer(int custId, String custEmail, long custTelno) {
        this.custId = custId;
        this.custEmail = custEmail;
        this.custTelno = custTelno;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public long getCustTelno() {
        return custTelno;
    }

    public void setCustTelno(long custTelno) {
        this.custTelno = custTelno;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return custId == customer.custId;
    }

    @Override
    public int hashCode() {
        return custId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custEmail='" + custEmail + '\'' +
                ", custTelno=" + custTelno +
                '}';
    }
}
