package com.example.kolokvijum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    public Film save(Film newFilm){
        return filmRepository.save(newFilm);
    }

    public List<Film> getAllFilms(){
        return filmRepository.findAll();
    }
}
