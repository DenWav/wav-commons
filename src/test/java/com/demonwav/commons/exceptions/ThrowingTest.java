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

import static com.demonwav.commons.exceptions.Throwing.wrapBiConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapBiFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapBiPredicate;
import static com.demonwav.commons.exceptions.Throwing.wrapBinaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapBooleanSupplier;
import static com.demonwav.commons.exceptions.Throwing.wrapConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleBinaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapDoublePredicate;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleSupplier;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleToIntFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleToLongFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapDoubleUnaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapIntBinaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapIntConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapIntFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapIntPredicate;
import static com.demonwav.commons.exceptions.Throwing.wrapIntSupplier;
import static com.demonwav.commons.exceptions.Throwing.wrapIntToDoubleFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapIntToLongFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapIntUnaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapLongBinaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapLongConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapLongFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapLongPredicate;
import static com.demonwav.commons.exceptions.Throwing.wrapLongSupplier;
import static com.demonwav.commons.exceptions.Throwing.wrapLongToDoubleFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapLongToIntFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapLongUnaryOperator;
import static com.demonwav.commons.exceptions.Throwing.wrapObjDoubleConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapObjIntConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapObjLongConsumer;
import static com.demonwav.commons.exceptions.Throwing.wrapPredicate;
import static com.demonwav.commons.exceptions.Throwing.wrapSupplier;
import static com.demonwav.commons.exceptions.Throwing.wrapToDoubleBiFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapToDoubleFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapToIntBiFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapToIntFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapToLongBiFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapToLongFunction;
import static com.demonwav.commons.exceptions.Throwing.wrapUnaryOperator;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.Test;

class ThrowingTest {

    @Test
    void testBiConsumer() {
        assertThrows(SpecialException.class, () -> useBiConsumer(wrapBiConsumer((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testBiFunction() {
        assertThrows(SpecialException.class, () -> useBiFunction(wrapBiFunction((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testBinaryOperator() {
        assertThrows(SpecialException.class, () -> useBinaryOperator(wrapBinaryOperator((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testBiPredicate() {
        assertThrows(SpecialException.class, () -> useBiPredicate(wrapBiPredicate((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testBooleanSupplier() {
        assertThrows(SpecialException.class, () -> useBooleanSupplier(wrapBooleanSupplier(() -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testConsumer() {
        assertThrows(SpecialException.class, () -> useConsumer(wrapConsumer(s -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleBinaryOperator() {
        assertThrows(SpecialException.class, () -> useDoubleBinaryOperator(wrapDoubleBinaryOperator((d1, d2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleConsumer() {
        assertThrows(SpecialException.class, () -> useDoubleConsumer(wrapDoubleConsumer(d -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleFunction() {
        assertThrows(SpecialException.class, () -> useDoubleFunction(wrapDoubleFunction(d -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoublePredicate() {
        assertThrows(SpecialException.class, () -> useDoublePredicate(wrapDoublePredicate(d -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleSupplier() {
        assertThrows(SpecialException.class, () -> useDoubleSupplier(wrapDoubleSupplier(() -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleToIntFunction() {
        assertThrows(SpecialException.class, () -> useDoubleToIntFunction(wrapDoubleToIntFunction(d -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleToLongFunction() {
        assertThrows(SpecialException.class, () -> useDoubleToLongFunction(wrapDoubleToLongFunction(d -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testDoubleUnaryOperator() {
        assertThrows(SpecialException.class, () -> useDoubleUnaryOperator(wrapDoubleUnaryOperator(d -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testFunction() {
        assertThrows(SpecialException.class, () -> useFunction(wrapFunction(s -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntBinaryOperator() {
        assertThrows(SpecialException.class, () -> useIntBinaryOperator(wrapIntBinaryOperator((i1, i2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntConsumer() {
        assertThrows(SpecialException.class, () -> useIntConsumer(wrapIntConsumer(i -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntFunction() {
        assertThrows(SpecialException.class, () -> useIntFunction(wrapIntFunction(i -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntPredicate() {
        assertThrows(SpecialException.class, () -> useIntPredicate(wrapIntPredicate(i -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntSupplier() {
        assertThrows(SpecialException.class, () -> useIntSupplier(wrapIntSupplier(() -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntToDoubleFunction() {
        assertThrows(SpecialException.class, () -> useIntToDoubleFunction(wrapIntToDoubleFunction(i -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntToLongFunction() {
        assertThrows(SpecialException.class, () -> useIntToLongFunction(wrapIntToLongFunction(i -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testIntUnaryOperator() {
        assertThrows(SpecialException.class, () -> useIntUnaryOperator(wrapIntUnaryOperator(i -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongBinaryOperator() {
        assertThrows(SpecialException.class, () -> useLongBinaryOperator(wrapLongBinaryOperator((l1, l2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongConsumer() {
        assertThrows(SpecialException.class, () -> useLongConsumer(wrapLongConsumer(l -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongFunction() {
        assertThrows(SpecialException.class, () -> useLongFunction(wrapLongFunction(l -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongPredicate() {
        assertThrows(SpecialException.class, () -> useLongPredicate(wrapLongPredicate(l -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongSupplier() {
        assertThrows(SpecialException.class, () -> useLongSupplier(wrapLongSupplier(() -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongToDoubleFunction() {
        assertThrows(SpecialException.class, () -> useLongToDoubleFunction(wrapLongToDoubleFunction(l -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongToIntFunction() {
        assertThrows(SpecialException.class, () -> useLongToIntFunction(wrapLongToIntFunction(l -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testLongUnaryOperator() {
        assertThrows(SpecialException.class, () -> useLongUnaryOperator(wrapLongUnaryOperator(l -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testObjDoubleConsumer() {
        assertThrows(SpecialException.class, () -> useObjDoubleConsumer(wrapObjDoubleConsumer((s, d) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testObjIntConsumer() {
        assertThrows(SpecialException.class, () -> useObjIntConsumer(wrapObjIntConsumer((s, i) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testObjLongConsumer() {
        assertThrows(SpecialException.class, () -> useObjLongConsumer(wrapObjLongConsumer((s, l) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testPredicate() {
        assertThrows(SpecialException.class, () -> usePredicate(wrapPredicate(s -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testSupplier() {
        assertThrows(SpecialException.class, () -> useSupplier(wrapSupplier(() -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testToDoubleBiFunction() {
        assertThrows(SpecialException.class, () -> useToDoubleBiFunction(wrapToDoubleBiFunction((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testToDoubleFunction() {
        assertThrows(SpecialException.class, () -> useToDoubleFunction(wrapToDoubleFunction(s -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testToIntBiFunction() {
        assertThrows(SpecialException.class, () -> useToIntBiFunction(wrapToIntBiFunction((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testToIntFunction() {
        assertThrows(SpecialException.class, () -> useToIntFunction(wrapToIntFunction(s -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testToLongBiFunction() {
        assertThrows(SpecialException.class, () -> useToLongBiFunction(wrapToLongBiFunction((s1, s2) -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testToLongFunction() {
        assertThrows(SpecialException.class, () -> useToLongFunction(wrapToLongFunction(s -> {
            throw new SpecialException();
        })));
    }

    @Test
    void testUnaryOperator() {
        assertThrows(SpecialException.class, () -> useUnaryOperator(wrapUnaryOperator(s -> {
            throw new SpecialException();
        })));
    }

    private static void useBiConsumer(final BiConsumer<String, String> consumer) {
        consumer.accept("", "");
    }

    private static void useBiFunction(final BiFunction<String, String, String> function) {
        function.apply("", "");
    }

    private static void useBinaryOperator(final BinaryOperator<String> operator) {
        operator.apply("", "");
    }

    private static void useBiPredicate(final BiPredicate<String, String> predicate) {
        predicate.test("", "");
    }

    private static void useBooleanSupplier(final BooleanSupplier supplier) {
        supplier.getAsBoolean();
    }

    private static void useConsumer(final Consumer<String> consumer) {
        consumer.accept("");
    }

    private static void useDoubleBinaryOperator(final DoubleBinaryOperator operator) {
        operator.applyAsDouble(0, 0);
    }

    private static void useDoubleConsumer(final DoubleConsumer consumer) {
        consumer.accept(0);
    }

    private static void useDoubleFunction(final DoubleFunction<String> function) {
        function.apply(0);
    }

    private static void useDoublePredicate(final DoublePredicate predicate) {
        predicate.test(0);
    }

    private static void useDoubleSupplier(final DoubleSupplier consumer) {
        consumer.getAsDouble();
    }

    private static void useDoubleToIntFunction(final DoubleToIntFunction function) {
        function.applyAsInt(0);
    }

    private static void useDoubleToLongFunction(final DoubleToLongFunction function) {
        function.applyAsLong(0);
    }

    private static void useDoubleUnaryOperator(final DoubleUnaryOperator operator) {
        operator.applyAsDouble(0);
    }

    private static void useFunction(final Function<String, String> function) {
        function.apply("");
    }

    private static void useIntBinaryOperator(final IntBinaryOperator operator) {
        operator.applyAsInt(0, 0);
    }

    private static void useIntConsumer(final IntConsumer consumer) {
        consumer.accept(0);
    }

    private static void useIntFunction(final IntFunction<String> function) {
        function.apply(0);
    }

    private static void useIntPredicate(final IntPredicate predicate) {
        predicate.test(0);
    }

    private static void useIntSupplier(final IntSupplier supplier) {
        supplier.getAsInt();
    }

    private static void useIntToDoubleFunction(final IntToDoubleFunction function) {
        function.applyAsDouble(0);
    }

    private static void useIntToLongFunction(final IntToLongFunction function) {
        function.applyAsLong(0);
    }

    private static void useIntUnaryOperator(final IntUnaryOperator operator) {
        operator.applyAsInt(0);
    }

    private static void useLongBinaryOperator(final LongBinaryOperator operator) {
        operator.applyAsLong(0, 0);
    }

    private static void useLongConsumer(final LongConsumer consumer) {
        consumer.accept(0);
    }

    private static void useLongFunction(final LongFunction<String> function) {
        function.apply(0);
    }

    private static void useLongPredicate(final LongPredicate predicate) {
        predicate.test(0);
    }

    private static void useLongSupplier(final LongSupplier supplier) {
        supplier.getAsLong();
    }

    private static void useLongToDoubleFunction(final LongToDoubleFunction function) {
        function.applyAsDouble(0);
    }

    private static void useLongToIntFunction(final LongToIntFunction function) {
        function.applyAsInt(0);
    }

    private static void useLongUnaryOperator(final LongUnaryOperator operator) {
        operator.applyAsLong(0);
    }

    private static void useObjDoubleConsumer(final ObjDoubleConsumer<String> consumer) {
        consumer.accept("", 0);
    }

    private static void useObjIntConsumer(final ObjIntConsumer<String> consumer) {
        consumer.accept("", 0);
    }

    private static void useObjLongConsumer(final ObjLongConsumer<String> consumer) {
        consumer.accept("", 0);
    }

    private static void usePredicate(final Predicate<String> predicate) {
        predicate.test("");
    }

    private static void useSupplier(final Supplier<String> supplier) {
        supplier.get();
    }

    private static void useToDoubleBiFunction(final ToDoubleBiFunction<String, String> function) {
        function.applyAsDouble("", "");
    }

    private static void useToDoubleFunction(final ToDoubleFunction<String> function) {
        function.applyAsDouble("");
    }

    private static void useToIntBiFunction(final ToIntBiFunction<String, String> consumer) {
        consumer.applyAsInt("", "");
    }

    private static void useToIntFunction(final ToIntFunction<String> function) {
        function.applyAsInt("");
    }

    private static void useToLongBiFunction(final ToLongBiFunction<String, String> function) {
        function.applyAsLong("", "");
    }

    private static void useToLongFunction(final ToLongFunction<String> function) {
        function.applyAsLong("");
    }

    private static void useUnaryOperator(final UnaryOperator<String> operator) {
        operator.apply("");
    }

    private static class SpecialException extends Exception {
    }
}
