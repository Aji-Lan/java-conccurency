package com.aiji.conccurency.chapter1;

public class WindowsTicket extends Thread {

	private static final int MAX = 50;
	private static int index = 1;
	private String name;

	public WindowsTicket(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void run() {
		while (index <= MAX) {
			System.out.println("柜台：" + name + " 当前号数为：" + (index++));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
