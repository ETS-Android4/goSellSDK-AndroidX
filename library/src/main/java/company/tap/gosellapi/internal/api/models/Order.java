package company.tap.gosellapi.internal.api.models;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * The type Order.
 */
public final class Order implements Serializable {

    @SerializedName("id")
    @Expose
    @Nullable private String id;

    /**
     * Instantiates a new Order.
     *
     * @param id the id
     */
    public Order(String id) {
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }
}
