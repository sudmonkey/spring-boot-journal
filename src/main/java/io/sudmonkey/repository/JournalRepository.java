package io.sudmonkey.repository;

import io.sudmonkey.domain.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<JournalEntry,Long>{
}
