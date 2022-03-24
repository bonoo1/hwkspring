package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int cnt = 0;
        for (int i = 0; i < fruits.size(); i++) {
            String f = fruits.get(i);
            if (f == fruit) {
                cnt++;

            }
        }
        return cnt;
    }

        public static void main(String[] args){
//            Course course = new Course();
//            String title = "웹 개발의 봄, Spring";
//            String tutor = "남병관";
//            int days = 25;
//            course.setTitle(title);
//            course.setTutor(tutor);
//            course.setDays(days);
//            System.out.println(course.getTitle());
//            System.out.println(course.getTutor());
//

            Tutor tutors =  new Tutor();
            Tutor tutors2 =  new Tutor();

    }
}
