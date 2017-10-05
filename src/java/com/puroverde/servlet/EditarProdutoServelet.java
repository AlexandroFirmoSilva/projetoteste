/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puroverde.servlet;

import com.projeto.puroverde.entity.Produto;
import com.puroverde.service.ProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wilma
 */
@WebServlet(name = "EditarProdutoServelet", urlPatterns = {"/EditarProdutoServelet"})
public class EditarProdutoServelet extends HttpServlet {
     ProdutoService ps = new ProdutoService();
     Produto p = new Produto();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        p.setId(Long.parseLong(req.getParameter("id")));
        p.setNome(req.getParameter("nome"));
        p.setDescricao(req.getParameter("descricao"));
        p.setUnidade(req.getParameter("unidade"));
        p.setValorUnitario(Double.parseDouble(req.getParameter("valor")));
        p.setQuantidadeEstoque(Integer.parseInt(req.getParameter("estoque")));
        ps.atualizar(p);
        PrintWriter out = resp.getWriter();
        out.print("<html><body>Produto atuliazado</br><a href='http://localhost:8080/puroverdeweb/listarprodutos.jsp'>volta</a></body></html>");
        
        //To change body of generated methods, choose Tools | Templates.
    }
     
    }
