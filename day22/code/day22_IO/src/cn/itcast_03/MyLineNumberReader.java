package cn.itcast_03;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader extends MyBufferedReader {
	private int lineNumber;

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public MyLineNumberReader(Reader r) {
		super(r);
	}

	public String readLine() throws IOException {
		lineNumber++;
		return super.readLine();
	}
}
