package br.com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.model.User;

@WebServlet("/CartaoDigitalusuario")
public class DigitalCardVisualizacao extends HttpServlet {
    

    
 @Override
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
 
        PrintWriter out = response.getWriter();
    if(User.cadastroList.get(User.ID_Reference_page).getName_card() != null){
        
         out.println("<html lang='pt-br'>");
         out.println("<head>");
         out.println("<title>STAGEBANK</title>");
         out.println("<style>");
         out.println("header{ background-color: #BF0B3B; position: fixed; width: 100%; top: 0; right: 0; z-index: 5; opacity: 1;}");
        out.println("body{ background:linear-gradient(360deg, rgb(0,0,0), #ff0044); margin-bottom: 40%;}");
        out.println(".title{ display: flex; justify-content: center; color: #f2f2f2; font-family: 'Roboto Mono', monospace; font-size: 50px; margin-top: 10%;}");
        out.println(".navbar{ display: flex; justify-content: space-around;}");
        out.println(".navbar li{display: inline-block; font-size: 15px; font-weight: 500; padding: 10px 15px; font-family: 'Roboto Mono', monospace; color: #f2f2f2; list-style: none;}");
        out.println(".navbar a{ list-style: none; text-decoration: none; color: #BF0B3B; display: flex; justify-content: space-around; background-color: #f2f2f2; border-radius: 40px; color: #BF0B3B; letter-spacing: 1px; transition: ease .50s; font-family: 'Roboto Mono', monospace; padding: 15px 20px;}");
        out.println(".navbar a:hover{ color: #f2f2f2; background-color: #BF0B3B; border: 10px solid ; display: flex; justify-content: center;}");
        out.println("#navbar-itens{ color: #F2F2F2; font-family: 'Roboto Mono', monospace; font-size: 35px;}");
        out.println(".container-card{ box-sizing: border-box; position: absolute; width: 800px;height: 400px;left: 290px; top: 280px; background:linear-gradient(360deg, rgb(0,0,0), #ff0044);border: 1px solid #000000; box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25); border-radius: 25px;}");
        out.println(".title-card{ margin-left: 40%; font-family: 'Roboto Mono', monospace; color: #f2f2f2; font-size: 30px;}");
        out.println(".name-card{font-family: 'Roboto Mono', monospace; color: #f2f2f2; margin-left: 8%; margin-top: 10%; font-size: 20px;}");
        out.println(".number-card{ display: flex; color: #f2f2f2; top: 200px; line-height: 190px; margin-left: 8%; font-size: 25px;}");
        out.println(".validade-card{ position: absolute; width: 63px; margin-left: 8%; top: 60px; font-family: 'Inter'; font-style: italic; font-weight: 500; font-size: 20px; line-height: 260px; color: #f2f2f2;}");
        out.println(".cvv{ position: absolute; width: 63px; left: 570px; top: 200px; font-family: 'Inter'; font-style: italic; font-weight: 500; font-size: 20px; color: #f2f2f2; line-height: 135px;}");
         out.println("</style>");
         out.println("</head>");
         out.println("<body>");
         out.println("<header>");
         out.println("<div class='navbar'>");
         out.println("<ul class='navbar-user'>");
         out.println("<li id='navbar-itens'>STAGEBANK</li>");
         out.println("</ul>");
         out.println("<ul class='navbar-options'>");
         out.println("<li> <a href=''>ACESSAR OUTRA CONTA</a> </li>");
         out.println("<li> <a href='http://localhost:8080/StageBank/'>SAIR</a> </li>");
         out.println("</ul>");
         out.println("</div>");
         out.println("</header>");
         out.println("<section>");
         out.println("<h1 class='title'>VEJA COMO ESTÁ SEU CARTÃO</h1>");
         out.println("<div class='container-card'>");
         out.println("<p class='title-card'>STAGEBANK</p>");
         
         out.println("<p class='name-card'>" + User.cadastroList.get(User.ID_Reference_page).getComplete_name()+"</p>");
         out.println("<p class='number-card'>"+User.cadastroList.get(User.ID_Reference_page).getNumber_card() +"</p>");
         out.println("<p class='validade-card'>"+User.cadastroList.get(User.ID_Reference_page).getValidity_data_card() +"</p>");
         out.println("<p class='cvv'>"+User.cadastroList.get(User.ID_Reference_page).getCod_security_card()+"</p>");
         out.println("</div>");
         out.println("<section>");
         out.println("</body>");
         out.println("</html>");
    }else 
        out.println("<script>alert('Voce Ainda Não Cadastrou Seu Cartão Virtual!')</script>");

       



    }   
}
