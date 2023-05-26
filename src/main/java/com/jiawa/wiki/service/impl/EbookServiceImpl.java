package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookVo;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.service.EbookService;
import com.jiawa.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

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
        if(!ObjectUtils.isEmpty(vo.getName())){
            create.andNameLike("%"+vo.getName()+"%");
        }
        List<Ebook> list = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> ebookResps = CopyUtil.copyList(list,EbookResp.class);
        return ebookResps;
    }
}
