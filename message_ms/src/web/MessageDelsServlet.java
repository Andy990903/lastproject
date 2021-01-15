package web;

import dao.MessageDao;
import vo.ResultVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deletes")
public class MessageDelsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ids = req.getParameter("ids");
        try {
            new MessageDao().deletes(ids.split(","));
            resp.getWriter().write(ResultVO.ok(1).toJSON());
        } catch (Exception exception) {
            exception.printStackTrace();
            resp.getWriter().write(ResultVO.err(2, exception.getMessage()).toJSON());
        }
    }
}
