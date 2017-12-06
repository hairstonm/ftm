package com.nf.eb2b.eb2bftmapp.projection;

import com.nf.eb2b.eb2bftmapp.model.FtmComponentParameter;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ftmFeedCompParamsData", types = {FtmComponentParameter.class})
public interface FtmFeedCompParamsProjection {

   Integer getId() ;

   String getVersion();

   String getName();

   String getValue();
}
