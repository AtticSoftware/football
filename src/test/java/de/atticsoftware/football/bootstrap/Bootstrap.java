package de.atticsoftware.football.bootstrap;

import de.atticsoftware.football.domain.Match;
import de.atticsoftware.football.repositories.MatchRepository;

public class Bootstrap {

    private final MatchRepository matchRepository;

    public Bootstrap(MatchRepository theMatchRepository) {

        matchRepository = theMatchRepository;
    }

    public void initMatches() {

        Match match = Match.builder().id("match1").season(1).matchDay(1)
                .homeTeam("Cats").guestTeam("Dogs").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match2").season(1).matchDay(1)
                .homeTeam("Pigs").guestTeam("Mice").homeGoals(0).guestGoals(0).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match3").season(1).matchDay(2)
                .homeTeam("Cats").guestTeam("Pigs").homeGoals(2).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match4").season(1).matchDay(2)
                .homeTeam("Dogs").guestTeam("Mice").homeGoals(0).guestGoals(2).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match5").season(1).matchDay(3)
                .homeTeam("Mice").guestTeam("Cats").homeGoals(2).guestGoals(2).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match6").season(1).matchDay(3)
                .homeTeam("Pigs").guestTeam("Dogs").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match7").season(1).matchDay(4)
                .homeTeam("Dogs").guestTeam("Cats").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match8").season(1).matchDay(4)
                .homeTeam("Mice").guestTeam("Pigs").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match9").season(1).matchDay(5)
                .homeTeam("Pigs").guestTeam("Cats").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match10").season(1).matchDay(5)
                .homeTeam("Mice").guestTeam("Dogs").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match11").season(1).matchDay(6)
                .homeTeam("Cats").guestTeam("Mice").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

        match = Match.builder().id("match12").season(1).matchDay(6)
                .homeTeam("Dogs").guestTeam("Pigs").homeGoals(3).guestGoals(1).build();
        matchRepository.save(match).block();

    }

}
