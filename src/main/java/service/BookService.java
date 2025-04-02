package service;

import model.Book;
import repository.BookRepository;
import util.BaseRepository;

import java.util.List;

public class BookService implements IBookService {
    private BookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
