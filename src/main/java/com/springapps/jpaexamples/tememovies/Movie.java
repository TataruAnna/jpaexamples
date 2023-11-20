package com.springapps.jpaexamples.tememovies;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name= "movies")
public class Movie {

    //Un film contine mai multe caracatere, iar un caracter poate juca in mai multe filme. Un film poate apartine unei francize,
    // iar o franciza poate contine mai multe filme. De exemplu, franciza Marvel contine 23 de filme.


    @Id
    @GeneratedValue
    private long Id;
    @Column
    private String name;

    @ManyToMany(mappedBy = "movies")
    private Set<Character> characters;

    @ManyToOne
    @JoinColumn(name= "francise_id")
    private Francise francise;

    public Movie(String name) {
        this.name = name;
    }

    public Movie() {
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

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public Francise getFrancise() {
        return francise;
    }

    public void setFrancise(Francise francise) {
        this.francise = francise;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
