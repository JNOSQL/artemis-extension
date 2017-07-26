/*
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 */
package org.jnosql.artemis.graph;

import org.jnosql.artemis.IdNotFoundException;
import org.jnosql.artemis.graph.cdi.WeldJUnit4Runner;
import org.jnosql.artemis.graph.model.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(WeldJUnit4Runner.class)
public class GraphTemplateTest {

    @Inject
    private GraphTemplate graphTemplate;


    @Test(expected = IdNotFoundException.class)
    public void shouldReturnErrorWhenThereIsNotId() {
        Animal lion = new Animal("lion");
        graphTemplate.insert(lion);
    }
}