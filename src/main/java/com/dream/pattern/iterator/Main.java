package com.dream.pattern.iterator;

public class Main {
    public static void main(String[] args) {
        /**
         * 迭代器、具体的迭代器、集合、具体的集合
         */
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("安卓"));
        bookShelf.appendBook(new Book("设计模式"));
        bookShelf.appendBook(new Book("Kubernetes"));
        bookShelf.appendBook(new Book("Flutter"));
        bookShelf.appendBook(new Book("Golang"));

        /*Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }*/

        for (int i=0;i<bookShelf.getLength();i++){
            System.out.println(bookShelf.getBookAt(i).getName());
        }
    }
}
