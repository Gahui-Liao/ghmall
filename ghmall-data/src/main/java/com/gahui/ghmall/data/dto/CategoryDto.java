package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class CategoryDto extends BaseDto {
    private Integer categoryId;

    private String categoryCode;

    private String categoryBrief;
}
