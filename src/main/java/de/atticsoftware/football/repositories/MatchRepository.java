package de.atticsoftware.football.repositories;

import de.atticsoftware.football.domain.Match;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MatchRepository extends ReactiveMongoRepository<Match, String> {

    Flux<Match> findByHomeTeam(String theTeam);

    Flux<Match> findByGuestTeam(String theTeam);

    Flux<Match> findByHomeTeamOrGuestTeam(String theHomeTeam, String theGuestTeam);

    Flux<Match> findByMatchDay(int theMatchDay);

    Flux<Match> findBySeason(int theSeason);

    Flux<Match> findBySeasonAndHomeTeam(int theSeason, String theTeam);

    Flux<Match> findBySeasonAndGuestTeam(int theSeason, String theTeam);
}
