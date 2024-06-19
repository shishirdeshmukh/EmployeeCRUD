package my_package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import my_package.model.*;

public interface EmployeRepository extends JpaRepository<Employee, Integer>{

}
