package com.gabriel.NotasSYstem.mapper;


import com.gabriel.NotasSYstem.dto.NoteCreateRequest;
import com.gabriel.NotasSYstem.dto.NoteResponse;
import com.gabriel.NotasSYstem.model.Note;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoteMapper {

    public Note toEntity(NoteCreateRequest dto){
        Note note = new Note();

        note.setTitle(dto.getTitle());
        note.setContent(dto.getContent());
        note.setPrioridade(dto.getPrioridade());


        return note;
    }

    public NoteResponse toResponse(Note dados){
        NoteResponse response = new NoteResponse();
        response.setId(dados.getId());
        response.setTitle(dados.getTitle());
        response.setContent(dados.getContent());
        response.setStatus(dados.getStatus());
        response.setPrioridade(dados.getPrioridade());
        response.setCreatedAt(dados.getCreatedAt());

        return response;
    }

    public List<NoteResponse> toResponseList(List<Note> notes){
        return notes.stream().map(this::toResponse).toList();
    }
}
