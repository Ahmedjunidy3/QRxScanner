package com.example.qrxscanners;

public class Items {
    private String itemname;
    private String itemnumber;
    private String itembarcode;


public Items() {

}

public Items(String itemname, String itemnumber, String itembarcode){

    this.itemname=itemname;
    this.itemnumber=itemnumber;
    this.itembarcode= itembarcode;
}

    public String getItemname() {
        return itemname;
    }


    public String getItemnumber() {
        return itemnumber;
    }

    public String getItembarcode() {
        return itembarcode;
    }
}