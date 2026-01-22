package com.example.database.controllers;


import com.example.database.enteties.Unit7;
import com.example.database.repositories.Unit7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("api/unit")
public class UnitController {
    @Autowired
    Unit7Repository unit7Repository;

    @PostMapping("addUnit7")
    String addUnit(@RequestBody Unit7 unit7){
        System.out.println(Arrays.toString(unit7.getBranchManager()));
        unit7Repository.save(unit7);
        return "success";
    }

    @GetMapping("getUnit7")
    Unit7 getUnit7ById(Long id){
        return unit7Repository.findById(id).get();
    }

}
