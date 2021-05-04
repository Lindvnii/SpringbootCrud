package com.example.librarysystem.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Library")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;


    private String ISBN ;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    @Column(name ="Book_Title")
    private String title;

    @Column(name ="Author")
    private String author;

    @Column(name ="Publisher")
    private String publisher;

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN()
    {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
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
}
