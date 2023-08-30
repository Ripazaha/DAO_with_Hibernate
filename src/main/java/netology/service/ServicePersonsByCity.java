package netology.service;

import netology.entity.Person;
import netology.repository.RepositoryPersonsByCity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePersonsByCity {
    private final RepositoryPersonsByCity repositoryPersonsByCity;

    public ServicePersonsByCity(RepositoryPersonsByCity repositoryPersonsByCity) {
        this.repositoryPersonsByCity = repositoryPersonsByCity;
    }

    public List<Person> getPersonsByCity(String city) {
        return repositoryPersonsByCity.getPersonsByCity(city);
    }
}
