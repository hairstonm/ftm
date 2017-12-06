package com.nf.eb2b.eb2bftmapp.projection;

import com.nf.eb2b.eb2bftmapp.model.FtmFeed;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ftmFeedData", types = {FtmFeed.class})
public interface FtmFeedProjection {

   String getFeedId() ;

   String getVersion();

   String getDirection();

   String getApplication();
}
