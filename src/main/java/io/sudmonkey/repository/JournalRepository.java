package io.sudmonkey.repository;

import io.sudmonkey.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal,Long>{
}
