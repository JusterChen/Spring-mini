package demo.service.impl;

import demo.service.IDemoService;
import spring.annotation.Service;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/5/30 22:24
 */
@Service
public class DemoService implements IDemoService {

    @Override
    public String get(String name) {
        return "My name is " + name;
    }
}
