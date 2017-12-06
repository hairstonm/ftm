package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_FREQUENCY")
public class FtmFrequency {

    @Id
    @Column(name = "ID")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DATAFEED_TRANSFER_FREQUENCY_ID")
    private DataFeedTransferFrequency dataFeedTransferFrequency;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "VERSION")
    private Integer version;

    public FtmFrequency() {
        // JPA??
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DataFeedTransferFrequency getDataFeedTransferFrequency() {
        return dataFeedTransferFrequency;
    }

    public void setDataFeedTransferFrequency(DataFeedTransferFrequency dataFeedTransferFrequency) {
        this.dataFeedTransferFrequency = dataFeedTransferFrequency;
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
        return "FtmFrequency{" +
                "id=" + id +
                ", dataFeedTransferFrequency=" + dataFeedTransferFrequency +
                ", shortName='" + shortName + '\'' +
                ", version=" + version +
                '}';
    }
}
