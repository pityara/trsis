package me.todayilearnt.trsis.servlets;

import me.todayilearnt.trsis.datasources.MongoConnection;
import me.todayilearnt.trsis.models.StoreItem;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/item")
public class ItemServlet extends HttpServlet {
    private Datastore store;

    @Override
    public void init() {
        store = MongoConnection.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
        StoreItem item = store.get(StoreItem.class, new ObjectId(id));
        req.setAttribute("item", item);
        req.getRequestDispatcher("/item.jsp").forward(req, resp);
    }
}
