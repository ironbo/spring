package com.bobo.controller;

import com.bobo.feign.IFeignClient;
import com.bobo.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjiangbo
 * @date 2021-03-28 1:55
 * @description TODO
 */
@RestController
public class FeignController {

  @GetMapping("/hellofeign")
  @ResponseBody
  public Object helloFeign(String name) {
    return name + " hello feign";
  }

  @PostMapping("/pojofeign")
  @ResponseBody
  public Object pojoTest(@RequestBody LoginUser loginUser) {
    return loginUser;
  }
}
