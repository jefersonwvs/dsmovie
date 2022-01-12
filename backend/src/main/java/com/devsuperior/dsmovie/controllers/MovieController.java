package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dtos.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

   @Autowired
   private MovieService movieService;

   @GetMapping
   public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable) {
      Page<MovieDTO> page = movieService.findAll(pageable);
      return ResponseEntity.ok().body(page);
   }

   @GetMapping(value = "/{id}")
   public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
      MovieDTO dto = movieService.findById(id);
      return ResponseEntity.ok().body(dto);
   }
}
