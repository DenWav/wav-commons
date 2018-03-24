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

@SuppressWarnings("WeakerAccess")
public final class Throwing {

    private Throwing() {}

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> RuntimeException throwAnyways(final Throwable t) throws T {
        throw (T) t;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingBiConsumer} rather than a {@link java.util.function.BiConsumer}.
     */
    public static <T, U> ThrowingBiConsumer<T, U> wrapBiConsumer(final ThrowingBiConsumer<T, U> consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingBiFunction} rather than a {@link java.util.function.BiFunction}.
     */
    public static <T, U, R> ThrowingBiFunction<T, U, R> wrapBiFunction(final ThrowingBiFunction<T, U, R> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingBinaryOperator} rather than a {@link java.util.function.BinaryOperator}.
     */
    public static <T> ThrowingBinaryOperator<T> wrapBinaryOperator(final ThrowingBinaryOperator<T> operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingBiPredicate} rather than a {@link java.util.function.BiPredicate}.
     */
    public static <T, U> ThrowingBiPredicate<T, U> wrapBiPredicate(final ThrowingBiPredicate<T, U> predicate) {
        return predicate;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingBooleanSupplier} rather than a {@link java.util.function.BooleanSupplier}.
     */
    public static ThrowingBooleanSupplier wrapBooleanSupplier(final ThrowingBooleanSupplier supplier) {
        return supplier;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingConsumer} rather than a {@link java.util.function.Consumer}.
     */
    public static <T> ThrowingConsumer<T> wrapConsumer(final ThrowingConsumer<T> consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleBinaryOperator} rather than a {@link java.util.function.DoubleBinaryOperator}.
     */
    public static ThrowingDoubleBinaryOperator wrapDoubleBinaryOperator(final ThrowingDoubleBinaryOperator operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleConsumer} rather than a {@link java.util.function.DoubleConsumer}.
     */
    public static ThrowingDoubleConsumer wrapDoubleConsumer(final ThrowingDoubleConsumer consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleFunction} rather than a {@link java.util.function.DoubleFunction}.
     */
    public static <R> ThrowingDoubleFunction<R> wrapDoubleFunction(final ThrowingDoubleFunction<R> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoublePredicate} rather than a {@link java.util.function.DoublePredicate}.
     */
    public static ThrowingDoublePredicate wrapDoublePredicate(final ThrowingDoublePredicate predicate) {
        return predicate;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleSupplier} rather than a {@link java.util.function.DoubleSupplier}.
     */
    public static ThrowingDoubleSupplier wrapDoubleSupplier(final ThrowingDoubleSupplier consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleToIntFunction} rather than a {@link java.util.function.DoubleToIntFunction}.
     */
    public static ThrowingDoubleToIntFunction wrapDoubleToIntFunction(final ThrowingDoubleToIntFunction function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleToLongFunction} rather than a {@link java.util.function.DoubleToLongFunction}.
     */
    public static ThrowingDoubleToLongFunction wrapDoubleToLongFunction(final ThrowingDoubleToLongFunction function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingDoubleUnaryOperator} rather than a {@link java.util.function.DoubleUnaryOperator}.
     */
    public static ThrowingDoubleUnaryOperator wrapDoubleUnaryOperator(final ThrowingDoubleUnaryOperator operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingFunction} rather than a {@link java.util.function.Function}.
     */
    public static <T, R> ThrowingFunction<T, R> wrapFunction(final ThrowingFunction<T, R> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntBinaryOperator} rather than a {@link java.util.function.IntBinaryOperator}.
     */
    public static ThrowingIntBinaryOperator wrapIntBinaryOperator(final ThrowingIntBinaryOperator operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntConsumer} rather than a {@link java.util.function.IntConsumer}.
     */
    public static ThrowingIntConsumer wrapIntConsumer(final ThrowingIntConsumer consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntFunction} rather than a {@link java.util.function.IntFunction}.
     */
    public static <R> ThrowingIntFunction<R> wrapIntFunction(final ThrowingIntFunction<R> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntPredicate} rather than a {@link java.util.function.IntPredicate}.
     */
    public static ThrowingIntPredicate wrapIntPredicate(final ThrowingIntPredicate predicate) {
        return predicate;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntSupplier} rather than a {@link java.util.function.IntSupplier}.
     */
    public static ThrowingIntSupplier wrapIntSupplier(final ThrowingIntSupplier supplier) {
        return supplier;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntToDoubleFunction} rather than a {@link java.util.function.IntToDoubleFunction}.
     */
    public static ThrowingIntToDoubleFunction wrapIntToDoubleFunction(final ThrowingIntToDoubleFunction function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntToLongFunction} rather than a {@link java.util.function.IntToLongFunction}.
     */
    public static ThrowingIntToLongFunction wrapIntToLongFunction(final ThrowingIntToLongFunction function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingIntUnaryOperator} rather than a {@link java.util.function.IntUnaryOperator}.
     */
    public static ThrowingIntUnaryOperator wrapIntUnaryOperator(final ThrowingIntUnaryOperator operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongBinaryOperator} rather than a {@link java.util.function.LongBinaryOperator}.
     */
    public static ThrowingLongBinaryOperator wrapLongBinaryOperator(final ThrowingLongBinaryOperator operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongConsumer} rather than a {@link java.util.function.LongConsumer}.
     */
    public static ThrowingLongConsumer wrapLongConsumer(final ThrowingLongConsumer consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongFunction} rather than a {@link java.util.function.LongFunction}.
     */
    public static <R> ThrowingLongFunction<R> wrapLongFunction(final ThrowingLongFunction<R> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongPredicate} rather than a {@link java.util.function.LongPredicate}.
     */
    public static ThrowingLongPredicate wrapLongPredicate(final ThrowingLongPredicate predicate) {
        return predicate;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongSupplier} rather than a {@link java.util.function.LongSupplier}.
     */
    public static ThrowingLongSupplier wrapLongSupplier(final ThrowingLongSupplier supplier) {
        return supplier;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongToDoubleFunction} rather than a {@link java.util.function.LongToDoubleFunction}.
     */
    public static ThrowingLongToDoubleFunction wrapLongToDoubleFunction(final ThrowingLongToDoubleFunction function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongToIntFunction} rather than a {@link java.util.function.LongToIntFunction}.
     */
    public static ThrowingLongToIntFunction wrapLongToIntFunction(final ThrowingLongToIntFunction function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingLongUnaryOperator} rather than a {@link java.util.function.LongUnaryOperator}.
     */
    public static ThrowingLongUnaryOperator wrapLongUnaryOperator(final ThrowingLongUnaryOperator operator) {
        return operator;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingObjDoubleConsumer} rather than a {@link java.util.function.ObjDoubleConsumer}.
     */
    public static <T> ThrowingObjDoubleConsumer<T> wrapObjDoubleConsumer(final ThrowingObjDoubleConsumer<T> consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingObjIntConsumer} rather than a {@link java.util.function.ObjIntConsumer}.
     */
    public static <T> ThrowingObjIntConsumer<T> wrapObjIntConsumer(final ThrowingObjIntConsumer<T> consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingObjLongConsumer} rather than a {@link java.util.function.ObjLongConsumer}.
     */
    public static <T> ThrowingObjLongConsumer<T> wrapObjLongConsumer(final ThrowingObjLongConsumer<T> consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingPredicate} rather than a {@link java.util.function.Predicate}.
     */
    public static <T> ThrowingPredicate<T> wrapPredicate(final ThrowingPredicate<T> predicate) {
        return predicate;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingSupplier} rather than a {@link java.util.function.Supplier}.
     */
    public static <T> ThrowingSupplier<T> wrapSupplier(final ThrowingSupplier<T> supplier) {
        return supplier;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingToDoubleBiFunction} rather than a {@link java.util.function.ToDoubleBiFunction}.
     */
    public static <T, U> ThrowingToDoubleBiFunction<T, U> wrapToDoubleBiFunction(final ThrowingToDoubleBiFunction<T, U> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingToDoubleFunction} rather than a {@link java.util.function.ToDoubleFunction}.
     */
    public static <T> ThrowingToDoubleFunction<T> wrapToDoubleFunction(final ThrowingToDoubleFunction<T> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingToIntBiFunction} rather than a {@link java.util.function.ToIntBiFunction}.
     */
    public static <T, U> ThrowingToIntBiFunction<T, U> wrapToIntBiFunction(final ThrowingToIntBiFunction<T, U> consumer) {
        return consumer;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingToIntFunction} rather than a {@link java.util.function.ToIntFunction}.
     */
    public static <T> ThrowingToIntFunction<T> wrapToIntFunction(final ThrowingToIntFunction<T> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingToLongBiFunction} rather than a {@link java.util.function.ToLongBiFunction}.
     */
    public static <T, U> ThrowingToLongBiFunction<T, U> wrapToLongBiFunction(final ThrowingToLongBiFunction<T, U> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingToLongFunction} rather than a {@link java.util.function.ToLongFunction}.
     */
    public static <T> ThrowingToLongFunction<T> wrapToLongFunction(final ThrowingToLongFunction<T> function) {
        return function;
    }

    /**
     * Wrapper method to act as a hint to the compiler to create a {@link ThrowingUnaryOperator} rather than a {@link java.util.function.UnaryOperator}.
     */
    public static <T> ThrowingUnaryOperator<T> wrapUnaryOperator(final ThrowingUnaryOperator<T> operator) {
        return operator;
    }
}

