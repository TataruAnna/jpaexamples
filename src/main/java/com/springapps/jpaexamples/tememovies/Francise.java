package com.springapps.jpaexamples.tememovies;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "francises")
public class Francise {

    @Id
    @GeneratedValue
    private long Id;

    @Column
    private String name;

    @OneToMany(mappedBy = "francise")
    private List<Movie> movies;

    public Francise(String name) {
        this.name = name;
    }

    public Francise() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Francise{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
