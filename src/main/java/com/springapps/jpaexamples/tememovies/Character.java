package com.springapps.jpaexamples.tememovies;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name= "characters")
public class Character {
    @Id
    @GeneratedValue
    private long Id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "movies_characters",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name="movie_id")
    )
    private Set<Movie> movies;

    public Character(String name) {
        this.name = name;
    }

    public Character() {
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

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Character{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
