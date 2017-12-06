package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_ROUTER_ATTRIBUTES")
public class FtmRouterAttribute {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_ROUTERS_ID")
    private FtmRouter ftmRouter;

    @Column(name = "PARAM_NAME")
    private String paramName;

    @Column(name = "REQUIRED")
    private String required;

    public FtmRouterAttribute() {
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

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return "FtmRouterAttribute{" +
                "id=" + id +
                ", version=" + version +
                ", ftmRouter=" + ftmRouter +
                ", paramName='" + paramName + '\'' +
                ", required='" + required + '\'' +
                '}';
    }
}
