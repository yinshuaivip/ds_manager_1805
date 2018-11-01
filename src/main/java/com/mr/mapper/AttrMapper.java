package com.mr.mapper;

import com.mr.model.OBJECTTMallAttr;

import java.util.List;
import java.util.Map;

/**
 * Created by YinShuai on 2018/10/30.
 */
public interface AttrMapper {

    void saveAttr(OBJECTTMallAttr attr);

    void saveValue(Map<String, Object> valueMap);

    List<OBJECTTMallAttr> findAttrByclass2(Integer flbh2);
}
