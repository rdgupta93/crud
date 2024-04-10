package ram.dev.crud.crud.service.impl;

import org.springframework.stereotype.Service;
import ram.dev.crud.crud.dto.StudentDto;
import ram.dev.crud.crud.mapper.StudentMapper;
import ram.dev.crud.crud.model.Student;
import ram.dev.crud.crud.repository.StudentRepository;
import ram.dev.crud.crud.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long Id) {
        Student student = studentRepository
                .findById(Id)
                .orElseThrow(()->new RuntimeException("Student Id Does Not Exist"));
        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public void deleteStudent(long id) {
      Student student =studentRepository.findById(id)
              .orElseThrow(()->new RuntimeException("Student Id Does Not Exits"));
      studentRepository.deleteById(id);
    }


}
