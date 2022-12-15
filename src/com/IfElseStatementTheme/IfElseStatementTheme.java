package com.IfElseStatementTheme;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 26;
        int growth = 182;
        boolean maleGender = true;
        char firstLetterofName = "Ruslan".charAt(0);
        if (age > 20){
            System.out.println("верно");
        } else {
            System.out.println("ложно");
        } 

        if(!maleGender) {
            System.out.println("верно");
        } else {
            System.out.println("не верно");
        } 

        if (growth < 180) {
            System.out.println("верно");
        }else {
            System.out.println("не верно");
        }

        if (firstLetterofName == 'M') {
            System.out.println(" не верно");
        }else if (firstLetterofName == 'I') {
            System.out.println(" не верно");
        }else {
            System.out.println("оба варианта не верны");
        }
        System.out.println("\n 2.Поиск max и min числа");
        int a =100;
        int b = 150;
        if (b > a) {
            System.out.println("max " + b);
            System.out.println("min " + a);
        } else if (a > b){
            System.out.println("max" + a);
            System.out.println("min " + b);
        } else{
            System.out.println("a равно b");
        }

        System.out.println("\n 3.Проверка числа");
        int k = 155;
        if (k == 0) {
            System.out.println("число является 0 ");
        }else {
            System.out.println("число не является 0");
        }
        if (k % 2 == 0) {
            System.out.println("число является четным");
        }else {
            System.out.println("число является нечетным");
        }
        if (k > 0) {
            System.out.println("число является положительным");
        }else {
            System.out.println("число является отрицательным");
        }
        System.out.println("\n 4.Поиск одинаковых цифр в числах");
        int j = 125;
        int h = 523;
        if (j / 100 == h / 100){
            System.out.println("сотки равны");
        }
        if (j / 10 == h / 10){
            System.out.println("Десятки равны");
        }
        if (j / 1 == h / 1){
            System.out.println("единицы равны");
        }else {
            System.out.println("ни единицы ни десятки ни сотни чисел не равны");
        }

        System.out.println("\n 5.Определение символа по его коду");
        char sim = '\u0057';
        System.out.println(sim);
        System.out.println("u0057" + sim + "");
        if (sim == '5'){
            System.out.println("это число 5");
        } else if (sim == '!') {
            System.out.println("это знак спецсимвол !");
        } else if (sim == 'W') {
            System.out.println("это большая буква W");
        }
        System.out.println("\n 6.Подсчет суммы вклада и начисленных банком %");
        int v = 300000;
        int sk = v * 7 / 100;
        if (v <= 100000) {
            System.out.println("тогда начисление 5%");
        }else if (v > 100000 && v <= 300000) {
            System.out.println("тогда начисление 7%");
        } else{
            System.out.println("тогда начисление 10%");
        }
        System.out.println(v);
        System.out.println(v * 7 / 100);
        System.out.println(v + sk);

        System.out.println("\n 7.Определение оценки по предметам");
        int history = 59;
        int informatik = 91;
        if (history <= 60) {
            System.out.println("2 " + "history");
        }else if (history > 60  && history <= 73) {
            System.out.println("3 " + "history");
        }else if (history > 73 && history <=91) {
            System.out.println("4 " + "history");
        } else if (history > 91) {
            System.out.println("5 " + "history");
        }
        if (informatik <= 60) {
            System.out.println("2" + "informatik");
        }else if (informatik > 60  && informatik <= 73) {
            System.out.println("3 " +" informatik");
        }else if (informatik > 73 && informatik <= 91) {
            System.out.println("4 " + "informatik");
        } else if (informatik > 91) {
            System.out.println("5 " + "informatik");
        }
        System.out.println("средний балл оценок по предметам " + (2+4)/2);
        System.out.println("средний % по предметам " + (59+91)/2);

        System.out.println("\n 8.Расчет прибыли за год");
        int rent = 5000;
        int sale = 13000;
        int costprice = 9000;
        System.out.println("годовая прибыль " + ((sale * 12) - (rent *12) - (costprice * 12)));

        System.out.println("\n 9.Подсчет количества банкнот");
        int summa = 567;
        int nom100 = 100;
        int nom10 = 10;
        int nom1 = 1;
        int count100 = 10;
        int count10 = 5;
        int count1 = 50;
        int get100 = 0;
        int get10 = 0;
        int get1 = 0;
        int getNum100;
        int getNum10;
        int getNum1;

        if (summa/nom100 <= count100){
            getNum100 = summa/nom100;
            get100 = getNum100 * nom100;
            System.out.println("\nноминалы банкнот " + nom100);
            System.out.println("требуемое их количество " + getNum100);
            System.out.println("выдаваемая сумму " + get100);
        } else {
            get100 = count100 * nom100;
            System.out.println("\nноминалы банкнот " + nom100);
            System.out.println("требуемое их количество " + count100);
            System.out.println("выдаваемая сумму " + get100);
        }
        if ((summa - get100) / nom10 <= count10 ){
            getNum10 = (summa - get100) / nom10;
            get10 = getNum10 * nom10;
            System.out.println("\nноминалы банкнот " + nom10);
            System.out.println("требуемое их количество " + getNum10);
            System.out.println("выдаваемая сумму " + get10);
        } else {
            get10 = count10 * nom10;
            System.out.println("\nноминалы банкнот " + nom10);
            System.out.println("требуемое их количество " + count10);
            System.out.println("выдаваемая сумму " + get10);
        }
        if ((summa - get100 - get10) <= count1 ){
            getNum1 = summa - get100 - get10;
            get1 = getNum1 * nom1;
            System.out.println("\nноминалы банкнот " + nom1);
            System.out.println("требуемое их количество " + getNum1);
            System.out.println("выдаваемая сумму " + get1);
        } else {
            get1 = count1 * nom1;
            System.out.println("\nноминалы банкнот " + nom1);
            System.out.println("требуемое их количество " + count1);
            System.out.println("выдаваемая сумму " + get1);
        }
        System.out.println(get100 + get10 + get1);
    }
}

