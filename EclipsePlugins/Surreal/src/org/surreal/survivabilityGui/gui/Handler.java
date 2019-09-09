package org.surreal.survivabilityGui.gui;

public class Handler implements Thread.UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(e.getMessage());
	}
}
