package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by comer on 15.06.2017.
 */
@WebServlet(name = "CookieWithServlet",urlPatterns = {"/CookieWithServlet"})
public class CookieWithServlet extends HttpServlet{

@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
try {

    Cookie c1 = new Cookie("arkadas", "Ozgur");
    Cookie c2 = new Cookie("arkadas2", "Emre");
// Burada cookie lerimizi tanımladık. Name ve değerini girdik.

    response.addCookie(c1);
    response.addCookie(c2);
    // response ile cookie lerimizi ekledik.

    response.addHeader("Set-Cookie","arkadas3-Umit Arslan");// addheader ile de cookie ekleyebiliyoruz.
    Cookie[] cookie=request.getCookies();
    if (cookie!=null)
    {
        for (Cookie c:cookie)
        {
            System.out.println("Cookie adı"+ " "+ c.getName()+  " "+ "Cookie değeri"+ " " +c.getValue());
            //Bütün cookie leri name ve değerini konsola yazdırdık.
        }
    }
}
    catch (Exception e)
    {e.printStackTrace();
}
}
}
