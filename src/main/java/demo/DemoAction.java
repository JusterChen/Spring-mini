package demo;

import demo.service.IDemoService;
import spring.annotation.Autowried;
import spring.annotation.Controller;
import spring.annotation.RequestMapping;
import spring.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/5/30 22:19
 */
@Controller
@RequestMapping("/demo")
public class DemoAction {

    @Autowried
    private IDemoService demoService;

    @RequestMapping("/query.json")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @RequestParam("name") String name){
        String result = demoService.get(name);
        System.out.println(result);

    }

}
