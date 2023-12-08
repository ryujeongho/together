package com.sh.together;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class Jjaejun2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().println("아아 마이크 테스트");
        resp.getWriter().println("하나 둘 삼 넷");
        resp.getWriter().println("제 이름은 이재준입니다.");
        resp.getWriter().println("26살이고");
        resp.getWriter().println("갓 졸업해서 아직은 백수입니다");
        resp.getWriter().println("잘부탁드리겠습니다.");
        resp.getWriter().println("사실 더 쓸건 없습니다.");
        resp.getWriter().println("🙇‍♂️");

    }
}
