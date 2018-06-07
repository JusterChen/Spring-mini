package spring.annotation;

import java.lang.annotation.*;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/5/30 18:45
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowried {

    String value() default "";

}
