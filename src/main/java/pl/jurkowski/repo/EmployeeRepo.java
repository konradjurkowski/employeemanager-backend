package pl.jurkowski.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jurkowski.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
