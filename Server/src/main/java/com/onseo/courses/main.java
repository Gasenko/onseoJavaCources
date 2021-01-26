package com.onseo.courses;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class main {
    public static void main(String[] args) throws IOException {

        Human human = new Human("Vasja", 23, "Male");
        //FileWriter fileWriter = new FileWriter("human.txt", false);
        //fileWriter.write("Name: " + human.getName() + "\n");
        //fileWriter.write("Age:  " + human.getAge().toString() + "\n");
        //fileWriter.write("Sex:  " + human.getSex() + "\n");
        //fileWriter.write(human.toString());
        //fileWriter.close();

        ObjectMapper objectMapper = new ObjectMapper();
        //StringWriter stringWriter = new StringWriter();

        //objectMapper.writeValue(stringWriter, human);
        //FileWriter fileWriter = new FileWriter("human.json", false);

        //fileWriter.write(stringWriter.toString());
        //fileWriter.close();

        Human human1 = objectMapper.readValue(new File("human.json"), Human.class);
        System.out.println(human1.toString());

    }
}
