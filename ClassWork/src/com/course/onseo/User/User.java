package com.course.onseo.User;

public class User implements Comparable{
    private String  name;
    private Integer age;
    private Boolean isAdminRule;

    public User(String name, Integer age, Boolean isAdminRule) {
        this.name = name;
        this.age = age;
        this.isAdminRule = isAdminRule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAdminRule() {
        return isAdminRule;
    }

    public void setAdminRule(Boolean adminRule) {
        isAdminRule = adminRule;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAdminRule=" + isAdminRule +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof User)){
            throw new ClassCastException();
        }
        User obj = (User)o;
        //return this.age-obj.age;
        int div = this.age-obj.age;
        if(div!=0)
            return div;
        return this.isAdminRule? div-1 : div+1;
    }
}
