package com.balldance.baller.controller;

import com.balldance.baller.model.Stat;
import com.balldance.baller.repository.StatRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatsController {
    @Autowired
    private StatRepo mStatRepo;

    @RequestMapping("/stat")
    public String getStat(String uuid) {
        Stat stats = mStatRepo.getReferenceById(uuid);
        if (stats == null) {
            return "";
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(stats);
        } catch (Exception e) {
            System.out.println("Exception happens when getStat:" + e.toString());
        }
        return "";
    }

    @ResponseBody
    @RequestMapping("/updateStat")
    public Stat updateStat(@RequestBody Stat stat) {
        Stat res = null;
        try {
             res = mStatRepo.save(stat);
        } catch (Exception e) {
            System.out.println("Exception happens when update stat:" + e.toString());
        }
        return res;
    }
}
