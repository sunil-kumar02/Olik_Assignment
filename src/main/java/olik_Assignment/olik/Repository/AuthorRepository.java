package olik_Assignment.olik.Repository;

// repository/AuthorRepository.java


import olik_Assignment.olik.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

