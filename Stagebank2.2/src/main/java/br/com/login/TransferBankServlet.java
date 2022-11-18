package br.com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.login.model.User;
import br.com.login.servace.bank.Operation_Bank_Data;
@WebServlet("/transferenciaPage")
public class TransferBankServlet extends HttpServlet{

    int i=0;
    Boolean confirma = false;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter();
        String name_bank = request.getParameter("name-bank");
       String agency = request.getParameter("agencia");
       String account = request.getParameter("conta-sem-digito");
       String digit = request.getParameter("digito");
       String value = request.getParameter("valor_transferencia");
       float valueFloat = Float.parseFloat(value);
       int agencyInt = Integer.parseInt(agency);
       int accountInt = Integer.parseInt(account);
       int digitInt = Integer.parseInt(digit);

       if(Operation_Bank_Data.Valid_Action(agencyInt, accountInt, digitInt)){
            Operation_Bank_Data.transfer(User.cadastroList.get(User.ID_Reference_page), name_bank, valueFloat, agencyInt, accountInt, digitInt);
            out.println("<script>alert('Transferencia Feito Com Sucesso!')</script>");
            System.out.println("ID User: "+User.ID_Reference_page);
            System.out.println("Saldo Do Banco Do User: "+User.cadastroList.get(User.ID_Reference_page).get_Bank_Balance_Client());
       }else{
          out.println("<script>alert('Dados do Banco Invalidos!')</script>");
       }

    }
    
}
