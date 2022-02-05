package employee.spring.fleet.parameters.repositories;

import employee.spring.fleet.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

}
