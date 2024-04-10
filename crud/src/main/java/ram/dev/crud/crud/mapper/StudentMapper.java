package ram.dev.crud.crud.mapper;

import ram.dev.crud.crud.dto.StudentDto;
import ram.dev.crud.crud.model.Student;

public class StudentMapper {

    public static Student mapToStudent(StudentDto studentDto){
    Student student = new Student(
         studentDto.getId(),
         studentDto.getName(),
         studentDto.getMobileNo(),
         studentDto.getEmailId()
      );
        return student;
    }

    public static StudentDto mapToStudentDto(Student student){
     StudentDto studentDto = new StudentDto(
             student.getId(),
             student.getName(),
             student.getMobileNo(),
             student.getEmailId()
     );
     return studentDto;
    }
}
