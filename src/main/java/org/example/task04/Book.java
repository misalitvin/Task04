package org.example.task04;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table()
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOfBook;
    private String title;
    private double price;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Author> author_list = new ArrayList<>();


    public Book(){
    }
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Long getIdOfBook() {
        return idOfBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "ID: " + idOfBook +
                ", title: " + title +

                ", price: " + price;
    }
}
