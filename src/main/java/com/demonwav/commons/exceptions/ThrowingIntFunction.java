/*
 * Copyright 2018 Kyle Wood (DemonWav)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.demonwav.commons.exceptions;

import java.util.function.IntFunction;

@FunctionalInterface
public interface ThrowingIntFunction<R> extends IntFunction<R> {

    @Override
    default R apply(int value) {
        try {
            return applyThrowing(value);
        } catch (final Throwable throwable) {
            throw Throwing.throwAnyways(throwable);
        }
    }

    R applyThrowing(int value) throws Throwable;
}
