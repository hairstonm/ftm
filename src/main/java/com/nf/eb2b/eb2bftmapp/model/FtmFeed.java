package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_FEEDS")
public class FtmFeed {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FEED_ID")
    private String feedId;

    @Column(name = "DIRECTION")
    private String direction;

    @Column(name = "APPLICATION")
    private String application;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SENT_FROM_ID")
    private FtmBusinessPartner sentFromBusinessPartner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MEDIUM_ID")
    private FtmBusinessPartner mediumBusinessPartner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECEIVED_BY_ID")
    private FtmBusinessPartner receiveByBusinessPartner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FEED_TYPE_ID")
    private FtmFeedType ftmFeedType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FREQUENCY_ID")
    private FtmFrequency ftmFrequency;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LINE_OF_BIZ_ID")
    private FtmLineOfBusiness ftmLineOfBusiness;

    @Column(name = "VERSION")
    private Integer version;

    public FtmFeed() {
        // This is because of JPA.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public FtmBusinessPartner getSentFromBusinessPartner() {
        return sentFromBusinessPartner;
    }

    public void setSentFromBusinessPartner(FtmBusinessPartner sentFromBusinessPartner) {
        this.sentFromBusinessPartner = sentFromBusinessPartner;
    }

    public FtmBusinessPartner getMediumBusinessPartner() {
        return mediumBusinessPartner;
    }

    public void setMediumBusinessPartner(FtmBusinessPartner mediumBusinessPartner) {
        this.mediumBusinessPartner = mediumBusinessPartner;
    }

    public FtmBusinessPartner getReceiveByBusinessPartner() {
        return receiveByBusinessPartner;
    }

    public void setReceiveByBusinessPartner(FtmBusinessPartner receiveByBusinessPartner) {
        this.receiveByBusinessPartner = receiveByBusinessPartner;
    }

    public FtmFeedType getFtmFeedType() {
        return ftmFeedType;
    }

    public void setFtmFeedType(FtmFeedType ftmFeedType) {
        this.ftmFeedType = ftmFeedType;
    }

    public FtmFrequency getFtmFrequency() {
        return ftmFrequency;
    }

    public void setFtmFrequency(FtmFrequency ftmFrequency) {
        this.ftmFrequency = ftmFrequency;
    }

    public FtmLineOfBusiness getFtmLineOfBusiness() {
        return ftmLineOfBusiness;
    }

    public void setFtmLineOfBusiness(FtmLineOfBusiness ftmLineOfBusiness) {
        this.ftmLineOfBusiness = ftmLineOfBusiness;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "FtmFeed{" +
                "id=" + id +
                ", feedId='" + feedId + '\'' +
                ", direction='" + direction + '\'' +
                ", application='" + application + '\'' +
                ", sentFromBusinessPartner=" + sentFromBusinessPartner +
                ", mediumBusinessPartner=" + mediumBusinessPartner +
                ", receiveByBusinessPartner=" + receiveByBusinessPartner +
                ", ftmFeedType=" + ftmFeedType +
                ", ftmFrequency=" + ftmFrequency +
                ", ftmLineOfBusiness=" + ftmLineOfBusiness +
                ", version=" + version +
                '}';
    }
}
