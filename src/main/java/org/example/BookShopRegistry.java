package org.example;

import java.util.HashMap;
import java.util.Map;

public class BookShopRegistry {
    private static Map<String, BookShop> mapBookShop = new HashMap<>();
    public BookShopRegistry(){
        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("KitabGhar");
        bookShop1.loadBooks();//read from database

        BookShop bookShop2 = new BookShop();
        bookShop2.setShopName("CentralBookHouse");
        bookShop2.loadBooks();//read from database

        mapBookShop.put("KitabGhar", bookShop1);
        mapBookShop.put("CentralBookHouse", bookShop2);
    }

    public BookShop getBookShop(String shopName) throws CloneNotSupportedException{
        return mapBookShop.get(shopName).clone();
    }
}
