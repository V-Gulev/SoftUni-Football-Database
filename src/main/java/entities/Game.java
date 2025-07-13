package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "games")
public class Game extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "home_team_id", nullable = false)
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id", nullable = false)
    private Team awayTeam;

    @ManyToOne
    @JoinColumn(name = "round_id")
    private Round round;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;

    @OneToMany(mappedBy = "game")
    private Set<PlayerStatistics> playerStatistics;
}
