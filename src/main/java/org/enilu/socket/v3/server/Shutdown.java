package org.enilu.socket.v3.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 停止数据库服务
 * 
 * <li>连接数据库服务，并发送stop命令，停止数据库服务</li>
 * <p>
 * 2014年8月19日
 * <p>
 * 
 * @author enilu(82552623@qq.com)
 * 
 */
public class Shutdown {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 9999);

		OutputStream out = client.getOutputStream();
		out.write("stop".getBytes());
		client.close();
	}
}
