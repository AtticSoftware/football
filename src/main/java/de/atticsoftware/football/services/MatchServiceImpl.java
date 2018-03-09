package de.atticsoftware.football.services;

import de.atticsoftware.football.domain.Match;
import de.atticsoftware.football.repositories.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchRepository theMatchRepository) {

        matchRepository = theMatchRepository;
    }

    @Override
    public List<Match> getAllMatches() {

        return matchRepository.findAll().collectList().block();
    }

    @Override
    public void playMatch() {

    }
}
