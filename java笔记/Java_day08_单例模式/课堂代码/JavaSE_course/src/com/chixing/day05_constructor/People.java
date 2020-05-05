package com.chixing.day05_constructor;

/**
 * 设计People类

 *   提供方法:要求判断两个person对象是否满足结婚条件
 *      a. 两人均未婚
 *      b. 必须是异性
 *      c. 男性年龄>=24，女性年龄>=22
 *      满足以上三个条件就可以结婚。
 *
 * 创建PeopleTest测试类，创建对象进行测试。
 */
public class People {
    private String peopleName;
    private char peopleGender;
    private int peopleAge;
    private boolean isMarried;


    //构造函数
    public People(){}
    public People(String peopleName, char peopleGender, int peopleAge, boolean isMarried) {
        this.peopleName = peopleName;
        this.peopleGender = peopleGender;
        this.peopleAge = peopleAge;
        this.isMarried = isMarried;
    }


    //get,set

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public char getPeopleGender() {
        return peopleGender;
    }

    public void setPeopleGender(char peopleGender) {
        this.peopleGender = peopleGender;
    }

    public int getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(int peopleAge) {
        this.peopleAge = peopleAge;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    /**
     * 判断两个person对象是否满足结婚条件
     * @param anotherPeople 另一个人
     * @return  返回否可以结婚
     */
    public boolean canMarry(People anotherPeople){
        if(anotherPeople == null)
            return false;
        if(anotherPeople == this)
            return false;

        if(anotherPeople.peopleGender == this.peopleGender)
            return  false;

        if(this.isMarried  || anotherPeople.isMarried  )
            return false;

        if( (this.peopleGender =='M' && this.peopleAge >=22 && anotherPeople.peopleAge >=20)
                ||  (this.peopleGender =='F' && this.peopleAge >=20 && anotherPeople.peopleAge >=22))
            return true;

        return  false;
    }


}
