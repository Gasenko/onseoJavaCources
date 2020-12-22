package com.course.onseo.Less1712HW;

import com.course.onseo.User.User;

public class People implements Comparable{
    private String name;
    private int weight;

    public People(String name, int weight, boolean b) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof People)){
            throw new ClassCastException();
        }
        People obj = (People)o;
        //return this.age-obj.age;
        int div = this.weight-obj.weight;
        if(div!=0)
            return div;
        //return this.isAdminRule? div-1 : div+1;
        return div;
    }
}
