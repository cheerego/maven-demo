package org.hahaha;


import com.google.gson.Gson;

public class Student {

    public int age = 20;
    public String name = "asdfaf";

//    public int getAge() {
//        return age;
//    }


    public String getName() {

        return name;
    }


    public static String toJson(Student stu){
        Gson gson = new Gson();
        return gson.toJson(stu);
    }

}