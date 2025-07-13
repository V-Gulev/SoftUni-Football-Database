package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "competitions")
public class Competition extends BaseEntity{
    @Column(name = "name", nullable = false, length = 500)
    private String name;

    @ManyToOne
    @JoinColumn(name = "competition_type_id")
    private CompetitionType competitionType;


    @OneToMany(mappedBy = "competition")
    private Set<Game> games;
}
