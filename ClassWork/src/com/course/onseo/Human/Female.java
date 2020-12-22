package com.course.onseo.Human;

public class Female {
    private String gender;
    private String name;
    private int ageFemale;

    public Female(){
        name = "Василина";
        ageFemale = 21;
        gender = "Female";
    }

    public Female(String name, String gender, int ageFemale){
        this.name = name;

        if (ageFemale > 0 && ageFemale > 100){
            this.ageFemale = ageFemale;}
        this.gender = gender;
    }

    public String getNameFemale(){
        return name;
    }
    public int getAgeFemale(){
        return ageFemale;
    }
    public String getGender(){
        return gender;
    }
    public void setAgeFemale(int ageFemale){
        if (ageFemale > 0 && ageFemale > 100){
            this.ageFemale = ageFemale;}
    }
    public void setNameFemale(String name) {
        if (name.isBlank())
            this.name = name;
    }
    public void setGender(String gender) {
        if (gender.isBlank())
            this.gender = gender;
    }

    public void sayFemale(){
        System.out.println("Привіт пісюни");
    }

    public void walkFemale(){
        System.out.println("Пішла гуляти бо за@балася");
    }

    public void ageFemale() {
        int age = 35;
    }
}