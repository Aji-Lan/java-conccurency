package com.aiji.conccurency.chapter1;

/**
 * 继承thread方式实现多线程的简易银行叫号
 */
public class BankVersion1 {

	public static void main(String[] args) {
		WindowsTicket windowsTicket1 = new WindowsTicket("一号柜台");
		windowsTicket1.start();

		WindowsTicket windowsTicket2 = new WindowsTicket("二号柜台");
		windowsTicket2.start();

		WindowsTicket windowsTicket3 = new WindowsTicket("三号柜台");
		windowsTicket3.start();
	}
}
