package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_ROUTER_PARAMS")
public class FtmRouterParameter {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_ROUTER_CONFIG_ID")
    private FtmRouterConfig ftmRouterConfig;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private String value;

    public FtmRouterParameter() {
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

    public FtmRouterConfig getFtmRouterConfig() {
        return ftmRouterConfig;
    }

    public void setFtmRouterConfig(FtmRouterConfig ftmRouterConfig) {
        this.ftmRouterConfig = ftmRouterConfig;
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
        return "FtmRouterParameter{" +
                "id=" + id +
                ", version=" + version +
                ", ftmRouterConfig=" + ftmRouterConfig +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
