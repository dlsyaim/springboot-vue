package ks.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dlsyaim on 2018/3/11.
 */
/*@Controller
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private  String content;

    @Autowired
    private GirlProperties girlProperties;
//    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(){
        //return "Hello Spring Boot!";
        return girlProperties.getCupSize();
       // return "index";
        //return  content;
    }

    @RequestMapping(value = "/saypar/{id}",method = RequestMethod.GET)
    public String saypar(@PathVariable("id") Integer id){
        //return "Hello Spring Boot!";
        return "id:"+id;
        // return "index";
        //return  content;
    }

    //@RequestMapping(value = "/saypar1",method = RequestMethod.GET)
    @GetMapping(value = "/saypar1")
    //public String saypar1(@RequestParam("id") Integer id2){
    public String saypar1(@RequestParam(value="id",required = false,defaultValue = "0") Integer id2){
        //return "Hello Spring Boot!";
        return "id:"+id2;
        // return "index";
        //return  content;
    }
}
