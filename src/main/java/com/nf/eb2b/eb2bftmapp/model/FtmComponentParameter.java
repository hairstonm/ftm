package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_FEED_COMP_PARAMS")
public class FtmComponentParameter {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "FTM_FEED_COMP_ID")
    private FtmFeedComponent ftmFeedComponent;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private String value;

    public FtmComponentParameter() {
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

    public FtmFeedComponent getFtmFeedComponent() {
        return ftmFeedComponent;
    }

    public void setFtmFeedComponent(FtmFeedComponent ftmFeedComponent) {
        this.ftmFeedComponent = ftmFeedComponent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FtmComponentParameter{" +
                "id=" + id +
                ", version=" + version +
                ", ftmFeedComponent=" + ftmFeedComponent +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
