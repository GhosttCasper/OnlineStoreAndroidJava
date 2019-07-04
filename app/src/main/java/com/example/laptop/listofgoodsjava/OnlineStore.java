package com.example.laptop.listofgoodsjava;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class OnlineStore {

    private final static int bookC = 0;
    private final static int bookCPlusPlus = 1;
    private final static int bookCSharp = 2;
    private final static int bookJava = 3;
    private final static int bookObjectiveC = 4;
    private final static int bookSwift = 5;
    private final static int bookPython = 6;
    private final static int bookKotlin = 7;
    private final static int bookPascal = 8;
    private final static int bookGingerbread = 9;
    private final static int bookIceCreamSandwich = 10;
    private final static int bookJellyBean = 11;
    private final static int bookKitKat = 12;
    private final static int bookLollipop = 13;
    private final static int bookDonut = 14;
    private final static int bookEsoteric0 = 15;
    private final static int bookEsoteric1 = 16;
    private final static int bookEsoteric2 = 17;
    private final static int bookEsoteric3 = 18;
    private final static int bookEsoteric4 = 19;
    private final static int diskCD0 = 20;
    private final static int diskCD1 = 21;
    private final static int diskDVD0 = 22;
    private final static int diskDVD1 = 23;


    public static List<Goods> defaultGoods(Context context) {
        List<Goods> goodsList = new ArrayList<Goods>();

        Resources res = context.getResources();

        //  Programming Books
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookC), 10, "12345", 298, "C"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookCPlusPlus), 11, "62345", 198, "C++"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookCSharp), 12, "72345", 225, "C#"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookJava), 13, "82345", 100, "Java"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookObjectiveC), 14, "92345", 58, "ObjectiveC"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookSwift), 15, "02345", 265, "Swift"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookPython), 16, "22345", 348, "Python"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookKotlin), 17, "32345", 654, "Kotlin"));
        goodsList.add(new ProgrammingBook(res.getString(R.string.bookPascal), 17, "42345", 112, "Pascal"));

        //  Cooking Books
        goodsList.add(new CookingBook(res.getString(R.string.bookGingerbread), 1, "23456", 36, "sugar"));
        goodsList.add(new CookingBook(res.getString(R.string.bookIceCreamSandwich), 2, "23457", 22, "ice"));
        goodsList.add(new CookingBook(res.getString(R.string.bookJellyBean), 3, "23458", 13, "sugar"));
        goodsList.add(new CookingBook(res.getString(R.string.bookKitKat), 4, "23459", 12, "nut"));
        goodsList.add(new CookingBook(res.getString(R.string.bookLollipop), 5, "23450", 10, "honey"));
        goodsList.add(new CookingBook(res.getString(R.string.bookDonut), 6, "23451", 56, "flour"));

        //  Esoteric Books
        goodsList.add(new EsotericBook(res.getString(R.string.bookEsoteric0), 100, "34567", 64, 6));
        goodsList.add(new EsotericBook(res.getString(R.string.bookEsoteric1), 101, "34568", 34, 12));
        goodsList.add(new EsotericBook(res.getString(R.string.bookEsoteric2), 102, "34569", 37, 14));
        goodsList.add(new EsotericBook(res.getString(R.string.bookEsoteric3), 103, "34560", 76, 16));
        goodsList.add(new EsotericBook(res.getString(R.string.bookEsoteric4), 104, "34561", 789, 95));

        //  Programming Disk CD
        goodsList.add(new DiskCD(res.getString(R.string.diskCD0), 10, "45678", res.getString(R.string.music)));
        goodsList.add(new DiskCD(res.getString(R.string.diskCD1), 185, "45679", res.getString(R.string.video)));

        //  Programming Disk DVS
        goodsList.add(new DiskDVD(res.getString(R.string.diskDVD0), 15, "56789", res.getString(R.string.software)));
        goodsList.add(new DiskDVD(res.getString(R.string.diskDVD1), 60, "56780", res.getString(R.string.music)));

        return goodsList;
    }
}
