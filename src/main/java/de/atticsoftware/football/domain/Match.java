package de.atticsoftware.football.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Match {

    @Id
    private String id;
    private int season;
    private int matchDay;
    private String homeTeam;
    private String guestTeam;
    private int homeGoals;
    private int guestGoals;

}
