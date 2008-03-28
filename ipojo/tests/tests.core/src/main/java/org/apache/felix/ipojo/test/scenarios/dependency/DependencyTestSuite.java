/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.ipojo.test.scenarios.dependency;

import junit.framework.Test;

import org.apache.felix.ipojo.junit4osgi.OSGiTestSuite;
import org.apache.felix.ipojo.test.scenarios.dependency.di.DefaultImplementationTestSuite;
import org.apache.felix.ipojo.test.scenarios.dependency.statics.StaticDependencyTestSuite;
import org.osgi.framework.BundleContext;

public class DependencyTestSuite {

	public static Test suite(BundleContext bc) {
		OSGiTestSuite ots = new OSGiTestSuite("Service Dependencies Test Suite", bc);
		ots.addTestSuite(SimpleDependencies.class);
		ots.addTestSuite(OptionalDependencies.class);
		ots.addTestSuite(MultipleDependencies.class);
		ots.addTestSuite(OptionalMultipleDependencies.class);
		ots.addTestSuite(DelayedSimpleDependencies.class);
		ots.addTestSuite(DelayedOptionalDependencies.class);
		ots.addTestSuite(DelayedMultipleDependencies.class);
		ots.addTestSuite(DelayedOptionalMultipleDependencies.class);
        ots.addTestSuite(MethodSimpleDependencies.class);
        ots.addTestSuite(MethodOptionalDependencies.class);
        ots.addTestSuite(MethodMultipleDependencies.class);
        ots.addTestSuite(MethodOptionalMultipleDependencies.class);
        ots.addTestSuite(MethodDelayedSimpleDependencies.class);
        ots.addTestSuite(MethodDelayedOptionalDependencies.class);
        ots.addTestSuite(MethodDelayedMultipleDependencies.class);
        ots.addTestSuite(MethodDelayedOptionalMultipleDependencies.class);
        ots.addTestSuite(SimpleFilterDependencies.class);
        ots.addTestSuite(OptionalSimpleFilterDependencies.class);
        ots.addTestSuite(MultipleFilterDependencies.class);
        ots.addTestSuite(OptionalMultipleFilterDependencies.class);
        ots.addTest(StaticDependencyTestSuite.suite(bc));
        ots.addTest(DefaultImplementationTestSuite.suite(bc));
		return ots;
	}

}
