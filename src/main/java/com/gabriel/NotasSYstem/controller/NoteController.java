package com.gabriel.NotasSYstem.controller;

import com.gabriel.NotasSYstem.dto.NoteCreateRequest;
import com.gabriel.NotasSYstem.dto.NoteResponse;
import com.gabriel.NotasSYstem.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {
    private final NoteService service;

    public NoteController(NoteService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<NoteResponse>> listAllNotes(){
        List<NoteResponse> allNotes = service.getall();

        return ResponseEntity.ok(allNotes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteResponse> listNoteById(@PathVariable Long id){
        NoteResponse note = service.listById(id);

        return ResponseEntity.ok(note);
    }

    @PostMapping
    public ResponseEntity<NoteResponse> createNote(@RequestBody @Valid NoteCreateRequest dto){
        NoteResponse nota = service.createNote(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(nota);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<NoteResponse> delete(@PathVariable Long id){
        service.deleteNote(id);

        return ResponseEntity.noContent().build();
    }
}
