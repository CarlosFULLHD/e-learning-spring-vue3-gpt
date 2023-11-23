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

}
