package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_ROUTER_CONFIG")
public class FtmRouterConfig {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_ROUTERS_ID")
    private FtmRouter ftmRouter;

    @Column(name = "DESTINATION")
    private String destination;

    public FtmRouterConfig() {
        // JPA??
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

    public FtmRouter getFtmRouter() {
        return ftmRouter;
    }

    public void setFtmRouter(FtmRouter ftmRouter) {
        this.ftmRouter = ftmRouter;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "FtmRouterConfig{" +
                "id=" + id +
                ", version=" + version +
                ", ftmRouter=" + ftmRouter +
                ", destination='" + destination + '\'' +
                '}';
    }
}
