package org.example.foo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext ctx) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
	}

	public void stop(BundleContext ctx) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Good bye, cruel world");
	}

}
