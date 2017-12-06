package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FTM_COMPONENTS")
public class FtmComponent {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "CLASS_NAME")
    private String className;

    public FtmComponent() {
        // JPA?
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "FtmComponent{" +
                "id=" + id +
                ", version=" + version +
                ", type='" + type + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
