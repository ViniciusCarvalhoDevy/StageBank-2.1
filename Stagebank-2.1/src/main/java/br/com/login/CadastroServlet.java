package br.com.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.login.model.User;

@WebServlet("/cadastroPage")
public class CadastroServlet extends HttpServlet {
    User [] user = new User[10];
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int i = 0;
        String name = request.getParameter("name-user");
        String cpf = request.getParameter("cpf");
        String password = request.getParameter("password");
        String nameMother = request.getParameter("namemother");
        String email = request.getParameter("email");

        user[i] = new User(email,cpf,password,nameMother,name);
        User.cadastroList.add(i,user[i]);
        i++;
        PrintWriter out = response.getWriter();
        out.println("<script>alert('Cadastro efetuado com sucesso')</script>");
        response.sendRedirect("Login.html");
       
        

    }
}
