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

public final class Throwing {

    private Throwing() {}

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> RuntimeException throwAnyways(final Throwable t) throws T {
        throw (T) t;
    }

    public static <T, U> ThrowingBiConsumer<T, U> wrapBiConsumer(final ThrowingBiConsumer<T, U> consumer) {
        return consumer;
    }

    public static <T, U, R> ThrowingBiFunction<T, U, R> wrapBiFunction(final ThrowingBiFunction<T, U, R> function) {
        return function;
    }

    public static <T> ThrowingBinaryOperator<T> wrapBinaryOperator(final ThrowingBinaryOperator<T> operator) {
        return operator;
    }

    public static <T, U> ThrowingBiPredicate<T, U> wrapBiPredicate(final ThrowingBiPredicate<T, U> predicate) {
        return predicate;
    }

    public static ThrowingBooleanSupplier wrapBooleanSupplier(final ThrowingBooleanSupplier supplier) {
        return supplier;
    }

    public static <T> ThrowingConsumer<T> wrapConsumer(final ThrowingConsumer<T> consumer) {
        return consumer;
    }

    public static ThrowingDoubleBinaryOperator wrapDoubleBinaryOperator(final ThrowingDoubleBinaryOperator operator) {
        return operator;
    }

    public static ThrowingDoubleConsumer wrapDoubleConsumer(final ThrowingDoubleConsumer consumer) {
        return consumer;
    }

    public static <R> ThrowingDoubleFunction<R> wrapDoubleFunction(final ThrowingDoubleFunction<R> function) {
        return function;
    }

    public static ThrowingDoublePredicate wrapDoublePredicate(final ThrowingDoublePredicate predicate) {
        return predicate;
    }

    public static ThrowingDoubleSupplier wrapDoubleSupplier(final ThrowingDoubleSupplier consumer) {
        return consumer;
    }

    public static ThrowingDoubleToIntFunction wrapDoubleToIntFunction(final ThrowingDoubleToIntFunction function) {
        return function;
    }

    public static ThrowingDoubleToLongFunction wrapDoubleToLongFunction(final ThrowingDoubleToLongFunction function) {
        return function;
    }

    public static ThrowingDoubleUnaryOperator wrapDoubleUnaryOperator(final ThrowingDoubleUnaryOperator operator) {
        return operator;
    }

    public static <T, R> ThrowingFunction<T, R> wrapFunction(final ThrowingFunction<T, R> function) {
        return function;
    }

    public static ThrowingIntBinaryOperator wrapIntBinaryOperator(final ThrowingIntBinaryOperator operator) {
        return operator;
    }

    public static ThrowingIntConsumer wrapIntConsumer(final ThrowingIntConsumer consumer) {
        return consumer;
    }

    public static <R> ThrowingIntFunction<R> wrapIntFunction(final ThrowingIntFunction<R> function) {
        return function;
    }

    public static ThrowingIntPredicate wrapIntPredicate(final ThrowingIntPredicate predicate) {
        return predicate;
    }

    public static ThrowingIntSupplier wrapIntSupplier(final ThrowingIntSupplier supplier) {
        return supplier;
    }

    public static ThrowingIntToDoubleFunction wrapIntToDoubleFunction(final ThrowingIntToDoubleFunction function) {
        return function;
    }

    public static ThrowingIntToLongFunction wrapIntToLongFunction(final ThrowingIntToLongFunction function) {
        return function;
    }

    public static ThrowingIntUnaryOperator wrapIntUnaryOperator(final ThrowingIntUnaryOperator operator) {
        return operator;
    }

    public static ThrowingLongBinaryOperator wrapLongBinaryOperator(final ThrowingLongBinaryOperator operator) {
        return operator;
    }

    public static ThrowingLongConsumer wrapLongConsumer(final ThrowingLongConsumer consumer) {
        return consumer;
    }

    public static <R> ThrowingLongFunction<R> wrapLongFunction(final ThrowingLongFunction<R> function) {
        return function;
    }

    public static ThrowingLongPredicate wrapLongPredicate(final ThrowingLongPredicate predicate) {
        return predicate;
    }

    public static ThrowingLongSupplier wrapLongSupplier(final ThrowingLongSupplier supplier) {
        return supplier;
    }

    public static ThrowingLongToDoubleFunction wrapLongToDoubleFunction(final ThrowingLongToDoubleFunction function) {
        return function;
    }

    public static ThrowingLongToIntFunction wrapLongToIntFunction(final ThrowingLongToIntFunction function) {
        return function;
    }

    public static ThrowingLongUnaryOperator wrapLongUnaryOperator(final ThrowingLongUnaryOperator operator) {
        return operator;
    }

    public static <T> ThrowingObjDoubleConsumer<T> wrapObjDoubleConsumer(final ThrowingObjDoubleConsumer<T> consumer) {
        return consumer;
    }

    public static <T> ThrowingObjIntConsumer<T> wrapObjIntConsumer(final ThrowingObjIntConsumer<T> consumer) {
        return consumer;
    }

    public static <T> ThrowingObjLongConsumer<T> wrapObjLongConsumer(final ThrowingObjLongConsumer<T> consumer) {
        return consumer;
    }

    public static <T> ThrowingPredicate<T> wrapPredicate(final ThrowingPredicate<T> predicate) {
        return predicate;
    }

    public static <T> ThrowingSupplier<T> wrapSupplier(final ThrowingSupplier<T> supplier) {
        return supplier;
    }

    public static <T, U> ThrowingToDoubleBiFunction<T, U> wrapToDoubleBiFunction(final ThrowingToDoubleBiFunction<T, U> function) {
        return function;
    }

    public static <T> ThrowingToDoubleFunction<T> wrapToDoubleFunction(final ThrowingToDoubleFunction<T> function) {
        return function;
    }

    public static <T, U> ThrowingToIntBiFunction<T, U> wrapToIntBiFunction(final ThrowingToIntBiFunction<T, U> consumer) {
        return consumer;
    }

    public static <T> ThrowingToIntFunction<T> wrapToIntFunction(final ThrowingToIntFunction<T> function) {
        return function;
    }

    public static <T, U> ThrowingToLongBiFunction<T, U> wrapToLongBiFunction(final ThrowingToLongBiFunction<T, U> function) {
        return function;
    }

    public static <T> ThrowingToLongFunction<T> wrapToLongFunction(final ThrowingToLongFunction<T> function) {
        return function;
    }

    public static <T> ThrowingUnaryOperator<T> wrapUnaryOperator(final ThrowingUnaryOperator<T> operator) {
        return operator;
    }
}
