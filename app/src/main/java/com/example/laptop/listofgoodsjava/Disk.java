package com.example.laptop.listofgoodsjava;

//Диски бывают CD и DVD.
//Независимо от типа диска, его содержимым может быть: музыка, видео, ПО.

public abstract class Disk extends Goods {
    private final static int music = 0;
    private final static int video = 1;
    private final static int software = 2;

    protected String content;

    public Disk(String name, int price, String barcode, String content) {
        super(name, price, barcode);
        this.content = content;
    }
}

class DiskCD extends Disk {

    public DiskCD(String name, int price, String barcode, String content) {
        super(name, price, barcode, content);
    }

    @Override
    public String getSubcategory() {
        return content;
    }
}

class DiskDVD extends Disk {

    public DiskDVD(String name, int price, String barcode, String content) {
        super(name, price, barcode, content);
    }

    @Override
    public String getSubcategory() {
        return content;
    }
}

