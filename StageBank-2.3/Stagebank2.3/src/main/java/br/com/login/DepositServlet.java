package br.com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.model.User;

import br.com.login.servace.bank.OperationPix;

@WebServlet("/DepositoPage")
public class DepositServlet extends HttpServlet {
int i=0;
boolean confirma =false;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String cpf =  request.getParameter("cpf");
       String value = request.getParameter("value_deposit");
       float value_int = Float.parseFloat(value);
        int tam =User.cadastroList.size();
       for(i=0;i<tam;i++){
        if(User.cadastroList.get(i).getCpf().equals(cpf)) {
            confirma = true;
            break;
        }
    }
       if(OperationPix.Valid_Cpf_Pix(cpf)  && confirma){
        User.cadastroList.get(i).set_Deposit_Bank_Balance(value_int);
       System.out.println(User.cadastroList.get(i).get_Bank_Balance_Client()); 
        out.println("<script>alert('Deposito Feito Com Sucesso!')</script>");
     
        response.sendRedirect("index.jsp");
        
    }else
        out.println("<script>alert('Erro!! No Deposito! CPF Invalido!!')</script>");
}



} 

