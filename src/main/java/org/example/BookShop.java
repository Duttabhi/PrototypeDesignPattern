package org.example;

import java.util.ArrayList;
import java.util.List;

//Cloneable is marker interface with no methods in it
public class BookShop implements Cloneable{

    private String shopName;
    List<Book> books = new ArrayList<>();

    public void loadBooks(){
        //load books from database and set books fro the current bookShop object
        Book b1 = new Book();
        b1.setBookId(2023001);
        b1.setBookName("Ikigai");

        Book b2 = new Book();
        b2.setBookId(2023002);
        b2.setBookName("Deep Work");

        books.add(b1);
        books.add(b2);

    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName(this.getShopName());
        for(Book book : this.getBooks()){
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }

}
