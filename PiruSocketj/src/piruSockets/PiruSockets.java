package piruSockets;


public class PiruSockets 
{
	public void StartServer(int port,int maxConnections,Protocol.ProtocolType protocolType)
	{
		System.out.println("modo server");
	}
	
	public void ConnectToHost(int port, String host, Protocol.ProtocolType protocolType)
	{
		System.out.println("modo client");
	}
}
