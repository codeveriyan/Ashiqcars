package employee.spring.fleet.parameters.controllers;

import employee.spring.fleet.parameters.models.Country;
import employee.spring.fleet.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

   @GetMapping("/countries")
    public String getAll(Model model){
       List<Country> countries=countryService.getAll();
       model.addAttribute("countries",countries);
       return "parameters/countryList";
   }
   @GetMapping("/countryAdd")
   public String addCountry(){ return "parameters/countryAdd"; }
    @PostMapping("/countries")
    public String save(Country country){
     countryService.save(country);
     return "redirect:/countries";
    }
}
