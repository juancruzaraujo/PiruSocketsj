package testClientServer;

import piruSockets.PiruSockets;
import piruSockets.Protocol;
import piruSockets.Protocol.ProtocolType;

public class Main {
	
	static PiruSockets piruSockets;
	
	public static void main(String[] args) {
		
		String mode = "";
        String host = "";
        String protocol = "";
        String maxConnections = "";
        String port="";
        
        int nPort = 0;
        int nMaxConnections = 0;
		
		
		if ((args.length < 3) || (args.length > 4) ) {
            System.out.println("Debe ingresar 3 parámetros: [c/s] [host/port] [tcp/udp]");
            System.out.println("Modo cliente [c] [host] [port] [max connections] [protocolo]");
            System.out.println("Modo servidor [s][port] [protocolo]");
            return;
        }
        		
		mode = args[0];
		piruSockets = new PiruSockets();
		Protocol.ProtocolType protocolType = null;
		protocol = args[3];
		
        if (mode.equals("c")) {
        	
        	port = args[1];
        	maxConnections = args[2];
        	
        	nPort = Integer.parseInt(port);
        	nMaxConnections = Integer.parseInt(maxConnections);
        	
        	if (protocol.equals("tcp"))
        	{
        		protocolType = ProtocolType.TCP;
        	}
        	if (protocol.equals("udp"))
        	{
        		protocolType = ProtocolType.UDP;
        	}
        	
        	piruSockets.StartServer(nPort, nMaxConnections,protocolType);
        	
            System.out.println("modo cliente, conectado al host "  + " en el protocolo "  );
        }  
        
        if (mode.equals("s")) {
        	port = args[1];
        	protocol = args[2];
            System.out.println("modo servidor, escuchando en el puerto "  + " con protocolo " + protocol);
        }
        
        
        
        if (mode.equals("c"))
        {
        	Protocol protocol1 = new Protocol(); 
        	
        	
        }else if (mode.equals("s")) {
        	//piruSockets.ConnectToHost(0, host, null);
        }
        
        
    }
}
