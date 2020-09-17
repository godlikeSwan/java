package oop;

public class Book {
  String name;
  String author;
  int numberOfPages;
  int currentPage;

  public Book () {
    this("Book", "Anonimus", 10);
  }

  public Book (String name, String author, int numberOfPages) {
    this.name = name;
    this.author = author;
    this.numberOfPages = numberOfPages;
    currentPage = 1;
  }

  /**
   * If you change name it will be another book.
   */
  public String getName () {
    return this.name;
  }

  /**
   * same as a name (see the {@link #getName() getName} method).
   */
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

  @Override
  public String toString () {
    return getName() + "; author: " + getAuthor() + "; " + getNumberOfPages() + " pages";
  }
}