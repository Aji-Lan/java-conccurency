package com.aiji.conccurency.chapter1;

public class BankVersion2 {

	public static void main(String[] args) {
		WindowsTicketRunnable windowsTicketRunnable = new WindowsTicketRunnable();
		Thread thread1 = new Thread(windowsTicketRunnable, "一号柜台");
		Thread thread2 = new Thread(windowsTicketRunnable, "二号柜台");
		Thread thread3 = new Thread(windowsTicketRunnable, "三号柜台");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
