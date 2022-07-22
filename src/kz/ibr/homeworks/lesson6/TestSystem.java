package kz.ibr.homeworks.lesson6;

import java.util.Scanner;

/**
 * ДЗ "Система тестирования".
 */
public class TestSystem {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions = {
                "Вопрос 1: правильный ответ 1",
                "Вопрос 2: правильный ответ 2",
                "Вопрос 3: правильный ответ 3",
        };

        String[][] answerOptions = {
                {"Вариант ответа 1 для вопроса 1","Вариант ответа 2 для вопроса 1","Вариант ответа 3 для вопроса 1"},
                {"Вариант ответа 1 для вопроса 2","Вариант ответа 2 для вопроса 2","Вариант ответа 3 для вопроса 2"},
                {"Вариант ответа 1 для вопроса 3","Вариант ответа 2 для вопроса 3","Вариант ответа 3 для вопроса 3"},
        };

        int[] correctAnswers = {1, 2, 3};

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++) {
            // Вывод вопроса на экран
            System.out.println(questions[i]);

            // Вывод вариантов ответов на экран
            for(int j = 0; j < answerOptions[i].length; j++){
                System.out.println(answerOptions[i][j] + ";");
            }
            System.out.print("Ваш ответ: ");
            // Считываем с консоли ответ пользователя
            // Проверяем ответ увеличиваем счетчики и выводим результат
            if (correctAnswers[i] == scanner.nextInt()) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}