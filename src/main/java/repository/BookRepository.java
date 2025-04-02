package repository;

import model.Book;
import util.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    private final String SELECT_ALL = "select * from sach";

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maSach  = resultSet.getString("ma_sach");
                String tenSach  = resultSet.getString("ten_sach");
                String tacGia  = resultSet.getString("tac_gia");
                int soLuong = resultSet.getInt("so_luong");
                String moTa = resultSet.getString("mo_ta");
                Book books = new Book(maSach, tenSach, tacGia, soLuong, moTa);
                bookList.add(books);
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
        return bookList;
    }
}
