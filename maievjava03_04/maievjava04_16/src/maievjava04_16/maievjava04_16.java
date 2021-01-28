package maievjava04_16;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;

public class maievjava04_16 {
	public static void main(String[] args) {
		getFileName("G:\\maievteastingfile\\maiev\\www.lillychina.com");
		System.out.println("maiev");
	}

	public static void getFileName(String path) {
		File file = new File(path);
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				if (f.isDirectory()) {
					getFileName(f.getPath());
				} else {
					File file2 = new File(file.getPath()+f.getName());
					String string = "";
					int len;
					byte b[] = new byte[1024];
					FileOutputStream fileOutputStream = null;
					FileInputStream fileInputStream = null;
					try {
						fileInputStream = new FileInputStream(f);
						fileOutputStream = new FileOutputStream(file2);
						try {
							while ((len = fileInputStream.read(b)) != -1) {
								string = string + new String(b);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						string = string.replace(
								"<!-- Mirrored from www.lillychina.com/cn/terms-of-use.aspx by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 07 Jan 2021 09:14:34 GMT -->",
								"");
						try {
							fileOutputStream.write(string.getBytes());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

		} else {
			File file2=new File(file.getPath()+file.getName());
			FileInputStream fileInputStream = null;
			FileOutputStream fileOutputStream = null;
			String string = "";
			int len;
			byte b[] = new byte[1024];
			try {
				fileInputStream = new FileInputStream(file);
				fileOutputStream = new FileOutputStream(file2);
				try {
					while ((len = fileInputStream.read(b)) != -1) {
						string = string + new String(b);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				string = string.replace(
						"<!-- Mirrored from www.lillychina.com/cn/privacy.aspx by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 07 Jan 2021 09:15:25 GMT -->",
						"");
				try {
					fileOutputStream.write(string.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
