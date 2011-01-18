/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.hibernate.jsr303.tck.tests.validation;

import org.hibernate.jsr303.tck.util.client.Failing;

import javax.validation.ValidationException;

/**
 * Test wrapper for {@link ValidatePropertyTest}.
 */
public class ValidatePropertyGwtTest extends AbstractValidationTest {

  private final ValidatePropertyTest delegate = new ValidatePropertyTest();

  public void testIllegalArgumentExceptionIsThrownForNullValue() {
    delegate.testIllegalArgumentExceptionIsThrownForNullValue();
  }

  @Failing(issue = 5804)
  public void testPassingNullAsGroup() {
    delegate.testPassingNullAsGroup();
  }

  @Failing(issue = 5804)
  public void testUnexpectedExceptionsInValidatePropertyGetWrappedInValidationExceptions() {
    // Wrap the test to catch the @Test expected exception.
    try {
    delegate.testUnexpectedExceptionsInValidatePropertyGetWrappedInValidationExceptions();
      fail("Expected a " + ValidationException.class);
    } catch (ValidationException expected) {
    }
  }

  @Failing(issue = 5882)
  public void testValidateProperty() {
    delegate.testValidateProperty();
  }

  public void testValidatePropertyWithEmptyProperty() {
    delegate.testValidatePropertyWithEmptyProperty();
  }

  public void testValidatePropertyWithInvalidPropertyPath() {
    delegate.testValidatePropertyWithInvalidPropertyPath();
  }

  public void testValidatePropertyWithNullProperty() {
    delegate.testValidatePropertyWithNullProperty();
  }

  @Failing(issue = 5804)
  public void testValidIsNotHonoredValidateProperty() {
    delegate.testValidIsNotHonoredValidateProperty();
  }
}
