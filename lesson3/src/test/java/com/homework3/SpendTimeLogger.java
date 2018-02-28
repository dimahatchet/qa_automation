package com.homework3;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

    public class SpendTimeLogger implements TestRule {

        public Statement apply(final Statement base, final Description description) {
            return new Statement() {
                public void evaluate() throws Throwable {
                    long start = System.currentTimeMillis();
                    base.evaluate();
                    long executionTime = System.currentTimeMillis() - start;
                    System.out.printf("Time taken for: %s is %s milli sec%n",description.getDisplayName(),executionTime);
                }
            };
        }
    }

