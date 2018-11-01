package com.mr.controller;

import com.mr.model.TMallProduct;
import com.mr.model.TMallSkuVO;
import com.mr.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by YinShuai on 2018/10/31.
 */
@Controller
public class SkuController {

    @Autowired
    private SkuService skuService;

    //查询
    @RequestMapping("toAddSkuPage")
    public String toAddSkuPage(Integer flbh1, Integer flbh2, ModelMap map){
        map.put("flbh1",flbh1);
        map.put("flbh2",flbh2);

        return "sku-add";
    }

    //查询sku 通过tmId  flbh2
    @ResponseBody
    @RequestMapping("selectSpu")
    public List<TMallProduct> selectSpu(TMallProduct spu){
        List<TMallProduct> list = skuService.selectSpu(spu);
        return list;
    }

    //新增sku skuAttrValue
    @RequestMapping("saveSku")
    public ModelAndView saveSku(TMallSkuVO skuVO, Integer flbh1, Integer flbh2){
        skuService.saveSku(skuVO);

        ModelAndView mv = new ModelAndView();
        mv.addObject("flbh1",flbh1);
        mv.addObject("flbh2",flbh2);
        mv.setViewName("redirect:toAddSkuPage.do");
        return mv;
    }

}
