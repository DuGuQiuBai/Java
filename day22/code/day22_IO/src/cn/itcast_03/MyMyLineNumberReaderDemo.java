package cn.itcast_03;

import java.io.FileReader;
import java.io.IOException;

public class MyMyLineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		MyLineNumberReader lnr = new MyLineNumberReader(
				new FileReader("my.txt"));

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
