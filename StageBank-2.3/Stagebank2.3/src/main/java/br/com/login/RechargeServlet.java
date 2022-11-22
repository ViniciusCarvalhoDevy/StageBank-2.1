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


@WebServlet("/recarga")
public class RechargeServlet extends HttpServlet {
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String number = req.getParameter("numero");
        String valueText = req.getParameter("valor");
        float value = Float.parseFloat(valueText);
        if(OperationPix.Valid_Phone_Pix(number)){
             OperationPix.Cell_Recharge(User.cadastroList.get(User.ID_Reference_page), number, value,out);
        }else 
        out.println("<script>alert('Numero Invalido!!')</script>");
       

    }
}
