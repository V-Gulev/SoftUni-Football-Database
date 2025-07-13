package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "competition_type")
public class CompetitionType extends BaseEntity{
    @Column(name = "type", nullable = false, unique = true)
    private String type;

    @OneToMany(mappedBy = "competitionType")
    private Set<Competition> competition;
}
