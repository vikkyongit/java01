

public class Receiver {
	
	private Forwarder varforwarder;
	private Peer varpeer;
	
	public void receiveMessage(String msg, Peer src) {
	System.out.println("Msg Received from Source : "+src );
	System.out.println("Message: "+msg);
	}
	
	public Forwarder getForwarder() {
	return varforwarder;
	}
	
	public void setForwarder(Forwarder tf) {
	varforwarder = tf;
	}
	
	public Peer getPeer() {
	return varpeer;
	}
	
	public void setPeer(Peer tp) {
	varpeer= tp;
	}

}
