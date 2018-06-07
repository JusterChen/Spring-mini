package spring.annotation;

import java.lang.annotation.*;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/5/30 18:47
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {

    String value() default "";
}
