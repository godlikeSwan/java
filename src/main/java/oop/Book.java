package oop;

public class Book {
  String name;
  String author;
  int numberOfPages;
  int currentPage;

  public Book () {
    name = "Book";
    author = "Anonimus";
    numberOfPages = 10;
    currentPage = 0;
  }

  public Book (String name, String author, int numberOfPages) {
    this.name = name;
    this.author = author;
    this.numberOfPages = numberOfPages;
    currentPage = 0;
  }

  public String getName () {
    return this.name;
  }

  public String getAuthor () {
    return this.author;
  }

  public int getNumberOfPages () {
    return this.numberOfPages;
  }

  public int getCurrentPage () {
    return this.currentPage;
  }

  public void setCurrentPage (int currentPage) {
    this.currentPage = currentPage;
  }

  public int flip () {
    this.currentPage += 1;
    return this.currentPage;
  }
}