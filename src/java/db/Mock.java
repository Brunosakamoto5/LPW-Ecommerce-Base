/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

/**
 *
 * @author brunosakamoto5
 */
public class Mock {



  public static void makeMock(){
     createUsers();
     createProducts();

  }

   private static void createUsers(){
      ArrayList<Usuario> lista;

      if(Usuario.getLista().isEmpty()){
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome ("Administrador");
         lista.add(admin);

         Usuario gerente = new Usuario();
         gerente.setEmail("gerente@ifpr.edu.br");
         gerente.setSenha("gerente");
         gerente.setNome ("Gerente Da Lojinha");
         lista.add(gerente);



      }


   }


   private static void createProducts(){
      ArrayList<Produto> lista;

      //so cria produtos com lista vazia
      if(Produto.getLista().isEmpty()){
         lista = Produto.getLista();

         Produto caneta = new Produto(); //1
                 caneta.setDescricao("Caneta Bic");
                 caneta.setPreco(1.5f);
                 caneta.setOferta(true);
                 caneta.setImagem("https://www.noffice.com.br/wp-content/uploads/2019/08/caneta-esferografica-bic-07-azul-600x600.jpg");
                 lista.add(caneta);


         Produto computador = new Produto(); //2
                 computador.setDescricao("Computador não da NASA");
                 computador.setPreco(3500.0f);
                 computador.setOferta(true);
                 computador.setImagem("");
                 lista.add(computador);

         Produto caderno = new Produto(); //3
                 caderno.setDescricao("Caderno");
                 caderno.setPreco(5.5f);
                 caderno.setOferta(true);
                 caderno.setImagem("");
                 lista.add(caderno);

         Produto caneca = new Produto(); //4
                 caneca.setDescricao("Caneca");
                 caneca.setPreco(10.f);
                 caneca.setOferta(false);
                 caneca.setImagem("");
                 lista.add(caneca);

         Produto lapis = new Produto(); //5
                 lapis.setDescricao("Lapis");
                 lapis.setPreco(1.0f);
                 lapis.setOferta(false);
                 lapis.setImagem("");
                 lista.add(lapis);

         Produto borracha = new Produto(); //6
                 borracha.setDescricao("Borracha");
                 borracha.setPreco(1.5f);
                 borracha.setOferta(false);
                 borracha.setImagem("");
                 lista.add(borracha);

         Produto Cartolina = new Produto(); //7
                 Cartolina.setDescricao("Cartolina");
                 Cartolina.setPreco(2.0f);
                 Cartolina.setOferta(false);
                 Cartolina.setImagem("");
                 lista.add(Cartolina);

         Produto Fone_Renzer = new Produto(); //8
                 Fone_Renzer.setDescricao("Fone da cobrinha");
                 Fone_Renzer.setPreco(500.0f);
                 Fone_Renzer.setOferta(true);
                 lista.add(Fone_Renzer);

         Produto Pen_Drive = new Produto(); //9
                 Pen_Drive.setDescricao("OSU Power Play");
                 Pen_Drive.setPreco(5.0f);
                 Pen_Drive.setOferta(false);
                 lista.add(Pen_Drive);


      }


   }






}
