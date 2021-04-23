package com.supersapiens.athlete.service;

import com.supersapiens.athlete.model.Athlete;
import com.supersapiens.athlete.repository.AthleteInMemoryRepository;
import org.springframework.stereotype.Service;

@Service
public class AthleteService {
    private AthleteInMemoryRepository athleteRepository;

    public AthleteService (AthleteInMemoryRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public Athlete createAthlete(Athlete athlete) {
        return athleteRepository.createAthlete(athlete);
    }

    public Athlete updateAthlete(Athlete athlete, Long id) {
        athlete.setId(id);
        return athleteRepository.updateAthlete(athlete, id);
    }

    public Athlete getAthlete(Long id) {
        return athleteRepository.getAthleteById(id);
    }

    public void deleteAthlete(Long id) {
        athleteRepository.deleteAthleteById(id);
    }

    // TODO: Use AthleteInMemoryRepository
}
