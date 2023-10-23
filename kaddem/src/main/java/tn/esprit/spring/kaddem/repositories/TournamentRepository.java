package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.kaddem.entities.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}
