package com.bobo.feign;

import com.bobo.model.LoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huangjiangbo
 * @date 2021-03-28 8:04
 * @description TODO
 */
@FeignClient(value="feignTest",url = "${feign.client.url}")
public interface IFeignClient {

  @GetMapping(value = "/hellofeign")
  public String hello(@RequestParam String name);

  @PostMapping(value = "/pojofeign")
  public String pojoTest(@RequestBody LoginUser loginUser);
}
