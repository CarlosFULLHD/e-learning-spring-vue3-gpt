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
@Table(name = "Feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_feedback")
    private Long idFeedback;

    @Column(name = "id_lesson")
    private Integer idLesson;

    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "feedback_text")
    private String feedbackText;

    @Column(name = "feedback_date")
    private Timestamp feedbackDate;

}
