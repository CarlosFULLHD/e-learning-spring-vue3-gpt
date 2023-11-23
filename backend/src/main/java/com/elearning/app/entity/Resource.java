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
@Table(name = "Resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resource")
    private Long idResource;

    @Column(name = "id_subject")
    private Integer idSubject;

    @Column(name = "resource_type")
    private String resourceType;

    @Column(name = "resource_name")
    private String resourceName;

    @Column(name = "resource_link")
    private String resourceLink;

    @Column(name = "resource_img")
    private String resourceImg;


}

