package br.com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.model.User;
import br.com.login.servace.bank.card_digital;


@WebServlet("/cadastrocard")
public class CardCadastro extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /**/ PrintWriter out = response.getWriter();
        String nameUser_card = request.getParameter("nameUser_card");
        String number_card = request.getParameter("number_card");
        String validade_card = request.getParameter("validade_card");
        String cvv_card = request.getParameter("cvv_card");
         int cvv_card_Int = Integer.parseInt(cvv_card);

       if(card_digital.Validity_All(number_card, validade_card, cvv_card_Int)){
        User.cadastroList.get(User.ID_Reference_page).setCod_security_card(cvv_card_Int);
        User.cadastroList.get(User.ID_Reference_page).setNumber_card(number_card);
        User.cadastroList.get(User.ID_Reference_page).setValidity_data_card(validade_card);
        User.cadastroList.get(User.ID_Reference_page).setName_card(nameUser_card);
        System.out.println(User.cadastroList.get(User.ID_Reference_page).getName_card());
        System.out.println( User.cadastroList.get(User.ID_Reference_page).getNumber_card());
        System.out.println(User.cadastroList.get(User.ID_Reference_page).getValidity_data_card());
        System.out.println(User.cadastroList.get(User.ID_Reference_page).getCod_security_card());   
        out.println("<script>alert('Cadastro do Cartao Digital Feita Com Sucesso!')</script>");
       }else
       out.println("<script>alert('ERRO! No Cadastro do Cartao Digital!')</script>");
       
    }
     
}
