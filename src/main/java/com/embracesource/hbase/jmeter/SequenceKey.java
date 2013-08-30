package com.embracesource.hbase.jmeter;

public class SequenceKey {
	private static int sequenceKey = 1;

	public synchronized  static int getsequenceKey() {
		return sequenceKey++;
	}
}
