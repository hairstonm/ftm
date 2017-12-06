package com.nf.eb2b.eb2bftmapp.projection;

import com.nf.eb2b.eb2bftmapp.model.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "feedWithCompParamsData", types = {FtmFeedComponent.class})
public interface FeedWithCompParamsProjection {

   Integer getVersion();

   FtmFeedProjection getFtmFeed();

   List<FtmFeedCompParamsProjection> getFtmComponentParameters();
}
