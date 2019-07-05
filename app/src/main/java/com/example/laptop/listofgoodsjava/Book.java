package com.example.laptop.listofgoodsjava;

import java.util.ArrayList;

public abstract class Book extends Goods {

    private int amountPages;

    public Book(String name, int price, String barcode, int amountPages) {
        super(name, price, barcode);
        this.amountPages = amountPages;
    }

    @Override
    public ArrayList<String> getStringInformation() {
        ArrayList<String> information = super.getStringInformation();
        information.add(String.valueOf(amountPages));
        return information;
    }
}

class ProgrammingBook extends Book {
    private String programmingLanguage;

    ProgrammingBook(String name, int price, String barcode, int amountPages, String programmingLanguage) {
        super(name, price, barcode, amountPages);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getSubcategory() {
        return "Programming";
    }

    @Override
    public ArrayList<String> getStringInformation() {
        ArrayList<String> information = super.getStringInformation();
        information.add(programmingLanguage);
        return information;
    }
}

class CookingBook extends Book {
    private String mainIngredient;

    public CookingBook(String name, int price, String barcode, int amountPages, String mainIngredient) {
        super(name, price, barcode, amountPages);
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String getSubcategory() {
        return "Cooking";
    }

    @Override
    public ArrayList<String> getStringInformation() {
        ArrayList<String> information = super.getStringInformation();
        information.add(mainIngredient);
        return information;
    }
}

class EsotericBook extends Book {
    private int minimumAgeReader;

    public EsotericBook(String name, int price, String barcode, int amountPages, int minimumAgeReader) {
        super(name, price, barcode, amountPages);
        this.minimumAgeReader = minimumAgeReader;
    }

    @Override
    public String getSubcategory() {
        return "Esoteric";
    }

    @Override
    public ArrayList<String> getStringInformation() {
        ArrayList<String> information = super.getStringInformation();
        information.add(String.valueOf(minimumAgeReader));
        return information;
    }
}
