

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet({ "/TrataRequisicao", "/HelloWorld", "/servlet/hello" })
public class TrataRequisicao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrataRequisicao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Imprime uma resposta do servlet para o client;
		/*PrintWriter saida = response.getWriter();
		
		saida.print("<h1> Hello World </h1>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession         sessao      = request.getSession();
		RequestDispatcher   despachante = request.getRequestDispatcher("Saida.jsp");
		
		
		String usuario = request.getParameter("nmusuario");
		String senha = request.getParameter("nmsenha");
		
		if(usuario.equals("adm") && senha.equals("123")){
			
			sessao.setAttribute("attrMensagem", "Usuário logado com sucesso");
		} else {
			
			sessao.setAttribute("attrMensagem", "Usuário ou senha incorreta!");
		}
		
		
		despachante.forward(request, response);
		
		/* System.out.println("O usuário " + usuario);
		System.out.println("com a senha " + senha);
		System.out.println("acabou de se logar"); */
		
	}

}
