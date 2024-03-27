package org.example.task04;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table()
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String adress;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Book> BookList = new ArrayList<>();

    public Publisher() {
    }

    public Publisher(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idOfPublisher) {
        this.id = idOfPublisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "idOfPublisher=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
