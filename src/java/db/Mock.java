/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;

/**
 *
 * @author brunosakamoto5
 */
public class Mock {

   private static ArrayList<Produto> lista;

   public static void makeMock(){
      if(lista == null){
         lista = Produto.getLista();

         Produto caneta = new Produto(); //1
                 caneta.setDescricao("Caneta Bic");
                 caneta.setPreco(1.5f);
                 caneta.setOferta(true);
                 lista.add(caneta);

         Produto computador = new Produto(); //2
                 computador.setDescricao("Computador não da NASA");
                 computador.setPreco(3500.0f);
                 computador.setOferta(true);
                 lista.add(computador);

         Produto caderno = new Produto(); //3
                 caderno.setDescricao("Caderno");
                 caderno.setPreco(5.5f);
                 caderno.setOferta(true);
                 lista.add(caderno);

         Produto caneca = new Produto(); //4
                 caneca.setDescricao("Caneca");
                 caneca.setPreco(10.f);
                 caneca.setOferta(false);
                 lista.add(caneca);

         Produto lapis = new Produto(); //5
                 lapis.setDescricao("Lapis");
                 lapis.setPreco(1.0f);
                 lapis.setOferta(false);
                 lista.add(lapis);

         Produto borracha = new Produto(); //6
                 borracha.setDescricao("Lapis");
                 borracha.setPreco(1.5f);
                 borracha.setOferta(false);
                 lista.add(borracha);

         Produto Cartolina = new Produto(); //7
                 Cartolina.setDescricao("Cartolina");
                 Cartolina.setPreco(2.0f);
                 Cartolina.setOferta(false);
                 lista.add(Cartolina);

         Produto Fone_Renzer = new Produto(); //8
                 Fone_Renzer.setDescricao("Fone da cobrinha");
                 Fone_Renzer.setPreco(500.0f);
                 Fone_Renzer.setOferta(true);
                 lista.add(Fone_Renzer);


      }


   }






}
