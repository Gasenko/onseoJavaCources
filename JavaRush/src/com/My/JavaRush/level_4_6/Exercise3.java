package com.My.JavaRush.level_4_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Exercise3 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int day = Integer.parseInt(reader.readLine());

            if (day==1) {
                System.out.println(day + " Monday");
            } else if (day==2){
                System.out.println(day + " Tuesday");
            } else if (day==3){
                System.out.println(day + " Wednesday");
            } else if(day==4){
                System.out.println(day + " Thursday");
            }else if(day==5){
                System.out.println(day + " Friday");
            }else if(day==6){
                System.out.println(day + " Saturday");
            }else if(day==7){
                System.out.println(day + " Sunday");
            }else {
                System.out.println(day + " No Day");
            }

        }
}

