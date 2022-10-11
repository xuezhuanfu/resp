package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookServiceImpl implements EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    @Override
    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
