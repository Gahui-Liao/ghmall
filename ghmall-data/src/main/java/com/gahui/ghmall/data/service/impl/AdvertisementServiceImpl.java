package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.AdvertisementDto;
import com.gahui.ghmall.data.entity.GhAdvertisementExample;
import com.gahui.ghmall.data.mapper.GhAdvertisementMapper;
import com.gahui.ghmall.data.service.AdvertisementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/
@Service("advertisementService")
public class AdvertisementServiceImpl implements AdvertisementService {

    @Resource
    GhAdvertisementMapper advertisementMapper;

    @Override
    public List<AdvertisementDto> listAdvertisementBySeqDesc() {
        GhAdvertisementExample example = new GhAdvertisementExample();
        example.createCriteria().andStatusEqualTo(Constant.STATUS_EFF);
        example.setOrderByClause(Constant.ADVERTISEMENT_ORDER_BY_SEQ_DESC);
        return GhCopyUtil.copyListProperties(advertisementMapper.selectByExample(example), AdvertisementDto.class);
    }
}
