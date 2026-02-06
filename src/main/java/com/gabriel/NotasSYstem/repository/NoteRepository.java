package com.gabriel.NotasSYstem.repository;

import com.gabriel.NotasSYstem.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
