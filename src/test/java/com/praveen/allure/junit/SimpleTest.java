package com.praveen.allure.junit;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;


/**
 * eroshenkoam
 * 24.10.17
 */
class SimpleTest {

    @Test
    @Feature("Some feature")
    @Severity(SeverityLevel.CRITICAL)
    void testOutput() {
        firstStep();
    }

    @Step
    private void firstStep() {
    }
}
