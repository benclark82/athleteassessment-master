package com.supersapiens.athlete.repository;


import com.supersapiens.athlete.model.Athlete;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AthleteInMemoryRepository {

    Map<Long, Athlete> athleteMap;

    AthleteInMemoryRepository() {
        athleteMap = new HashMap<>();

        Athlete athlete1 = new Athlete("Ben", "Clark", Athlete.PrimarySport.RUNNING, Athlete.SecondarySport.PARAGLIDING);
        Athlete athlete2 = new Athlete("Michael", "Phelps", Athlete.PrimarySport.SWIMMING, Athlete.SecondarySport.HIKING);

        this.createAthlete(athlete1);
        this.createAthlete(athlete2);

    }

    public Athlete createAthlete(Athlete athlete) {
        if(athlete.getId() == null)
            athlete.setId(Long.valueOf(athleteMap.size()+1));
        athleteMap.put(athlete.getId(), athlete);
        return athlete;

    }

    public Athlete updateAthlete(Athlete athlete, Long id) {
        athlete.setId(Long.valueOf(athleteMap.size()+1));
        athleteMap.put(id, athlete);
        return athlete;
    }

    public Athlete getAthleteById(Long id) {
        return athleteMap.get(id);
    }

    public void deleteAthleteById(Long id) {
        athleteMap.remove(id);

    }
}
