package ie.atu.inventory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;

@RestController
public class InventoryController {

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @GetMapping("/inventory/{productId}")
    public InventoryItem getInventoryItem(@PathVariable String productId) {
        return inventoryServiceClient.getInventoryItem(productId);
    }

    @PostMapping("/inventory/add")
    public String addInventoryItem(@RequestBody InventoryItem item) {
        inventoryServiceClient.addInventoryItem(item);
        return "Item added to inventory: Product ID - " + item.getProductId();
    }


}
