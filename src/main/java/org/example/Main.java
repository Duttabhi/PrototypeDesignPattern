package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //BookShop bookShop = new BookShop();
        //System.out.println(bookShop);

        //bookShop.setShopName("KitabGhar");
        //bookShop.loadBooks();//read from database

        //BookShop newBookShop = (BookShop) bookShop.clone();//new BookShop(); //clone the previous object
        //shallow cloning and deep cloning
        //OBJECT.clone() goes for shallow cloning
        //BookShop newBookShop = bookShop.clone();
        //bookShop.getBooks().remove(1);
        //System.out.println(bookShop);
        //System.out.println(newBookShop);//removal of book from earlier object affects the clone object, shallow copy not good
        BookShopRegistry bookShopRegistry = new BookShopRegistry();
        BookShop bookShop = bookShopRegistry.getBookShop("KitabGhar");
        BookShop newBookShop = bookShopRegistry.getBookShop("KitabGhar");
        bookShop.getBooks().remove(1);
        System.out.println(bookShop);
        System.out.println(newBookShop);

    }
}