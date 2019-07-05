package com.example.laptop.listofgoodsjava;

import java.util.ArrayList;

/*
    Книги и диски. Книги бывают по программированию, кулинарии и эзотерике.
    У всех товаров есть название (строка), цена (число) и штрих-код (строка).
    У всех книг – количество страниц (число).
    У книг по программированию – язык программирования (строка).
    У книг по кулинарии – основной ингредиент (строка).
    У книг по эзотерике – минимальный возраст читателя (число).
    Диски бывают CD и DVD.
    Независимо от типа диска, его содержимым может быть: музыка, видео, ПО.
 */

public abstract class Goods {

    private String name;
    private int price;
    private String barcode;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBarcode() {
        return barcode;
    }

    public Goods(String name, int price, String barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public abstract String getSubcategory();

    public ArrayList<String> getStringInformation() {
        ArrayList<String> information = new ArrayList<String>();
        information.add(name);
        information.add(String.valueOf(price));
        information.add(barcode);
        return information;
    }
}
