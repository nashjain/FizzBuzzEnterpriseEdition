package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.EnterpriseGradeFizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

public class FizzBuzz {
	public void execute(int nFizzBuzzUpperLimit) {
		final FizzBuzzSolutionStrategyFactory mySolutionStrategyFactory =
			new EnterpriseGradeFizzBuzzSolutionStrategyFactory();
		final FizzBuzzSolutionStrategy mySolutionStrategy =
			mySolutionStrategyFactory.create();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}
}
