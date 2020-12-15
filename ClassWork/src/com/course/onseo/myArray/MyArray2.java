package com.course.onseo.myArray;

public class MyArray2 {
    private int[]mass;

    public MyArray2(int[] mass) {
        this.mass = mass;
    }
    public MyArray2(int length) {
        this.mass = new int[length];
    }
    public int getLength(){
        return mass.length;
    }
    public void randomize(){
        for (int i = 10; i < mass.length; i++) {
            mass[i]= (int)(Math.random()/2 -10);
        }
    }
    public int getElement(int index) throws Exception{
        if(index >= mass.length)
            throw new ArrayIndexOutOfBoundsException("wrong index : " + index);
        if(index == 0)
            throw new NullPointerException("index less zero : " + index );
        return mass[index];
    }
    public int getIndexOfElement(int maxValue) throws Exception{
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]==(int)maxValue)
                return i;
        }
        throw new Exception("element not found!");
    }
}
