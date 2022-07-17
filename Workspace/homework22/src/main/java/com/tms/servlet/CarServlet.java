package com.tms.servlet;

import com.tms.car.DBCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

@WebServlet("/cars")
public class CarServlet extends HttpServlet {

    private final DBCarService dbCarService = new DBCarService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();
        if (params.containsKey("id")) {
            resp.getWriter().println(
                    dbCarService.findCarById(
                            Integer.parseInt(params.get("id")[0])
                    )
            );
        } else {
            resp.getWriter().println(dbCarService.findAllCars());
        }
        addToResponseCookieWithLastAccessedTime(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String carBrand = req.getParameter("carBrand");
        if (carBrand != null) {
            dbCarService.createCar(carBrand);
        }
        resp.getWriter().println(dbCarService.findAllCars());
        addToResponseCookieWithLastAccessedTime(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();
        if (params.containsKey("id") && params.containsKey("carBrand")) {
            dbCarService.updateCar(
                    Integer.parseInt(params.get("id")[0]),
                    params.get("carBrand")[0]
            );
            resp.getWriter().println(dbCarService.findAllCars());
        }
        addToResponseCookieWithLastAccessedTime(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();
        if (params.containsKey("id")) {
            dbCarService.deleteCar(
                    Integer.parseInt(params.get("id")[0])
            );
            resp.getWriter().println(dbCarService.findAllCars());
        }
        addToResponseCookieWithLastAccessedTime(req, resp);
    }

    private void addToResponseCookieWithLastAccessedTime(HttpServletRequest req, HttpServletResponse resp) {
        long lastAccessedTime = req.getSession().getLastAccessedTime();
        LocalDateTime date = Instant.ofEpochMilli(lastAccessedTime)
                .atZone(
                        ZoneId.systemDefault()
                ).toLocalDateTime();
        resp.addCookie(new Cookie("lastAccessedTime", date.toString().replace(":", "_")));
    }
}
