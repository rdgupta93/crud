package ram.dev.crud.crud.service;

import ram.dev.crud.crud.dto.StudentDto;
import ram.dev.crud.crud.model.Student;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long Id);
    void deleteStudent(long id);

}
