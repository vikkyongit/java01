public class Peer {
	public Forwarder varforwarder;
	public Receiver varreceiver;
	public String varname;
	
	Peer(String n){
	varname=n;
	}
	
	public void service(String msg, Peer dest) {
		System.out.println("Sending Msg to : "+dest);
		System.out.println("Message : "+ msg);
		this.varforwarder.sendMessage(msg, dest, this);
	}
	
	public Forwarder getForwarder() {
	return varforwarder;
	}
	
	public void setForwarder(Forwarder tf) {
	varforwarder = tf;
	}
	
	
	public Receiver getReceiver() {
	return varreceiver;
	}
	public void setReceiver(Receiver tr) {
	varreceiver = tr;
	}
	
	
	public static void main(String[] args) {
	Forwarder f1 = new Forwarder();
	Forwarder f2 = new Forwarder();
	
	Receiver r1 = new Receiver();
	Receiver r2 = new Receiver();
	
	Peer p1=new Peer("Peer 1");
	p1.setForwarder(f1);
	p1.setReceiver(r1);
	
	Peer p2=new Peer("Peer 2");
	p2.setForwarder(f2);
	p2.setReceiver(r2);
	p1.service("Its peer1 ",p2);
	}


}
