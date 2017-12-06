package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_COMP_ATTRIBUTES")
public class FtmComponentAttribute {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FTM_COMPONENTS_ID")
    private FtmComponent ftmComponent;

    @Column(name = "PARAM_NAME")
    private String paramName;

    @Column(name = "REQUIRED")
    private String required;

    public FtmComponentAttribute() {
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

    public FtmComponent getFtmComponent() {
        return ftmComponent;
    }

    public void setFtmComponent(FtmComponent ftmComponent) {
        this.ftmComponent = ftmComponent;
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
        return "FtmComponentAttribute{" +
                "id=" + id +
                ", version=" + version +
                ", ftmComponent=" + ftmComponent +
                ", paramName='" + paramName + '\'' +
                ", required='" + required + '\'' +
                '}';
    }
}
