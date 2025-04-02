package repository;

import model.Student;
import util.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String SELECT_ALL_STUDENTS = "SELECT * FROM hoc_sinh";

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENTS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maHocSinh = resultSet.getInt("ma_hoc_sinh");
                String hoTenHS = resultSet.getString("ho_ten");
                String lop = resultSet.getString("lop");
                Student student = new Student(maHocSinh, hoTenHS, lop);
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return students;
    }
}
