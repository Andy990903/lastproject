package web;

import entity.MessageBean;
import dao.MessageDao;
import vo.ResultVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAll")
public class MessageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<MessageBean> messageBeans = new MessageDao().listAll();
            resp.getWriter().write(ResultVO.ok(messageBeans).toJSON());
        } catch (Exception exception) {
            exception.printStackTrace();
            resp.getWriter().write(ResultVO.err(222, exception.getMessage()).toJSON());
        }
    }
}
