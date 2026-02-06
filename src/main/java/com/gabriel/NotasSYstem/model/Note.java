package com.gabriel.NotasSYstem.model;

import com.gabriel.NotasSYstem.enums.NoteStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notes_db__")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private NoteStatus status;
    private Integer prioridade;
    private LocalDateTime createdAt;
    private LocalDateTime conclusionAt;

    public Note(){
        this.createdAt = LocalDateTime.now();
        this.status = NoteStatus.PENDENTE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NoteStatus getStatus() {
        return status;
    }

    public void setStatus(NoteStatus status) {
        this.status = status;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getConclusionAt() {
        return conclusionAt;
    }

    public void setConclusionAt(LocalDateTime conclusionAt) {
        this.conclusionAt = conclusionAt;
    }
}
