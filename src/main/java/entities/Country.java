package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity{
    @Column(name = "name", nullable = false, unique = true, length = 500)
    private String name;

    @ManyToMany
    @JoinTable(name = "continent_countries", joinColumns = @JoinColumn(name = "country_id"), inverseJoinColumns = @JoinColumn(name = "continent_id"))
    private Set<Continent> continents;

    @OneToMany(mappedBy = "country")
    private Set<Town> towns;

}
