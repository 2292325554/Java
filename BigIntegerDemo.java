package com.chenjian.test;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger biglnstance = new BigInteger("4");
		System.out.println("加法操作" + biglnstance.add(new BigInteger("2")));
		System.out.println("减法操作" + biglnstance.subtract(new BigInteger("2")));
		System.out.println("乘法操作" + biglnstance.multiply(new BigInteger("2")));
		System.out.println("除法操作" + biglnstance.divide(new BigInteger("2")));
		System.out.println("取商操作" + biglnstance.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println("取余操作" + biglnstance.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println("做2次方操作" + biglnstance.pow(2));
		System.out.println("取相反数操作" + biglnstance.negate());

	}

}
