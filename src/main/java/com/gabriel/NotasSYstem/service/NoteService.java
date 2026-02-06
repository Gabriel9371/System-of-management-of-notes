package com.gabriel.NotasSYstem.service;


import com.gabriel.NotasSYstem.dto.NoteCreateRequest;
import com.gabriel.NotasSYstem.dto.NoteResponse;
import com.gabriel.NotasSYstem.exception.NoteNotFoundException;
import com.gabriel.NotasSYstem.mapper.NoteMapper;
import com.gabriel.NotasSYstem.model.Note;
import com.gabriel.NotasSYstem.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository repository;
    private final NoteMapper mapper;

    public NoteService(NoteRepository repository, NoteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<NoteResponse> getall(){
        List<Note> notes = repository.findAll();
        List<NoteResponse> toListNote = mapper.toResponseList(notes);

        return toListNote;
    }

    public NoteResponse listById(Long id){
        Note nota = repository.findById(id).orElseThrow(
                () -> new NoteNotFoundException(id)
        );

        return mapper.toResponse(nota);
    }


    public NoteResponse createNote(NoteCreateRequest dto){
        Note newNote = mapper.toEntity(dto);
        if(dto.getPrioridade() == null){
            newNote.setPrioridade(1);
        }
        Note saveNote = repository.save(newNote);

        return mapper.toResponse(saveNote);
    }

    public void deleteNote(Long id){
        Note note = repository.findById(id).orElseThrow(
                () -> new NoteNotFoundException(id)
        );

        repository.deleteById(id);
    }




}
