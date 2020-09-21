package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

public interface CmsPageControllerApi {
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
