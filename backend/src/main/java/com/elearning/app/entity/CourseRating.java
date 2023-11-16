package com.elearning.app.entity;

import javakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CourseRatings")
public class CourseRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rating")
    private Long idRating;

    @Column(name = "id_subject")
    private Integer idSubject;

    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "review_text")
    private String reviewText;

    @Column(name = "review_date")
    private Timestamp reviewDate;

    public CourseRating() {
    }

    public Long getIdRating() {
        return idRating;
    }

    public void setIdRating(Long idRating) {
        this.idRating = idRating;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "CourseRating [idRating=" + idRating + ", idSubject=" + idSubject + ", idUser=" + idUser + ", rating="
                + rating + ", reviewText=" + reviewText + ", reviewDate=" + reviewDate + "]";
    }
}
 {
    
}
