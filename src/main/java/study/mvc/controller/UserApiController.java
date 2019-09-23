package study.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author playjun
 * @since 2019 09 23
 */
@RestController
public class UserApiController {

    private final static Logger logger = LoggerFactory.getLogger(UserApiController.class);

    public UserApiController() {
        logger.info("user api controller instantiate");
    }

    @RequestMapping("/api/hello")
    public String helloMvc() {
        logger.info("hello api entrance");
        return "hello MVC";
    }

}
