package CodeEnforcements.Admin;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import CodeEnforcements.Admin.models.Policy;

public interface AdminApi {
    
    @GetMapping("/policies")
    List<Policy> getAllPolicies();


}
