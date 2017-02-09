


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import dynamic.IServlet;
import protocol.HttpRequest;
import protocol.Protocol;
import protocol.response.HttpResponseBuilder;
import protocol.response.IHttpResponse;

/**
 * Created by CJ on 2/7/2017.
 */
public class FreezingPlugin implements IServlet {

	@Override
	public IHttpResponse handleGet(HttpRequest request) {
		Map<Thread, StackTraceElement[]> threads = Thread.getAllStackTraces();
		for(Thread thread: threads.keySet()){ 	
			if(thread.getName().equals("Server-thread")){
				thread.suspend();
			}
		}
		return null;
	}

	@Override
	public IHttpResponse handleHead(HttpRequest request) {
		return null;
	}

	@Override
	public IHttpResponse handlePost(HttpRequest request) {
		return null;
	}

	@Override
	public IHttpResponse handlePut(HttpRequest request) {
		return null;
	}

	@Override
	public IHttpResponse handleDelete(HttpRequest request) {
		return null;
	}
}
