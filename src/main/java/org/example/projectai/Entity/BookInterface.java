package org.example.projectai.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInterface extends JpaRepository<Book,Long> {
}
