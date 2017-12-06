package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FTM_ROUTERS")
public class FtmRouter {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "CLASS_NAME")
    private String className;

    @Column(name = "DESCRIPTION")
    private String description;

    public FtmRouter() {
        // JPA
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FtmRouter{" +
                "id=" + id +
                ", version=" + version +
                ", className='" + className + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
