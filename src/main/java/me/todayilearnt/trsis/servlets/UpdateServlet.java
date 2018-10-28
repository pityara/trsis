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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

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
        req.getRequestDispatcher("/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name").toString();
        Integer quantity = Integer.parseInt(req.getParameter("quantity").toString());
        ObjectId id = new ObjectId(req.getParameter("id").toString());
        StoreItem item = store.get(StoreItem.class, id);
        item.setName(name);
        item.setQuantity(quantity);
        store.save(item);

        resp.sendRedirect("/");
    }

}