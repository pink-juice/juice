package com.pink.juice.juicecommon.fuckif;

import java.lang.annotation.*;

/**
 * @author yuqingyu
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FuckIfType {
    String type();
}
