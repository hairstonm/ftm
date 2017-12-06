package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FTM_FEED_TYPES")
public class FtmFeedType {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "FEED_TYPE")
    private String feedType;

    public FtmFeedType() {
        // This is because of JPA.
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

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    @Override
    public String toString() {
        return "FtmFeedType{" +
                "id=" + id +
                ", version=" + version +
                ", feedType='" + feedType + '\'' +
                '}';
    }
}
