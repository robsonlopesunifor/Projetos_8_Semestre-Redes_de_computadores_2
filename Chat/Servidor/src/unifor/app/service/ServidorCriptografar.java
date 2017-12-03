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
public class ServidorCriptografar {
    
    private String chavePublica;
    private String chavePrivada;
    private String chavesDES;
    private String chavePublicaDoServidor;
    
    public ServidorCriptografar()
    {
        this.chavePublica = "chavePublica";
        this.chavePrivada = "chavePrivada";
        this.chavePublicaDoServidor = "chavePublicaDoServidor";
    }
    
    public String getChavePublica(){
        return this.chavePublica;
    }
    
    public void obtendoDESDescriptografandoComChavePrivada(String DESCriptografado){
        this.chavePublica = chavePublicaDoServidor;
        this.chavesDES = "chave des do robson";
    }
    
    public void setChavePublicaDoCliente(String chavePublicaDoServidor){
        this.chavePublica = chavePublicaDoServidor;
    }
    
    public String criptografarTextoComDES(String menssagem){
        return menssagem;
    }
    
}
