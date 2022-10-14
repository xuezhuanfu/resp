package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.req.EbookVo;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Autowired
    private EbookService ebookService;

    @GetMapping(value = "list")
    public CommonResp helloWord(EbookVo vo){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(vo);
        resp.setContent(list);
        return resp;
    }
}
