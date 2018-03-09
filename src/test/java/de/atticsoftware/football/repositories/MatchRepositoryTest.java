package de.atticsoftware.football.repositories;

import de.atticsoftware.football.bootstrap.Bootstrap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataMongoTest
public class MatchRepositoryTest {

    @Autowired
    private MatchRepository matchRepository;

    @Before
    public void setup() {

        new Bootstrap(matchRepository).initMatches();
    }

    @After
    public void tearDown() {

        matchRepository.deleteAll();
    }

    @Test
    public void testGetAllMatches() {

        assertEquals(12, matchRepository.findAll().count().block(),0.0);
    }

    @Test
    public void testFindByTeam() {

        assertEquals(3, matchRepository.findByHomeTeam("Cats").count().block(), 0.0);
        assertEquals(3, matchRepository.findByGuestTeam("Cats").count().block(), 0.0);
        assertEquals(6, matchRepository.findByHomeTeamOrGuestTeam("Mice", "Mice").count().block(), 0.0);
    }

    @Test
    public void testFindByMatchDay() {

        assertEquals(2, matchRepository.findByMatchDay(2).count().block(), 0.0);
        assertEquals(2, matchRepository.findByMatchDay(6).count().block(), 0.0);
        assertTrue(matchRepository.findByMatchDay(7).collectList().block().isEmpty());
    }

    @Test
    public void testFindBySeasonAndTeam() {

        int homeMatches = matchRepository.findBySeasonAndHomeTeam(1, "Dogs").count().block().intValue();
        int guestMatches = matchRepository.findBySeasonAndGuestTeam(1, "Dogs").count().block().intValue();

        assertEquals(6, homeMatches + guestMatches);
    }
}
