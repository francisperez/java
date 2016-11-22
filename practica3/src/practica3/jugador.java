/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author franc
 */
public class jugador {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public personaje[] getLista_personajes() {
        return lista_personajes;
    }

    public void setLista_personajes(personaje[] lista_personajes) {
        this.lista_personajes = lista_personajes;
    }

    public int getTotal_personajes() {
        return total_personajes;
    }

    public void setTotal_personajes(int total_personajes) {
        this.total_personajes = total_personajes;
    }

    public int getBatallas_ganadas() {
        return batallas_ganadas;
    }

    public void setBatallas_ganadas(int batallas_ganadas) {
        this.batallas_ganadas = batallas_ganadas;
    }

    public int getBatallas_perdidas() {
        return batallas_perdidas;
    }

    public void setBatallas_perdidas(int batallas_perdidas) {
        this.batallas_perdidas = batallas_perdidas;
    }

    public jugador(String id, String login, String password, personaje[] lista_personajes, int total_personajes, int batallas_ganadas, int batallas_perdidas) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.lista_personajes = lista_personajes;
        this.total_personajes = total_personajes;
        this.batallas_ganadas = batallas_ganadas;
        this.batallas_perdidas = batallas_perdidas;
    }

    public jugador() {
    }
    protected String id;
    protected String login;
    protected String password;
    protected personaje []lista_personajes;
    protected int total_personajes;
    protected int batallas_ganadas;
    protected int batallas_perdidas;
    
    
    
}
