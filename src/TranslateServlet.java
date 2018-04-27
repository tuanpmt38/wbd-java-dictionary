import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", urlPatterns = "/translate")
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String ,String> listdictionnary = new HashMap<>();
        listdictionnary.put("book","quyển sách");
        listdictionnary.put("pen","cái bút");
        listdictionnary.put("computer","máy tính");
        listdictionnary.put("hello","xin ch");
        listdictionnary.put("cat ","con mèo");
        listdictionnary.put("dog","con chó");

        String input = request.getParameter("txtSearch");

        PrintWriter printWriter = response.getWriter();
        String result = listdictionnary.get(input);
        printWriter.println("<html>");
        if(input == null){
            printWriter.println("ko thấy từ cần tim ");
        }else{
            printWriter.println("search: "+input );
            printWriter.println("result: "+result );


        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
