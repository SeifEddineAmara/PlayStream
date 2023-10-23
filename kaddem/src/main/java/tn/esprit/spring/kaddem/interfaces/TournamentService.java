package tn.esprit.spring.kaddem.interfaces;

import tn.esprit.spring.kaddem.entities.Tournament;

import java.util.List;

public interface TournamentService {
    List<Tournament> getAllTournaments();
    Tournament getTournamentById(Long id);
    Tournament createTournament(Tournament tournament);
    Tournament updateTournament(Long id, Tournament tournament);
    void deleteTournament(Long id);
}
