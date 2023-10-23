package tn.esprit.spring.kaddem.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTournoi;

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private String rules;
    private Long idPlayer;
    private int rank;
    private int score;



    }


