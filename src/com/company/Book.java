package com.company;


import java.util.Scanner;

public class Book {
    String title;
    String bookAuthor;
    double cost;
    String year_of_pulication;

    Book setData(Book _book, Scanner _input){
        System.out.println("Enter book title: ");
        _book.title=  _input.nextLine();
        System.out.println("Enter book author: ");
        _book.bookAuthor=  _input.nextLine();
        System.out.println("Enter book cost: ");
        _book.cost=  _input.nextDouble();
        System.out.println("Enter book year of pulication: ");
        _book.year_of_pulication=  _input.next();
        return _book;
    }
    void displayData(){
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.bookAuthor);
        System.out.println("Cost : Kshs "+this.cost);
        System.out.println("Year of pulication : "+this.year_of_pulication);
    }
}