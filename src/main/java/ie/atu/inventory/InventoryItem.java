package ie.atu.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InventoryItem {
    private String productId;
    private String productName;
    private int quantity;
}
