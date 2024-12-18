package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    1. junit5부터는 Test 클래스에 접근자가 아무거나 와도 된다.

    2. 테스트 글래스의 생성자는 파라미터가 아예 없거나, 런타임에 의존성 주입으로 동적으로 resolve하는 파라미터만 가능하다.

    3. @Test 어노테이션이 붙으면 해당 메소드는 단위 테스트의 대상임을 알려준다.

    4. 테스트 메서드의 종류 (추상메서드일 수 없고, 반환값을 가질 수 없다. 즉, 반환타입은 void)
        - @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, @TestTemplate 이 붙은 메서드 들

    5. 생애 주기 메서드
        - @BeforeAll, @AfterAll , @BeforeEach, @AfterEach

 */

class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(50, result, 0); // 마지막 인자값 delta는 오차범위

    }
}