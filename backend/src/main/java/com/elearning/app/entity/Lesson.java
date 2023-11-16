package com.elearning.app.entity;

import javakarta.persistence.*;

@Entity
@Table(name = "Lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lesson")
    private Long idLesson;

    @Column(name = "id_module")
    private Integer idModule;

    @Column(name = "lesson_name")
    private String lessonName;

    @Column(name = "link_ytvideo")
    private String linkYtVideo;

    @Column(name = "description_lesson")
    private String descriptionLesson;

    public Lesson() {
    }

    public Long getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(Long idLesson) {
        this.idLesson = idLesson;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLinkYtVideo() {
        return linkYtVideo;
    }

    public void setLinkYtVideo(String linkYtVideo) {
        this.linkYtVideo = linkYtVideo;
    }

    public String getDescriptionLesson() {
        return descriptionLesson;
    }

    public void setDescriptionLesson(String descriptionLesson) {
        this.descriptionLesson = descriptionLesson;
    }

    @Override
    public String toString() {
        return "Lesson [idLesson=" + idLesson + ", idModule=" + idModule + ", lessonName=" + lessonName
                + ", linkYtVideo=" + linkYtVideo + ", descriptionLesson=" + descriptionLesson + "]";
    }
}
