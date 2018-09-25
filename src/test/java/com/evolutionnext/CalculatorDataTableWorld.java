package com.evolutionnext;

import cucumber.runtime.java.guice.ScenarioScoped;

import java.util.ArrayList;
import java.util.List;

@ScenarioScoped
public class CalculatorDataTableWorld {
    public List<List<String>> info;
    public Calculator calculator;
    public List<List<Integer>> results;
}
