package com.dash.dash.controller;
import com.dash.dash.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {
    private final DataRepository dataRepository;

    @Autowired
    public DataController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @CrossOrigin(origins = "http://127.0.0.1")
    @GetMapping("/end_year")
    public List<Integer> getAllEndYears(){
        return dataRepository.getAllEndYears();
    }

    @CrossOrigin(origins = "http://127.0.0.1")
    @GetMapping("/intensity")
    public List<String> getAllIntensities(){
        return dataRepository.getAllIntensities();
    }


    @CrossOrigin(origins = "http://127.0.0.1")
    @GetMapping("/sector")
    public List<String> getAllSectors(){
        return dataRepository.getAllSectors();
    }

}
