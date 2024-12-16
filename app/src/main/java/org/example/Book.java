package org.example;

public record Book(String title, String author, int yearPublished) {
public String getTitle(){
    return title;
}
public int getYearPublished(){
    return yearPublished;
}
public String getAuthor(){
    return author;
}
    // This is your working class.
    
}
