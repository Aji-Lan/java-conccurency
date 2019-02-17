package com.aiji.conccurency.chapter1;

public class WindowsTicketRunnable implements Runnable {
	private static final int MAX = 50;
	private static int index = 1;

	public void run() {
		while (index <= MAX) {
			System.out.println(Thread.currentThread() + " 当前号数为：" + (index++));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
