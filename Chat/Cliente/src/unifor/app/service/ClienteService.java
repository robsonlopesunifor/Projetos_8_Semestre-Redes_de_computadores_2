/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unifor.app.service;

import unifor.app.bean.ChatMessage;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import unifor.app.service.ClienteCriptografia;

public class ClienteService {
    
    private Socket socket;
    private ObjectOutputStream output;
    private ClienteCriptografia criptografa = new ClienteCriptografia();
    
    public Socket connect() {
        try {
            this.socket = new Socket("localhost", 5555);
            this.output = new ObjectOutputStream(socket.getOutputStream());
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return socket;
    }
    
    public void send(ChatMessage message) {
        try {
            System.out.println("::: Chave Publica" + this.criptografa.getChavePublica() + " :::");
            output.writeObject(message);
        } catch (IOException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
