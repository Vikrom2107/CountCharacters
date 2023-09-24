package ru.romanovvb.CountCharacters;

import java.util.HashMap;
import java.util.Map;

public class CounterChar {
    private static CounterChar counterChar;
    HashMap<Character, Integer> amountChar;

    private CounterChar() {
    }
    public static CounterChar getInstance() {
        if (counterChar == null) {
            counterChar = new CounterChar();
        }
        return counterChar;
    }
    public void counter(String input) {
        if (input.length() == 0) {
            System.out.println("Вы не ввели ни одного символа, пожалуйста введите строку");
            return;
        }
        if (input.length() > 100) {
            System.out.println("Вы ввели слишком длинную строку, пожалуйста введите не более 100 символов");
            return;
        }

        amountChar = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!amountChar.containsKey(c)) {
                amountChar.put(c, 1);
            } else {
                amountChar.put(c, amountChar.get(c) + 1);
            }
        }

        System.out.println("Частота совпадения символов: ");
        amountChar.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(map -> {
                    System.out.print("\"" + map.getKey() + "\": " + map.getValue() + "\t");
                });
        System.out.println();
    }

    public HashMap<Character, Integer> getAmountChar() {
        return amountChar;
    }
}
