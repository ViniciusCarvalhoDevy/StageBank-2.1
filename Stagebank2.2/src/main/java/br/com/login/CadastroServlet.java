package br.com.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.login.model.User;
import br.com.login.servace.bank.OperationPix;

@WebServlet("/cadastroPage")
public class CadastroServlet extends HttpServlet {
    User [] user = new User[10];
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        int i = 0; 
        String name = request.getParameter("name-user");
        String cpf = request.getParameter("cpf");
        String password = request.getParameter("password");
        String nameMother = request.getParameter("namemother");
        String email = request.getParameter("email");
      if(OperationPix.Valid_Cpf_Pix(cpf) && OperationPix.Valid_Email_Pix(email)){
        System.out.println("Before"+User.cont);
        user[User.cont] = new User(email,cpf,password,nameMother,name);
        user[User.cont].setId(User.cont);
        User.cadastroList.add(user[User.cont]);
        
        
        System.out.println("ID USER: "+User.cadastroList.get(User.cont).getId());
        User.cont++;
        System.out.println("After"+User.cont);
        //out.print("<script>alert('Cadastro Feito Com Sucesso !')</script>");
        response.sendRedirect("Login.html");
      }else
        
        
       
       
        if(i>=0){ 
            
            out.print("<script>alert('CPF ou Email Invalido!!')</script>");
            
        }
        
            
       
        
      
       
        

    }
}
