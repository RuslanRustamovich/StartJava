package com.VariablesTheme;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод значений переменных на консоль");
        byte b = 15;
        short s = 512;
        int i = 16384;
        long ln = 128849014;
        float f = 2.80f;
        double d = 22000.1098;
        char c ='D';
        boolean boo = true;

        System.out.println("Диагональ: " + b + " дюймов");
        System.out.println("размер ssd: "+ s);
        System.out.println("память в мегабайтах " + i );
        System.out.println("емкость диска D " + ln );
        System.out.println("GHz " + f );
        System.out.println("Сборка ОС " + d );
        System.out.println("название диска  " + c );
        System.out.println("boolean " + boo );

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int percentage = 11;
        int discount;
        int summ;

        discount = (pen + book) * percentage /100;
        System.out.println("сумма скидки "+ discount);
        summ = pen + book - discount;
        System.out.println("сумма товаров со скидикой " +summ);

        System.out.println("\n 3.Вывод слова Java");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n 4.Вывод min и max значений целых числовых типов");        
        byte by = 127;
        short sh = 32767;
        int in = 2147483647;
        long lo = (long) Math.pow (2,63)-1;//(2^63)-1;
        float fl = 3.4e38f;
        double dou = 1.7e308;
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);
        System.out.println("");
        by++;
        sh++;
        in++;
        lo++;
        fl++;
        dou++;
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);
        System.out.println("");
        by--;
        sh--;
        in--;
        lo--;
        fl--;
        dou--;
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);

        System.out.println("\n 5.Перестановка значений переменных");
        int j = 2;
        int k = 5;
        int m;
        System.out.println("с помощью третьей перемнной\n\n");
        System.out.println("значение переменной j " + j);
        System.out.println("значение переменной k " + k);
        m = j;
        j = k;
        k = m;
        System.out.println("новое значение переменной j " + j);
        System.out.println("новое значение переменной k "+ k);
        System.out.println("");

        System.out.println("с помощью арифметических операций ");
        System.out.println("значение переменной j " + j);
        System.out.println("значение переменной k " + k);
        j = j - k;
        k = k + j;
        j = k - j;

        System.out.println("");
        System.out.println("новое значение переменной j " + j);
        System.out.println("новое значение переменной k "+ k);
        System.out.println("");

        System.out.println("с помощью побитовой операции");
        System.out.println("значение переменной j " + j);
        System.out.println("значение переменной k " + k);
        j = j^k^(k = j);
        System.out.println("новое значение переменной j " + j);
        System.out.println("новое значение переменной k "+ k);

        System.out.println("\n 6.Вывод символов и их кодов");

        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println((int) ch35 + " " + ch35);
        System.out.println((int) ch38 + " " + ch38);
        System.out.println((int) ch64 + " " + ch64);
        System.out.println((int) ch94 + " " + ch94);
        System.out.println((int) ch95 + " " + ch95);

        System.out.println("\n 7.Вывод количества сотен десятков и единиц");
        System.out.println("Число 123 содержит :");
        int r = 123;
        System.out.println("сотен " + r / 100);
        System.out.println("десятков " + r / 10);
        System.out.println("единиц " + r / 1);

        System.out.println("\nостаток от сотен " + r % 100);
        System.out.println("остаток от десятков " + r % 10);
        System.out.println("остаток от единиц " + r % 1);
        System.out.println("");

        int su = 0, pr = 1;
        for (int l = 0; l < 3; l++) {
        pr = pr * r % 10;
        su += r % 10;
        r /= 10;
    }
        System.out.println("Сумма: " + su);
        System.out.println("Произведение: " + pr);

        System.out.println("\n8.Вывод в консоль арт Дюка");
        char c47 = '/';
        char c92 = '\\';
        char c95 = '_';
        char c28 = '(';
        char c29 = ')';
        System.out.println("    " + c47 + c92);
        System.out.println("   " + c47 +"  "+ c92);
        System.out.println("  " + c47 + c95 +c28 + " " + c29 + c92);
        System.out.println(" " + c47 + "      " + c92);
        System.out.println("" + c47 + c95 + c95 + c95 + c95 + c47 + c92 + c95 + c95 + c92);

        System.out.println("\n9.Вывод времени");
        int v = 86399;
        int secInHour = 3600;
        int minut = 60;
        int ost = v % secInHour;
        int min = ost / minut;
        int sec = ost % minut;
        int hour = v / secInHour;
        System.out.println(hour + ":" + min + ":" + sec);
    }

}
