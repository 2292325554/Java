package com.chenjian.test;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger biglnstance = new BigInteger("4");
		System.out.println("�ӷ�����" + biglnstance.add(new BigInteger("2")));
		System.out.println("��������" + biglnstance.subtract(new BigInteger("2")));
		System.out.println("�˷�����" + biglnstance.multiply(new BigInteger("2")));
		System.out.println("��������" + biglnstance.divide(new BigInteger("2")));
		System.out.println("ȡ�̲���" + biglnstance.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println("ȡ�����" + biglnstance.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println("��2�η�����" + biglnstance.pow(2));
		System.out.println("ȡ�෴������" + biglnstance.negate());

	}

}
