package ram.dev.crud.crud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ram.dev.crud.crud.dto.StudentDto;
import ram.dev.crud.crud.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentsController {
    private StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto){
return new ResponseEntity<>(studentService.createStudent(studentDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
      StudentDto studentDto =studentService.getStudentById(id);
     return ResponseEntity.ok(studentDto);
    }

    @DeleteMapping("/{id}")
   public ResponseEntity<String> deleteStudent(@PathVariable Long id){
   studentService.deleteStudent(id);
   return ResponseEntity.ok("Student is Deleted Successfully");
    }

}
