package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "players")
public class Player extends BaseEntity{
    @Column(name = "name", nullable = false, length = 500)
    private String name;

    @Column(name = "squad_number", nullable = false, unique = true)
    private Integer squadNumber;

    @Column(name = "is_injured", nullable = false)
    private Boolean isInjured;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany
    private Set<PlayerStatistics> playerStatistics;
}
