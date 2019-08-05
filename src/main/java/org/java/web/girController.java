package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:shuxiang
 * @date:2019/8/5 {HOUR}:{MTNUTE}
 * @Description:
 */
@RestController
public class girController {
   @GetMapping("init")
    public String init(){
        return "holle...8888";
    }


}
