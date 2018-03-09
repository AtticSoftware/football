package de.atticsoftware.football.services;

import de.atticsoftware.football.domain.Match;

import java.util.List;

public interface MatchService {

    List<Match> getAllMatches();

    void playMatch();
}
