/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar;

/**
 *
 * @author Richa
 */
public class Marcas_Modelos {
    private String nomemarca, nomemodelos;

    public Marcas_Modelos() {
    }

    public Marcas_Modelos(String nomemarca, String nomemodelos) {
        this.nomemarca = nomemarca;
        this.nomemodelos = nomemodelos;
    }

    public String getNomemarca() {
        return nomemarca;
    }

    public void setNomemarca(String nomemarca) {
        this.nomemarca = nomemarca;
    }

    public String getNomemodelos() {
        return nomemodelos;
    }

    public void setNomemodelos(String nomemodelos) {
        this.nomemodelos = nomemodelos;
    }

    @Override
    public String toString() {
        return "Marcas_Modelos{" + "nomemarca=" + nomemarca + ", nomemodelos=" + nomemodelos + '}';
    }
    
    
}
