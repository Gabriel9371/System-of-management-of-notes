package com.gabriel.NotasSYstem.dto;

import com.gabriel.NotasSYstem.enums.NoteStatus;
import jakarta.validation.constraints.NotNull;

public class UpdateStatusNote {


    @NotNull
    private NoteStatus status;

    public NoteStatus getStatus() {
        return status;
    }

    public void setStatus(NoteStatus status) {
        this.status = status;
    }
}
