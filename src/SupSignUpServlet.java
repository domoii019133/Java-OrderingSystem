

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

@WebServlet("/SupSignUpServlet")
public class SupSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DataSource ds;
	Connection conn = null;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/XXDB");
			if (ds == null)
				throw new ServletException("Unknown DataSource 'jdbc/XXDB'");
		} catch (NamingException ex) {
			ex.printStackTrace();
		}

		

		try {
			conn = ds.getConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 設定顯示中文
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html ; charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		// 設定廠商資訊
		String sqlId    = request.getParameter("id");
		String sqlName  = request.getParameter("name");
		String sqlPhone = request.getParameter("phone");
		
		// 表單為空值時，返回SupSignUpError.html
		if(sqlId.equals("") || sqlName.equals("") || sqlPhone.equals("")) {
			request.getRequestDispatcher("/SupSignUpError.html").forward(request, response);	
		}
		
		// 設定資料庫連線SQL指令
		String sql = "insert into supplier(su_num,su_name,su_phone)" +
					 "values(\""+ sqlId + "\",\"" + sqlName + "\",\"" + sqlPhone + "\")";
		
		// 設定Session
		HttpSession session = request.getSession();
		if(session.getAttribute("menu") == "true") {
			out.println("<div style=\"text-align:center;\">"
					  + "<h3>系統訊息:</h3>"
					  + "</div>");
		} else { 
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
		// 呼叫執行ResultSQL.java
		ResultSQL result = new ResultSQL(conn,sql);
		
		out.println("<html>"
				  + "<head>"
				  + "<link href=\"css/all.css\" rel=\"stylesheet\" type=\"text/css\" />"
				  + "<title>建檔結果</title>"
				  + "</head>"
				  + "<body>"
				  + "<div style=\"text-align:center;\">");
		out.println(result);
		out.println("<p></p>");
		out.println("<input onclick=\"javascript:location.href='SupSignUp.html'\" type=\"button\" value=\"返回上一頁\">");
		out.println("<input onclick=\"javascript:location.href='menu.html'\" type=\"button\" value=\"回主選單\">");
		out.println("</div></body></html>");
	}
	
	// 不再使用時，則關閉。
	public void destroy() {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch(SQLException ignored) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
