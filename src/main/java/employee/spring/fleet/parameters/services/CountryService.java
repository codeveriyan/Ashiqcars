package employee.spring.fleet.parameters.services;

import employee.spring.fleet.parameters.models.Country;
import employee.spring.fleet.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@Service
public class CountryService {
@Autowired
    private CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country>getAll(){
        return countryRepository.findAll();}
    public void save(Country country){
        countryRepository.save(country);
    }


}
