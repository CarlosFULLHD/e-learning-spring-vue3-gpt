package com.elearning.app.entity;

import javakarta.persistence.*;

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

    public Module() {
    }

    public Long getIdModule() {
        return idModule;
    }

    public void setIdModule(Long idModule) {
        this.idModule = idModule;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public String toString() {
        return "Module [idModule=" + idModule + ", idSubject=" + idSubject + ", moduleName=" + moduleName + "]";
    }
}
