package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import com.gahui.ghmall.data.dto.CategoryDto;
import com.gahui.ghmall.data.dto.NoticeDto;
import com.gahui.ghmall.data.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
@Slf4j
@RestController
@RequestMapping("/category")
public class AppCategoryController {

    @Resource
    CategoryService categoryService;

    @GetMapping("/list")
    public GhResponse listCategoryByCategoryIdAsc() {
        GhResponse<List<CategoryDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        List<CategoryDto> categoryDtos = categoryService.listCategoryByCategoryIdAsc();
        if (categoryDtos != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, categoryDtos);
        }
        log.info("listCategoryByCategoryIdAsc==={}", response);
        return response;
    }

}
