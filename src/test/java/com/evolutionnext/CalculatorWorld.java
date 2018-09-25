package com.evolutionnext;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class CalculatorWorld {
    public Calculator calculator;
    public int actual;
    public int expected;
}
