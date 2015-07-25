package com.jack.spring.c02.spel;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpELTest {
	@Test
	public void helloworld() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser
				.parseExpression("('Hello' + ' World').concat(#end)");
		EvaluationContext context = new StandardEvaluationContext();
		context.setVariable("end", "!");
		Assert.assertEquals("Hello World!", expression.getValue(context));
	}
}
