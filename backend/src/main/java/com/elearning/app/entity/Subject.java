package com.elearning.app.entity;

import javakarta.persistence.*;

@Entity
@Table(name = "Subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subject")
    private Long idSubject;

    @Column(name = "img_link")
    private String imgLink;

    @Column(name = "title_subject")
    private String titleSubject;

    @Column(name = "description_subject")
    private String descriptionSubject;

    @Column(name = "welcome_text")
    private String welcomeText;

    @Column(name = "importance")
    private String importance;

    @Column(name = "intended_for")
    private String intendedFor;

    @Column(name = "learnings_fromthis_subject")
    private String learningsFromThisSubject;

    @Column(name = "roadmap_img")
    private String roadmapImg;

    public Subject() {
    }

    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getTitleSubject() {
        return titleSubject;
    }

    public void setTitleSubject(String titleSubject) {
        this.titleSubject = titleSubject;
    }

    public String getDescriptionSubject() {
        return descriptionSubject;
    }

    public void setDescriptionSubject(String descriptionSubject) {
        this.descriptionSubject = descriptionSubject;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getIntendedFor() {
        return intendedFor;
    }

    public void setIntendedFor(String intendedFor) {
        this.intendedFor = intendedFor;
    }

    public String getLearningsFromThisSubject() {
        return learningsFromThisSubject;
    }

    public void setLearningsFromThisSubject(String learningsFromThisSubject) {
        this.learningsFromThisSubject = learningsFromThisSubject;
    }

    public String getRoadmapImg() {
        return roadmapImg;
    }

    public void setRoadmapImg(String roadmapImg) {
        this.roadmapImg = roadmapImg;
    }

    @Override
    public String toString() {
        return "Subject [idSubject=" + idSubject + ", imgLink=" + imgLink + ", titleSubject=" + titleSubject
                + ", descriptionSubject=" + descriptionSubject + ", welcomeText=" + welcomeText + ", importance="
                + importance + ", intendedFor=" + intendedFor + ", learningsFromThisSubject=" + learningsFromThisSubject
                + ", roadmapImg=" + roadmapImg + "]";
    }
}
