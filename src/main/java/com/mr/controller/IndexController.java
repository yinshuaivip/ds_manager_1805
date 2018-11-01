package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by YinShuai on 2018/10/29.
 */
@Controller
public class IndexController {

    @RequestMapping("toSpuPage")
    public String toSpuPage(){
        return "spu";
    }

    @RequestMapping("toAttrPage")
    public String toAttrPage(){
        return "attr";
    }

    @RequestMapping("toSkuPage")
    public String toSkuPage(){
        return "sku";
    }
}
