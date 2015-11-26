package cn.itcast_02;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * public int getLineNumber():获取当前的行号
 * public void setLineNumber(int lineNumber):设置当前的行号
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("my.txt"));

		lnr.setLineNumber(100);

		// System.out.println(lnr.getLineNumber());
		// System.out.println(lnr.getLineNumber());
		// System.out.println(lnr.getLineNumber());

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}

		lnr.close();
	}
}
