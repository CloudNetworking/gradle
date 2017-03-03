/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.provider;

import org.gradle.api.Buildable;
import org.gradle.api.Incubating;
import org.gradle.api.Nullable;

/**
 * A container object which provides a value of a specific type. The value can be retrieved by the method {@code get()}.
 *
 * @param <T> Type of value represented by provider
 * @since 3.5
 */
@Incubating
public interface Provider<T> extends Buildable {

    /**
     * If a value is present in this provider, returns the value, otherwise throws {@code java.lang.IllegalStateException}.
     *
     * @return Value
     * @throws IllegalStateException if there is no value present
     */
    T get();

    /**
     * Returns {@code true} if there is a value present, otherwise {@code false}.
     *
     * @return {@code true} if there is a value present, otherwise {@code false}
     */
    boolean isPresent();
}