/*******************************************************************************
 * Copyright (c) 2015 Red Hat. All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Red Hat - Initial Contribution
 *******************************************************************************/

package org.lambdamatic.mongodb.internal.codecs.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to simplify the definition of parameterized data in JUnit tests.
 * 
 * @author xcoulon
 *
 */
public class ParameterizedDataset<DomainType, ExpectationType> {

  private final List<Object[]> data = new ArrayList<>();

  /**
   * Utility method that makes the JUnit parameters declaration much more readable.
   * 
   * @param title the test title
   * @param object the domain object to encode
   * @param expectation the expected result
   */
  public void match(final String title, final DomainType object, final ExpectationType expectation) {
    data.add(new Object[] {title, object, expectation});
  }

  /**
   * Utility method that makes the JUnit parameters declaration much more readable.
   * 
   * @param object the domain object to encode
   * @param expectation the expected result
   */
  public void match(final DomainType object, final ExpectationType expectation) {
    data.add(new Object[] {object, expectation});
  }

  public Object[][] toArray() {
    return data.toArray(new Object[0][0]);
  }

}
