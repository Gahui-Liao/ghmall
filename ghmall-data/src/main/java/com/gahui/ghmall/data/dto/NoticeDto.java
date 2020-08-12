package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class NoticeDto extends BaseDto {
    private Integer noticeId;

    private String noticeTitle;

    private String noticeDetail;

    private Date noticeEffTime;

    private Date noticeExpTime;

    private Byte noticeSeq;
}
