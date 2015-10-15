package com.example.dao.config;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 * Created by tada on 2015/10/12.
 */
@AnnotateWith(annotations = {
        @Annotation(target = AnnotationTarget.CLASS, type = Dependent.class)
        , @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Inject.class)
})
public @interface InjectConfig {
}
