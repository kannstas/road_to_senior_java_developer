package Lesson;

public class LessonTernary {
    public static void main(String[] args) {
        int age = 19;
        String answer = age >= 18 ? "Вы прошли проверку" : (age==17) ? "Вернитесь через год ": "Вы не прошли проверку";

        System.out.println(answer);

        String s = "open";
        int s2 = 0;
        int s1 = s.equals("open") ? s2 = 1 : (s.equals("close")) ? s2 = -1 : 0;

        System.out.println(s2);
        System.out.println(s1);




    }
}


