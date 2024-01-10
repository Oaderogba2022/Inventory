package ie.atu.inventory;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@FeignClient(name = "inventory-service", url = "http://localhost:8080")
public interface InventoryServiceClient {

    @GetMapping("/inventory/{productId}")
    InventoryItem getInventoryItem(@PathVariable String productId);

    @PostMapping("/inventory/add")
    void addInventoryItem(@RequestBody InventoryItem item);
}

