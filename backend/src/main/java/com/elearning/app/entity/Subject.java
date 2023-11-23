package com.elearning.app.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

}
