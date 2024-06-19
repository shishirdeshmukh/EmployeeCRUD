package my_package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import my_package.model.Designations;
public interface DesignationRepository extends JpaRepository<Designations, Integer> {

}
