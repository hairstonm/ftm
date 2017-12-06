package com.nf.eb2b.eb2bftmapp.repository;

import com.nf.eb2b.eb2bftmapp.model.DataFeedTransferFrequency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DataFeedTransferFrequencyRepository extends JpaRepository<DataFeedTransferFrequency, Integer>{
}
