package CodeEnforcements.Admin;

import java.util.ArrayList;
import java.util.List;

import CodeEnforcements.Admin.models.Policy;

public class AdminApiController implements AdminApi {

    @Override
    public List<Policy> getAllPolicies(){
        Policy policy = new Policy();
        ArrayList<Policy> policies = new ArrayList<>();
        policies.add(policy);
        
        return policies;
    }
    
}
