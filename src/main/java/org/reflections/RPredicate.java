package org.reflections;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;


public abstract class RPredicate<U> implements Predicate<U> {
    public boolean test(@Nullable U input) {
        return this.apply(input);
    }
}

