package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_LINE_OF_BIZ")
public class FtmLineOfBusiness {

    @Id
    @Column(name = "ID")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LINE_OF_BIZ_ID")
    private LineOfBusiness lineOfBusiness;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "VERSION")
    private Integer version;

    public FtmLineOfBusiness() {
        // JPA ??
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LineOfBusiness getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(LineOfBusiness lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "FtmLineOfBusiness{" +
                "id=" + id +
                ", lineOfBusiness=" + lineOfBusiness +
                ", shortName='" + shortName + '\'' +
                ", version=" + version +
                '}';
    }
}
