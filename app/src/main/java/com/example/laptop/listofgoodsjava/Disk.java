package com.example.laptop.listofgoodsjava;

import java.util.ArrayList;

//Диски бывают CD и DVD.
//Независимо от типа диска, его содержимым может быть: музыка, видео, ПО.

public class Disk extends Goods {
    private final static int music = 0;
    private final static int video = 1;
    private final static int software = 2;

    private String content;
    private String type;

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public Disk(String name, int price, String barcode, String content, String type) {
        super(name, price, barcode);
        this.content = content;
        this.type = type;
    }

    @Override
    public String getSubcategory() {
        return content;
    }

    @Override
    public ArrayList<String> getStringInformation() {
        ArrayList<String> information = super.getStringInformation();
        information.add(content);
        information.add(type);
        return information;
    }
}
