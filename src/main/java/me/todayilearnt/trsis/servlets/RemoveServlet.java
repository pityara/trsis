package me.todayilearnt.trsis.servlets;

import me.todayilearnt.trsis.datasources.MongoConnection;
import me.todayilearnt.trsis.models.StoreItem;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/remove")
public class RemoveServlet extends HttpServlet {

    private Datastore store;

    @Override
    public void init() {
        store = MongoConnection.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
        Query<StoreItem> query = store .createQuery(StoreItem.class);
        query.field("_id").equals(id);
        store.findAndDelete(query);
        resp.sendRedirect("/");
    }

}