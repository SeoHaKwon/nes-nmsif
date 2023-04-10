//package common.utils;
//
//import com.fasterxml.jackson.databind.JsonNode;
//
//import okhttp3.Response;
//import okhttp3.WebSocket;
//import okhttp3.WebSocketListener;
//
//public class NmsSocket extends WebSocketListener {
//	private static final int NORMAL_CLOSURE_STATUS = 1000;
//	private String json;
//	
//	@Override
//	public void onClosed(WebSocket ws, int code, String reason) {
//		System.out.printf("Socket Closed : %s / %s\r\n", code, reason);
//	}
//	
//	@Override
//	public void onClosing(WebSocket ws, int code, String reason) {
//		System.out.printf("Socket Closed : %s / %s\r\n", code, reason);
//		ws.close(NORMAL_CLOSURE_STATUS, null);
//		ws.cancel();
//	}
//	
//	@Override
//	public void onFailure(WebSocket ws, Throwable t, Response rs) {
//		System.out.println("Socket Err : " + t.getMessage());
//	}
//	
//    @Override
//    public void onMessage(WebSocket webSocket, String text) {
////        JsonNode jsonNode = JsonUtil.fromJson(text, JsonNode.class);
////        System.out.println(jsonNode.toPrettyString());
//    }
//}
