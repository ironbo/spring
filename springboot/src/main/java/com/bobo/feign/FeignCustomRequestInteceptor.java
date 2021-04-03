package com.bobo.feign;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FeignCustomRequestInteceptor implements RequestInterceptor {

  @Autowired
  private ObjectMapper objectMapper;

  @Override
  public void apply(RequestTemplate template) {
    log.info("feign拦截器：{}", template.headers());
//    if (HttpMethod.GET.toString().equals(template.method()) && template.requestBody() != null) {
//      //feign 不支持GET方法传输POJO 转换成json，再换成query
//      try {
//        Map<String, Collection<String>> map = objectMapper
//            .readValue(template.bodyTemplate(),
//                new TypeReference<Map<String, Collection<String>>>() {
//
//                });
//        template.queries(map);
//      } catch (IOException e) {
//        log.error("cause exception", e);
//      }
//    }
  }
}