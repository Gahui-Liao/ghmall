package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AddressDto extends BaseDto {
    private Integer addressId;

    private Integer userId;

    private Integer addressCountryId;

    private Integer addressProvinceId;

    private Integer addressCityId;

    private Integer addressDistrictId;

    private String addressDetail;

    private String addressContact;

    private String addressPhone;
}
