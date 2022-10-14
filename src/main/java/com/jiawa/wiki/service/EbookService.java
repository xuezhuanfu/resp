package com.jiawa.wiki.service;

import com.jiawa.wiki.req.EbookVo;
import com.jiawa.wiki.resp.EbookResp;

import java.util.List;

public interface EbookService {
    List<EbookResp> list(EbookVo vo);
}
