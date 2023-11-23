package com.elearning.app.entity;


import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

}
