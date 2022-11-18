package br.com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.model.ADM;
import br.com.login.model.Manager;
import br.com.login.model.User;
import br.com.login.servace.bank.OperationPix;


@WebServlet("/LoginPage")
public class LoginServlet extends HttpServlet {
public static int i=0;

ADM adm= new ADM();
Manager manager = new Manager();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter(); 
       String login = request.getParameter("cpf") ;
        String password = request.getParameter("password") ;
        Boolean confirma=false;
    if(OperationPix.Valid_Cpf_Pix(login)){
        int tam = User.cadastroList.size();
        if(adm.getCpf_login().equals(login) && adm.getPassword_adm().equals(password)){
            out.println("<script>alert('Login Feito Com Sucesso Administrador!')</script>");
            i=-1;
        }else if (manager.getManagerCPF_login().equals(login) && manager.getPassword_manager().equals(password)){
            out.println("<script>alert('Login Feito Com Sucesso Gerente!')</script>");
            i=-1;
        }else{
            for(i=0;i<tam;i++){
                if(User.cadastroList.get(i).getCpf().equals(login) && User.cadastroList.get(i).getPassword().equals(password)) {
                    
                    confirma = true;
                    break;
                }
            }
            User.ID_Reference_page = User.cadastroList.get(i).getId();
            System.out.println("ID pos Login:"+User.cadastroList.get(i).getId());

            if(confirma && i>=0){
                out.println("<script>alert('Login Feito Com Sucesso!')</script>");
                
            }
    }
    
    
 response.sendRedirect("homepageUser.html");
                
            
            
}else 
out.println("<script>alert('Login ou senha Icorretos! Tente Novamente!')</script>");
           
        
     
   
     

          
        
      
        
       
       /*System.out.println(User.cadastroList.get(i).getComplete_name());
      
        System.out.println(User.cadastroList.get(i).getEmail());
        System.out.println(User.cadastroList.get(i).getMother_name());

        
        if(Data_bank.Funcionario.contains(log+pass) && Data_bank.Funcionario.indexOf(log) ==0){
            System.out.print("Login Feito Com Sucesso Administrador!\r\n");
            return -007;

        }else if(Data_bank.Funcionario.contains(log+pass) ){
            System.out.print("Login Feito Com Sucesso Gerente!\r\n");
            return -47;

        }else*/ 
            
        
        
        
    }

    }
    

