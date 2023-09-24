package ru.romanovvb.CountCharacters;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReadInput {
    CounterChar counterChar;

    public ReadInput (){
        counterChar = CounterChar.getInstance();
        start();
    }

    private void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку(длина строки не должна превышать 100 символов): ");
            String input = scan.nextLine();
            counterChar.counter(input);
        }
    }
}
