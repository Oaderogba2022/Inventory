package ie.atu.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InventoryService {

    @Autowired
    private InventoryServiceClient inventoryServiceClient; // Feign client for communication

    // Retrieve inventory item by ID using Feign client
    public InventoryItem getInventoryItemById(String productId) {
        return inventoryServiceClient.getInventoryItem(productId);
    }

    // Add inventory item using Feign client
    public void addInventoryItem(InventoryItem item) {
        inventoryServiceClient.addInventoryItem(item);
    }

}
