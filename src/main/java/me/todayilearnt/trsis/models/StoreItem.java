package me.todayilearnt.trsis.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.List;

@Entity("store_item")
public class StoreItem {
    @Id
    private ObjectId id;
    private String name;
    private Integer quantity;

    public StoreItem() { }

    public StoreItem(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id.toString();
    }

    public String getName() {
        return name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getUpdateHref() { return "/update?id="+id.toString(); }
    public String getItemHref() { return "/item?id="+id.toString(); }
    public String getRemoveHref() { return "/remove?id="+id.toString();}

}

