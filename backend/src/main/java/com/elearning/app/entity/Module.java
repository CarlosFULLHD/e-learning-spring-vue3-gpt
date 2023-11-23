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
@Table(name = "Modules")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_module")
    private Long idModule;

    @Column(name = "id_subject")
    private Integer idSubject;

    @Column(name = "module_name")
    private String moduleName;

}
