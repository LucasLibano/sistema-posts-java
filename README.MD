Sistema de Posts com Comentários (Java)

Este projeto é uma aplicação simples desenvolvida em Java com o objetivo de praticar conceitos fundamentais de Programação Orientada a Objetos (POO), como composição, encapsulamento e uso de listas.

Funcionalidades
Criar um post
Adicionar comentários a um post
Remover comentários
Exibir dados do post com seus comentários
Formatação de data
Conceitos aplicados
Programação Orientada a Objetos (POO)
Encapsulamento
Composição entre classes
Uso de listas (List e ArrayList)
Manipulação de datas (SimpleDateFormat)
Sobrescrita do método toString()
Estrutura do projeto

O sistema é composto por três classes principais:

Post — representa uma publicação


Comentario — representa um comentário associado ao post


Main — responsável pela execução do programa


Exemplo de uso

Um post pode conter vários comentários, e esses comentários são armazenados em uma lista dentro da classe Post.

Post post = new Post(...);

Comentario c1 = new Comentario("Muito bom!");


Comentario c2 = new Comentario("Gostei bastante!");



post.addComentario(c1);
post.addComentario(c2);

Exemplo de saída

Viajando para a Nova Zelandia

12 Likes - 21/06/2018 13:05:44

Um lugar maravilhoso

Comentarios:

Muito bom!

Isso é incrivel

Objetivo

Este projeto foi desenvolvido com foco em aprendizado, visando consolidar conceitos importantes de Java e preparar a base para projetos mais avançados.
