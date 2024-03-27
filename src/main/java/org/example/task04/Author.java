package org.example.task04;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


@Entity
@Table()
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOfAuthor;
    private String name;
    private String surname;

    @ManyToMany(mappedBy = "author_list")
    private List<Book> book_list = new ArrayList<>();

    public Author() {
    }

    public Author( String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "idOfAuthor=" + idOfAuthor +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Long getIdOfAuthor() {
        return idOfAuthor;
    }

    public void setIdOfAuthor(Long idOfAuthor) {
        this.idOfAuthor = idOfAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
