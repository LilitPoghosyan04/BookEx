package org.example.bookex;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private int publicationYear;
    private int availableCopies;

    public Book(Integer id, String title, String author, int publicationYear, int availableCopies) {
        setId(id);
        setTitle(title);
        setAuthor(author);
        setPublicationYear(publicationYear);
        setAvailableCopies(availableCopies);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
