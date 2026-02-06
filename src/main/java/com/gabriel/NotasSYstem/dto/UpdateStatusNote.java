package com.gabriel.NotasSYstem.dto;

import com.gabriel.NotasSYstem.enums.NoteStatus;
import com.gabriel.NotasSYstem.model.Note;
import jakarta.validation.constraints.NotBlank;

public class UpdateStatusNote {


    @NotBlank
    private NoteStatus status;

    public NoteStatus getStatus() {
        return status;
    }

    public void setStatus(NoteStatus status) {
        this.status = status;
    }
}
