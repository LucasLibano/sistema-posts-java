package aplication;


import entidades.Comentario;
import entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem!");
        Comentario c2 = new Comentario("Isso é incrivel");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para a Nova Zelandia", "Um lugar maravilhoso", 12);

        Comentario c3 = new Comentario("Boa Noite!");
        Comentario c4 = new Comentario("Que Deus esteja com você");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa Noite pessoal", "Até amanha", 5);
        p2.addComentario(c3);
        p2.addComentario(c4);



        System.out.println(p1);
        System.out.println(p2);


        }
    }
