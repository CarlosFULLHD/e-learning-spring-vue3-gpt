package com.elearning.app.entity;

import javakarta.persistence.*;
import java.sql.Timestamp;

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

    public Feedback() {
    }

    public Long getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(Long idFeedback) {
        this.idFeedback = idFeedback;
    }

    public Integer getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(Integer idLesson) {
        this.idLesson = idLesson;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public Timestamp getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Timestamp feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public String toString() {
        return "Feedback [idFeedback=" + idFeedback + ", idLesson=" + idLesson + ", idUser=" + idUser
                + ", feedbackText=" + feedbackText + ", feedbackDate=" + feedbackDate + "]";
    }
}
