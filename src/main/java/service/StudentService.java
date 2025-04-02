package service;

import model.Student;
import repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
