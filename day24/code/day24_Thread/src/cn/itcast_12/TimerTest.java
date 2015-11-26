package cn.itcast_12;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 在4点整删除d:\\hello文件夹
 */
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();

		String s = "2015-04-12 15:55:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);

		t.schedule(new DeleteFolder(new File("d:\\hello")), d);
	}
}

class DeleteFolder extends TimerTask {
	private File folder;

	public DeleteFolder(File folder) {
		this.folder = folder;
	}

	@Override
	public void run() {
		deleteFolder(folder);
	}

	private void deleteFolder(File folder) {
		File[] fileArray = folder.listFiles();
		if (fileArray != null) {
			for (File file : fileArray) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					file.delete();
				}
			}
			folder.delete();
		}
	}
}
