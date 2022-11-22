package br.com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.model.User;

@WebServlet("/estrato")
public class ExtractServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter writer = resp.getWriter();

       String [][] extracttStrings = new String[10][200]; 

       writer.println("<html lang='pt-br'>");
            writer.println("<head>");
                writer.println("<title>SALDO-STAGE</title>");
                writer.println("<style>");
                    writer.println(" body{ display:block; margin-bottom: 1.3cm; background:linear-gradient(360deg, rgb(0,0,0), #ff0044); align-items: center; text-align: center;}");
                    writer.println(".container{ background: #f2f2f27a; width: 700px; height: 400px; border-radius: 10px; padding-left: 0; padding-right: 0; margin-top: 1.5cm; padding-top: 2cm; padding-bottom: 2cm; margin-left:8.5cm;}");
                    writer.println(".areabutton button { padding: 10px 35px 10px 35px; border-radius: 6px; cursor: pointer;}");
                    writer.println(" h1{ padding-top: 3cm; font-size: 30px; font-weight: 500; color: black; font-family: 'Times New Roman', Times, serif;}");
                    writer.println(" h2{font-size: 30px; font-weight: 500; color: black; font-family: 'Times New Roman', Times, serif;}");
                writer.println("</style>");
            writer.println("</head>");
            writer.println("<body>");
                writer.println("<div class='container'>");
               
                    /*writer.println(User.getExtract()+"<br>");
                    writer.println(User.getExtract()+"<br>");

                    writer.println("|REferenciado|");
                writer.println(User.cadastroList.get(User.ID_Reference_page).getExtract22()+"<br>");
                    writer.println(User.cadastroList.get(User.ID_Reference_page).getExtract22()+"<br>");
                   
                    
                      System.out.println("Numero do usuario: "+User.ID_Reference_page);*/
                  
                    
                    
                    
                   
                  
                    //writer.println("<h1>Olá "+User.cadastroList.get(User.ID_Reference_page).getRegister()+" <br></h1>");
                
                    writer.println("<div class='areabutton'>");
                    writer.println("<a href='http://localhost:8080/StageBank/homepageUser.html'> <button>Voltar</button></a>");
                    writer.println("</div>");
                    writer.println("</div>");
            writer.println("</body>");
       writer.println("</html>");



      /*writer.println("<html>");
            writer.println("<head>");
                writer.println("<style>");

                writer.println("<html>");
                writer.println("<html>");
                writer.println("<html>");
                writer.println("<html>");
                writer.println("<html>");
                writer.println("<html>");

                
                writer.println("</style>");

            writer.println("</head>");
            writer.println("<body>");

            writer.println("</body>");
        writer.println("</ht  ml>");*/
        
        
    
    }

}
