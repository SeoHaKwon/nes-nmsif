package common.utils;

import java.net.URI;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NmsSocketUtils extends WebSocketClient {
	
	private JSONObject obj;

	public NmsSocketUtils(URI serverUri, Draft protocolDraft) {
		super(serverUri, protocolDraft);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {
		System.out.println("onClose");
	}
	
	@Override
	public void onError(Exception arg0) {
		arg0.printStackTrace();
	}
	
	@Override
	public void onMessage(String json) {
		try {
			obj = (JSONObject) new JSONParser().parse(json);
			System.out.println(obj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onOpen(ServerHandshake arg0) {
		System.out.println("onOpen");
	}
	
	public JSONObject getResult() {
		return this.obj;
	}
}
