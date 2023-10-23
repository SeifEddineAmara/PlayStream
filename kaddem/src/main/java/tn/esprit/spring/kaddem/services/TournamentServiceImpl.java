package tn.esprit.spring.kaddem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem.entities.Tournament;
import tn.esprit.spring.kaddem.interfaces.TournamentService;
import tn.esprit.spring.kaddem.repositories.TournamentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TournamentServiceImpl implements TournamentService {

    private final TournamentRepository tournamentRepository;

    @Autowired
    public TournamentServiceImpl(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @Override
    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    @Override
    public Tournament getTournamentById(Long id) {
        Optional<Tournament> optionalTournament = tournamentRepository.findById(id);
        return optionalTournament.orElse(null);
    }

    @Override
    public Tournament createTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament updateTournament(Long id, Tournament tournament) {
        if (tournamentRepository.existsById(id)) {
            tournament.setIdTournoi(id);
            return tournamentRepository.save(tournament);
        }
        return null;
    }

    @Override
    public void deleteTournament(Long id) {
        tournamentRepository.deleteById(id);
    }
}

