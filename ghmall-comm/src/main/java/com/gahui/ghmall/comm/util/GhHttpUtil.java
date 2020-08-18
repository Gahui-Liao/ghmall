package com.gahui.ghmall.comm.util;

import com.alibaba.fastjson.JSONObject;
import com.gahui.ghmall.comm.constant.Constant;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

import static com.gahui.ghmall.comm.constant.Constant.RSP_BODY;
import static com.gahui.ghmall.comm.constant.Constant.RSP_HEAD;

/**
 * @description: http请求工具类
 * @author: liaojiaxi
 * @date: 2020/8/15
 **/
public class GhHttpUtil {

    @Bean
    public static RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * get请求
     *
     * @param url
     * @param headers
     * @param params
     * @return
     */
    public static JSONObject get(String url, Map<String, String> headers, Map<String, String> params) {
        HttpEntity<String> requestEntity = new HttpEntity<>(null, buidHeaders(headers));
        ResponseEntity responseEntity = restTemplate().exchange(buidFinalUrl(url, params), HttpMethod.GET, requestEntity, JSONObject.class);
        return buidResponse(responseEntity);
    }

    /**
     * post请求
     *
     * @param url
     * @param data
     * @param headers
     * @return
     */
    public static JSONObject post(String url, JSONObject data, Map<String, String> headers) {
        HttpEntity<JSONObject> requestEntity = new HttpEntity<>(data, buidHeaders(headers));
        ResponseEntity responseEntity = restTemplate().exchange(url, HttpMethod.POST, requestEntity, JSONObject.class);
        return buidResponse(responseEntity);
    }

    private static JSONObject buidResponse(ResponseEntity responseEntity) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Constant.RSP_CODE, responseEntity.getStatusCodeValue());
        jsonObject.put(Constant.RSP_HEAD, responseEntity.getHeaders());
        jsonObject.put(Constant.RSP_BODY, responseEntity.getBody());
        return jsonObject;
    }

    /**
     * 组装http请求头
     *
     * @param headers
     * @return
     */
    private static HttpHeaders buidHeaders(Map<String, String> headers) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Accept", "application/json");
        httpHeaders.add("Content-Encoding", "UTF-8");
        httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
        for (String s : headers.keySet()) {
            httpHeaders.add(s, headers.get(s));
        }
        return httpHeaders;
    }

    /**
     * 组装最终url
     *
     * @param url
     * @param params
     * @return
     */
    private static String buidFinalUrl(String url, Map<String, String> params) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        for (String s : params.keySet()) {
            builder.queryParam(s, params.get(s));
        }
        return builder.build().toString();
    }
}
