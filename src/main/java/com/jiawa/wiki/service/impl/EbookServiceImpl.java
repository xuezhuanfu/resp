package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookVo;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.service.EbookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookServiceImpl implements EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    @Override
    public List<EbookResp> list(EbookVo vo) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria create = ebookExample.createCriteria();
        create.andNameLike("%"+vo.getName()+"%");

        List<EbookResp> ebookResps = new ArrayList<>();
        List<Ebook> list = ebookMapper.selectByExample(ebookExample);
        for (Ebook ebook : list){
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            ebookResps.add(ebookResp);
        }
        return ebookResps;
    }
}
