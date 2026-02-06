package com.gabriel.NotasSYstem.exception;


public class NoteNotFoundException extends RuntimeException{

    public NoteNotFoundException(Long id){
        super("Note with " + id + " Not Found");
    }

}
