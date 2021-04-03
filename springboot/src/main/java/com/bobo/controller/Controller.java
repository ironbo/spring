package com.bobo.controller;

import com.bobo.feign.IFeignClient;
import com.bobo.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjiangbo
 * @date 2021-03-28 1:55
 * @description TODO
 */
@RestController
public class Controller {

  @Autowired
  IFeignClient feignClient;

  @GetMapping("/hello")
  @ResponseBody
  public Object hello(String name) {
    return feignClient.hello(name);

  }

  @PostMapping("/str1")
  @ResponseBody
  public Object strTestWithNone(String name) {
    return feignClient.pojoTest(new LoginUser(name));
  }

  @PostMapping("/pojo1")
  @ResponseBody
  public Object pojo(LoginUser loginUser) {
    return feignClient.pojoTest(loginUser);
  }


  @PostMapping("/str2")
  @ResponseBody
  public Object strTestWithAnnotationRequestParam(@RequestParam String name) {
    return feignClient.pojoTest(new LoginUser(name));
  }

  @PostMapping("/pojo2")
  @ResponseBody
  public Object pojoWithAnnotation(@RequestParam LoginUser loginUser) {
    return feignClient.pojoTest(loginUser);
  }

  @PostMapping("/str3")
  @ResponseBody
  public Object strTestWithRequestBody(@RequestBody String name) {
    return feignClient.pojoTest(new LoginUser(name));
  }

  @PostMapping("/str4")
  @ResponseBody
  public Object strsTestWithRequestBody(@RequestBody String name, @RequestBody String sex) {
    return feignClient.pojoTest(new LoginUser(name));
  }

  @PostMapping("/pojo3")
  @ResponseBody
  public Object pojoTestWithAnnotationRequestParam(@RequestBody LoginUser loginUser) {
    return feignClient.pojoTest(loginUser);
  }

  @PostMapping("/pojo4")
  @ResponseBody
  public Object pojosTestWithAnnotationRequestParam
      (@RequestBody LoginUser loginUser, @RequestBody LoginUser loginUser2) {
    return feignClient.pojoTest(loginUser2);
  }
}
