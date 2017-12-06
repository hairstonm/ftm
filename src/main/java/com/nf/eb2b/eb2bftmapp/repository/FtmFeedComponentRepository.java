package com.nf.eb2b.eb2bftmapp.repository;

import com.nf.eb2b.eb2bftmapp.model.FtmFeedComponent;
import com.nf.eb2b.eb2bftmapp.projection.FeedWithCompParamsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = FeedWithCompParamsProjection.class)
public interface FtmFeedComponentRepository extends JpaRepository<FtmFeedComponent, Integer>{

    /**
     * select ff.feed_id, ffcp.value as file_mask
     from ftm_feeds ff, ftm_feed_components ffc, ftm_feed_comp_params ffcp
     where ff.id = ffc.ftm_feeds_id
     and ffc.id = ffcp.FTM_FEED_COMP_ID
     and ff.feed_id like '%vision%'
     and ffcp.name = 'fileMask';
     * @param name
     * @param feedId
     * @return
     */
    List<FtmFeedComponent> findByFtmComponentParameters_NameAndFtmFeed_FeedIdContaining(@Param("name") String name, @Param("feedId") String feedId);
}
