/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rafae
 */
public class UsuarioLogado {
    private static Autenticavel usuarioLogado;
    
    public static void setUsuarioLogado(Autenticavel usuario) {
        usuarioLogado = usuario;
    }
    
    public static Autenticavel getUsuarioLogado() {
        return usuarioLogado;
    }
    
    public static void limparSessao() {
        usuarioLogado = null;
    }
}
