/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.container.spring;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

import org.kie.runtime.rule.AccumulateFunction;

public class MockAccumulateFunction
    implements
    AccumulateFunction {

    public void accumulate(Serializable context,
                           Object value) {
        // TODO Auto-generated method stub

    }

    public Serializable createContext() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getResult(Serializable context) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    public void init(Serializable context) throws Exception {
        // TODO Auto-generated method stub

    }

    public void reverse(Serializable context,
                        Object value) throws Exception {
        // TODO Auto-generated method stub

    }

    public boolean supportsReverse() {
        // TODO Auto-generated method stub
        return false;
    }

    public void readExternal(ObjectInput in) throws IOException,
                                            ClassNotFoundException {
        // TODO Auto-generated method stub

    }

    public void writeExternal(ObjectOutput out) throws IOException {
        // TODO Auto-generated method stub

    }

    public Class<?> getResultType() {
        return null;
    }

}
