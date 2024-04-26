package olik_Assignment.olik.Repository;

// repository/BookRepository.java

import olik_Assignment.olik.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

