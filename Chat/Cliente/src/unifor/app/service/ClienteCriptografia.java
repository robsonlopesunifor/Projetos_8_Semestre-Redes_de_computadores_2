/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifor.app.service;

/**
 *
 * @author robson
 */
public class ClienteCriptografia {

    private String chavePublica;
    private String chavePrivada;
    private String chaveDES;
    private String chavePublicaDoServidor;
    
    public ClienteCriptografia()
    {
        this.chavePublica = "chavePublica";
        this.chavePrivada = "chavePrivada";
        this.chaveDES = "chaveDES";
        this.chavePublicaDoServidor = "chavePublicaDoServidor";
    }
    
    public String getChavePublica(){
        return this.chavePublica;
    }
    
    public void setChavePublicaDoServidor(String chavePublicaDoServidor){
        this.chavePublica = chavePublicaDoServidor;
    }
    
    public String criptografarTexto(String menssagem){
        return menssagem;
    }
    
}
