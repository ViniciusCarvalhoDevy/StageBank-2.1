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

@WebServlet("/allPix")
public class PixServlet extends HttpServlet{
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter();
        String key_cpf_cnpj = request.getParameter("pix");
        String value_pix = request.getParameter("valor");
        float value_pix_float = Float.parseFloat(value_pix);

        if(OperationPix.Valid_Key_Pix(key_cpf_cnpj)){

        int type = OperationPix.Type_pix_validity(value_pix);

        OperationPix.Transfer(User.cadastroList.get(User.ID_Reference_page), key_cpf_cnpj, value_pix_float, type,out);

        }else{
            out.println("<script>alert('Chave do Pix Inválida!!')</script>"); 
        }

        System.out.println("Valor do Saldo User: "+User.cadastroList.get(User.ID_Reference_page).get_Bank_Balance_Client());
    }
    
}
 