package com.example.dao.qualifier;

import javax.inject.Qualifier;
import java.lang.annotation.*;

/**
 * Created by tada on 2015/10/15.
 */
@Qualifier
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DerbyQualifier {
}
