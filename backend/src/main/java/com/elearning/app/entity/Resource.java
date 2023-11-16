package com.elearning.app.entity;

import javakarta.persistence.*;

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

    public Resource() {
    }

    public Long getIdResource() {
        return idResource;
    }

    public void setIdResource(Long idResource) {
        this.idResource = idResource;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceLink() {
        return resourceLink;
    }

    public void setResourceLink(String resourceLink) {
        this.resourceLink = resourceLink;
    }

    public String getResourceImg() {
        return resourceImg;
    }

    public void setResourceImg(String resourceImg) {
        this.resourceImg = resourceImg;
    }

    @Override
    public String toString() {
        return "Resource [idResource=" + idResource + ", idSubject=" + idSubject + ", resourceType=" + resourceType
                + ", resourceName=" + resourceName + ", resourceLink=" + resourceLink + ", resourceImg=" + resourceImg
                + "]";
    }
}

