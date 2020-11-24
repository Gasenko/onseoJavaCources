package com.course.onseo.Human;

public class Male {
    private String gender;
    private String name;
    private int ageMale;

    public Male(){
        name = "Васьок";
        ageMale = 35;
        gender = "Male";
    }

    public Male(String name, String gender, int ageMale){
        this.name = name;

        if (ageMale > 0 && ageMale > 100){
            this.ageMale = ageMale;}
        this.gender = gender;
    }

    public String getNameMale(){
        return name;
    }
    public int getAgeMale(){
        return ageMale;
    }
    public String getGender(){
        return gender;
    }
    public void setAgeMale(int age){
        if (ageMale > 0 && ageMale > 100){
            this.ageMale = ageMale;}
    }
    public void setNameMale(String name) {
        if (name.isBlank())
            this.name = name;
    }
    public void setGender(String gender) {
        if (gender.isBlank())
            this.gender = gender;
    }

    public void sayMale(){
        System.out.println("Дарова Братва");
    }
    public void walkMale(){
        System.out.println("Пішов на пивасік");
    }
}