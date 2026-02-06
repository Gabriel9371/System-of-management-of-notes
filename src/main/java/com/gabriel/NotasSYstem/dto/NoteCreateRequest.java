package com.gabriel.NotasSYstem.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NoteCreateRequest {
    @NotBlank(message = "é obrigatorio passar um titulo")
    private String title;
    @NotBlank(message = "é obrigatorio passar um conteudo")
    private String content;


    @Min(1)
    @Max(5)
    private Integer prioridade;


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

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }
}
