package com.My.JavaRush.level_5_7;

public class Less004 {
                                                                                                      
/*                                                                                                     
Создать класс Circle                                                                                                    
*/                                                                                                    
                                                                                                    
//public class Circle {                                                                                                    
    //напишите тут ваш код                                                                                                    
int centerX;                                                  
int centerY;                                                  
int radius;
int width;                                                  
int color;                                                  
                                                  
public void initialize(int centerX, int centerY, int radius)                                                  
{                                                  
this.centerX = centerX; this.centerY = centerY; this.radius = radius;
}                                                  
public void initialize(int centerX, int centerY, int radius, int width)                                                  
{                                                  
this.centerX = centerX; this.centerY = centerY; this.radius = radius; this.width = width;                                                  
}                                                  
public void initialize(int centerX, int centerY, int radius, int width, int color)                                                  
{                                                  
this.centerX = centerX; this.centerY = centerY; this.radius = radius; this.width = width; this.color = color;                                                  
}                                                  
                                                                                                    
    public static void main(String[] args) {                                                                                                    
                                                                                                    
    }                                                                                                    
} 
}
/*
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
Требования:
- програма не читаэ з клавыатури;
- у класса Circle повинны бути перемінні - centerX, centerY, radius, width, color з типом int;
- в класа повиннен бути метод initialize, приймаючий в якості параметрів centerX, centerY, radius і ініціалізуючий відповідні пеермінні класу;
- в класа повиннен бути метод initialize, приймаючий в якості параметрів centerX, centerY, radius, width і ініціалізуючий відповідні пеермінні класу;
- в класа повиннен бути метод initialize, приймаючий в якості параметрів centerX, centerY, radius, width, color і ініціалізуючий відповідні пеермінні класу;

*/
