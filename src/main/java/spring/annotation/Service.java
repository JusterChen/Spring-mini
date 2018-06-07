package spring.annotation;

import java.lang.annotation.*;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/5/30 18:47
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {

    String value() default "";
}
