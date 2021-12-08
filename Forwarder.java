

public class Forwarder {
	
	private Receiver varreceiver;
	private Peer varpeer;
	
	public void sendMessage(String msg, Peer dest, Peer src) {
	Receiver r = dest.getReceiver();
	r.receiveMessage(msg, src);
	}
	
	public Receiver getReceiver() {
	return varreceiver;
	}
	
	public void setReceiver(Receiver tr) {
	varreceiver = tr;
	}
	
	public Peer getPeer() {
	return varpeer;
	}
	
	public void setPeer(Peer tp) {
	varpeer= tp;
	}

}
