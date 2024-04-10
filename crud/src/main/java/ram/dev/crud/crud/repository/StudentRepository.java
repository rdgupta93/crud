package ram.dev.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ram.dev.crud.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
