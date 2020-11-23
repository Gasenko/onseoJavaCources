package com.course.onseo;
import java.util.Arrays;
//Topic today - class string;
public class Lessons17112020 {
    public static void main(String[] args) {
        char[] a = {'1', '2', '3'};
        String text = "The sovereign is a legal-tender gold coin of the United Kingdom with a nominal value of one pound sterling Struck from 1817 until the present time it was originally a circulating coin accepted in Britain and elsewhere in the world it is now a bullion coin and is sometimes mounted in jewellery";
        String newText = firstAndLastToUpperCase(text);
        System.out.println(newText);
    }

    static String firstAndLastToUpperCase(String text) {
        String[] strings = text.split(" ");
        String buf;
        String first;
        String last;
        String newText = "";

        for (int i = 0; i < strings.length; i++) {
            buf = strings[i];
            if (buf.length() > 1) {
                first = buf.substring(0, 1);
                last = buf.substring(buf.length() - 1);
                buf = buf.substring(1, buf.length() - 1);
                first = first.toUpperCase();
                last = last.toUpperCase();
                first += buf + last + " ";
                newText += first;
            } else
                newText += buf + " ";
        }
        return newText;
    }
}

/*
Якщо довжина слова парна то ВЕЛИКИМИ буквами мають бути середні;
Якщо довжина слова не парна то ВЕЛИКИМИ буквами повинні бути через одну;
 */