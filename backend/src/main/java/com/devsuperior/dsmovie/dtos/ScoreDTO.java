package com.devsuperior.dsmovie.dtos;

public class ScoreDTO {

   private Long movieId;
   private String userEmail;
   private Double value;

   public ScoreDTO() {}

   public Long getMovieId() {
      return movieId;
   }

   public void setMovieId(Long movieId) {
      this.movieId = movieId;
   }

   public String getUserEmail() {
      return userEmail;
   }

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

   public Double getValue() {
      return value;
   }

   public void setValue(Double value) {
      this.value = value;
   }

}
