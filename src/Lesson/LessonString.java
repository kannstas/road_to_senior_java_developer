package Lesson;

public class LessonString {
    public static void main(String[] args) {
        String text = "Hello Anna how are you Anna 2           ";
        int  l = text.length();
        System.out.println(text.length()); // узнать длину строки

        char c = text.charAt(0);
        System.out.println(text.charAt(0)); // узнать под каким индексом какой символ
        System.out.println(text.charAt(text.length()-1));

        System.out.println(text.indexOf('A')); // наоборот узнать индекс введенного символа
        System.out.println(text.lastIndexOf('A')); // начнет поиск справа налево

        System.out.println(text.toLowerCase()); // уменьшить регистр
        String newText = text.toLowerCase();
        System.out.println(text);
        System.out.println(newText);

        System.out.println(text.toUpperCase()); // увеличить регистр

        System.out.println("Hello".equalsIgnoreCase("hello")); // игнорировать регистр



        System.out.println(text);
        System.out.println(text.strip());// удалит пробел и в начале и в конце
        System.out.println(text.stripLeading());// удалит пробел в начале
        System.out.println(text.stripTrailing()); //удалит пробел в конце
        System.out.println(text.trim());// как и strip, но strip приоритетнее использвоать

        System.out.println(text.substring(6,10));// получить подстроку из строки
        String name = text.substring(6,10);

        System.out.println(text.contains("Anna "));/*
        проверка наличия такого слова в тексте, если хотим проверить есть оно или нет, то после ставим пробел.
        если отдельную букву - то не надо
        */
        boolean b = text.contains("Hello ");
        System.out.println(b);

        System.out.println(text.startsWith("Hello")); // начинается с ...
        System.out.println(text.endsWith("Hello")); // заканчивается на ...

        System.out.println(text.replace("Anna","Sofia"));// замена
        String s = text.replace("Hello", "Привет").replace("Anna","Sofia");
        System.out.println(s);

        System.out.println("".isEmpty());
        System.out.println("   ".isBlank());






    }
}
