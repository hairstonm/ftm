package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LINE_OF_BIZ")
public class LineOfBusiness {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "LINE_OF_BIZ")
    private String lineOfBiz;

    @Column(name = "LOZ")
    //TODO: Could not understand what's this.
    private String loz;

    public LineOfBusiness() {
        // JPA ???--!!
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

    public String getLineOfBiz() {
        return lineOfBiz;
    }

    public void setLineOfBiz(String lineOfBiz) {
        this.lineOfBiz = lineOfBiz;
    }

    public String getLoz() {
        return loz;
    }

    public void setLoz(String loz) {
        this.loz = loz;
    }

    @Override
    public String toString() {
        return "LineOfBusiness{" +
                "id=" + id +
                ", version=" + version +
                ", lineOfBiz='" + lineOfBiz + '\'' +
                ", loz='" + loz + '\'' +
                '}';
    }
}
