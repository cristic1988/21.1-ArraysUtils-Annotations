package app;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        MethodInfo methodInfo = ArrayUtils.class.getDeclaredMethod("processData")
                .getAnnotation(MethodInfo.class);
        Author author = ArrayUtils.class.getDeclaredMethod("processData")
                .getAnnotation(Author.class);
        for (String string : Arrays.asList("Назва методу: " + methodInfo.name(),
                "Тип методу: " + methodInfo.type(),
                "Опис методу: " + methodInfo.description(),
                "Ім'я автора методу: " + author.firstName(),
                "Прізвище автора методу: " + author.lastName())) {
            System.out.println(string);
        }

    }
}
