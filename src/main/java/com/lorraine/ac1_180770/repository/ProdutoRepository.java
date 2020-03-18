package com.example.prj_180281.repository;

import java.util.HashMap;

import com.example.prj_180281.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> hm = new HashMap<Integer, Produto>(); 

    public ProdutoRepository(){
        hm.put(1, new Produto(1, "Last Day On Earth", 10, 698));
        hm.put(2, new Produto(2, "Apex", 45, 32));
        hm.put(3, new Produto(3, "Fortinite", 879, 54));
        hm.put(4, new Produto(4, "Overwatch", 15, 45));
        hm.put(5, new Produto(5, "Slay the Spire", 87, 51));
        hm.put(6, new Produto(6, "Undertale", 21, 23));
        hm.put(7, new Produto(7, "Assassin’s Creed Odyssey", 156, 15));
        hm.put(8, new Produto(8, "Terraria", 20, 47));
        hm.put(9, new Produto(9, "Resident Evil", 120, 78));
        hm.put(10, new Produto(10, "The Legend of Zelda: Breath Of The Wild", 230, 67));
    }
    //Testar com int, se der erro mudar para Integer (argumento)
    public Produto getProdutoById(int cod){
        return hm.get(cod);
    }

    public HashMap<Integer, Produto> getProdutos(){
        return hm;
    }
}