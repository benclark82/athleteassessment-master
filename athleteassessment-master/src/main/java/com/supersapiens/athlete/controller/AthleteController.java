package com.supersapiens.athlete.controller;

import com.supersapiens.athlete.model.Athlete;
import com.supersapiens.athlete.service.AthleteService;
import org.springframework.web.bind.annotation.*;


@RestController
public class AthleteController {

    private final AthleteService service;

    public AthleteController(AthleteService service) {
        this.service = service;
    }


    @RequestMapping(value= "/athlete/add", method= RequestMethod.POST)
    public Athlete createAthlete(@RequestBody Athlete athlete) {
        return service.createAthlete(athlete);
    }

    @RequestMapping(value= "/athlete/update/{id}", method= RequestMethod.PUT)
    public Athlete updateAthlete(@RequestBody Athlete athlete, @PathVariable int id) throws Exception {
        return service.updateAthlete(athlete, Long.valueOf(id));
    }

    @RequestMapping(value= "/athlete/{id}", method= RequestMethod.GET)
    public Athlete getAthleteById(@PathVariable int id) throws Exception {
        return service.getAthlete(Long.valueOf(id));
    }
    @RequestMapping(value= "/athlete/delete/{id}", method= RequestMethod.DELETE)
    public void deleteAthleteById(@PathVariable int id) throws Exception {
        service.deleteAthlete(Long.valueOf(id));
    }

}
