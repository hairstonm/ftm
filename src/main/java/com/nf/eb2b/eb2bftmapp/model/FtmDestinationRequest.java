package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_DESTINATION_REQUESTS")
public class FtmDestinationRequest{

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_FEEDS_ID")
    private FtmFeed ftmFeed;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "DESTINATION")
    private String destination;

    @Column(name = "ACTIVE")
    private String active;

    @Column(name = "PRIORITY")
    private Integer priority;

    public FtmDestinationRequest() {
        // JPA???
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

    public FtmFeed getFtmFeed() {
        return ftmFeed;
    }

    public void setFtmFeed(FtmFeed ftmFeed) {
        this.ftmFeed = ftmFeed;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "FtmDestinationRequest{" +
                "id=" + id +
                ", version=" + version +
                ", ftmFeed=" + ftmFeed +
                ", fileType='" + fileType + '\'' +
                ", destination='" + destination + '\'' +
                ", active='" + active + '\'' +
                ", priority=" + priority +
                '}';
    }
}
