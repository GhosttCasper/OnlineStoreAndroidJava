package com.example.laptop.listofgoodsjava;

public abstract class Book extends Goods {

    private int amountPages;

    public Book(String name, int price, String barcode, int amountPages) {
        super(name, price, barcode);
        this.amountPages = amountPages;
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
}
