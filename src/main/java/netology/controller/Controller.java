package netology.controller;

import netology.entity.Person;
import netology.service.ServicePersonsByCity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final ServicePersonsByCity servicePersonsByCity;

    public Controller(ServicePersonsByCity servicePersonsByCity) {
        this.servicePersonsByCity = servicePersonsByCity;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getProduct(@RequestParam("city") String city) {
        return servicePersonsByCity.getPersonsByCity(city);
    }
}
