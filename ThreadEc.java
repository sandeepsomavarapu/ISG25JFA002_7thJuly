package com.cts.threads;

public class ThreadEc extends Thread {
	@Override
	public void run() {// covarient RT,
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println(" Child Thread");
		}
	}

	public static void main(String[] args) {

		ThreadEc th = new ThreadEc();
		th.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(" Main Thread");
		}
	}

}
