package com.devsuperior.dsmovie.services;

import java.util.Optional;
import com.devsuperior.dsmovie.dtos.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

   @Autowired
   private MovieRepository movieRepository;

   @Transactional(readOnly = true)
   public Page<MovieDTO> findAll(Pageable pageable) {
      Page<Movie> movies = movieRepository.findAll(pageable);
      Page<MovieDTO> dtos = movies.map(entity -> new MovieDTO(entity));
      return dtos;
   }

   @Transactional(readOnly = true)
   public MovieDTO findById(Long id) {
      Optional<Movie> optional = movieRepository.findById(id);
      Movie movie = optional.get();
      return new MovieDTO(movie);
   }
}
