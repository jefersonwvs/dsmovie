package com.devsuperior.dsmovie.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {

   @EmbeddedId
   private ScorePK id = new ScorePK();
   private Double value;

   public Score() {}

   public void setMovie(Movie movie) {
      id.setMovie(movie);
   }

   public Movie getMovie() {
      return id.getMovie();
   }

   public void setUser(User user) {
      id.setUser(user);
   }

   public User getUser() {
      return id.getUser();
   }

   public ScorePK getId() {
      return id;
   }

   public void setId(ScorePK id) {
      this.id = id;
   }

   public Double getValue() {
      return value;
   }

   public void setValue(Double value) {
      this.value = value;
   }

}
