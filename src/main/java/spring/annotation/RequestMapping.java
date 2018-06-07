package spring.annotation;

import java.lang.annotation.*;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/5/30 18:43
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {

    String value() default "";

}
