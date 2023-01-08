package org.example.homework.PrintCurrency;

public class RubleCurrencyOutput implements CurrencyOutput{
    @Override
    public void displayAmount(long amount){
        int firstRate;
        if(amount > 11 | amount < -11){
            firstRate = 0;
        }
        else {
            firstRate = Math.toIntExact(amount);
        }
        String text = switch (firstRate){
            case 1 -> "рубль";
            case 2,3,4 -> "рубля";
            default -> "рублей";

        };

        System.out.println(amount + " " + text);

    }
}

