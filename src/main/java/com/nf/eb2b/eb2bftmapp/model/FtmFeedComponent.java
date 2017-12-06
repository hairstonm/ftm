package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FTM_FEED_COMPONENTS")
public class FtmFeedComponent {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_FEEDS_ID")
    private FtmFeed ftmFeed;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_COMPONENTS_ID")
    private FtmComponent ftmComponent;

    @OneToMany(mappedBy = "ftmFeedComponent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FtmComponentParameter> ftmComponentParameters;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "COMPONENT_RANK")
    private Integer componentRank;

    public FtmFeedComponent() {
        // JPA??
    }

    public List<FtmComponentParameter> getFtmComponentParameters() {
        return ftmComponentParameters;
    }

    public void setFtmComponentParameters(List<FtmComponentParameter> ftmComponentParameters) {
        this.ftmComponentParameters = ftmComponentParameters;
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

    public FtmComponent getFtmComponent() {
        return ftmComponent;
    }

    public void setFtmComponent(FtmComponent ftmComponent) {
        this.ftmComponent = ftmComponent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getComponentRank() {
        return componentRank;
    }

    public void setComponentRank(Integer componentRank) {
        this.componentRank = componentRank;
    }

    @Override
    public String toString() {
        return "FtmFeedComponent{" +
                "id=" + id +
                ", version=" + version +
                ", ftmFeed=" + ftmFeed +
                ", ftmComponent=" + ftmComponent +
                ", type='" + type + '\'' +
                ", componentRank=" + componentRank +
                '}';
    }
}
